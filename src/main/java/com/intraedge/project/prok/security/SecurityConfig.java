package com.intraedge.project.prok.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import com.intraedge.project.prok.utilities.Utility;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(
		securedEnabled=true,
		jsr250Enabled=true,
		prePostEnabled=true
		)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	String auth = Utility.API_VERSION + Utility.SIGN_UP_URLS;
	
	@Autowired
	private SessionAuthenticationEntryPoint unauthorizedHandler;

	/* (non-Javadoc)
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.HttpSecurity)
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.cors().and().csrf().disable()
			.exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()
			.sessionManagement()
			.sessionCreationPolicy(SessionCreationPolicy.ALWAYS)
			.and()
			.headers().frameOptions().sameOrigin() // to enable H2 DB for others to use
			.and()
			.authorizeRequests()
			.antMatchers(
					"/",
					"/favicon.ico",
					"/**/*.png",
					"/**/*.gif",
					"/**/*.svg",
					"/**/*.jpg",
					"/**/*.html",
					"/**/*.css",
					"/**/*.js"
				).permitAll()
			.antMatchers(auth).permitAll()
			.antMatchers(Utility.H2_URL).permitAll()
			.anyRequest().authenticated();
	}
	
	
}
