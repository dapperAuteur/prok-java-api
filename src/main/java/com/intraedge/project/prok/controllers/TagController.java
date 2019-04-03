package com.intraedge.project.prok.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intraedge.project.prok.domain.Tag;
import com.intraedge.project.prok.services.TagService;

@RestController
@RequestMapping("/tags")
public class TagController {

	@Autowired
	private TagService tagService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Tag> getTags() {
		List<Tag> tags = tagService.getTags();
		return tags;
	}

	@RequestMapping(value = "/{_id}", method = RequestMethod.GET)
	public Tag getTagBy_id(@PathVariable("_id") String _id) {
		return tagService.findTagBy_id(_id);
	}

	@RequestMapping(value = "/{_id}", method = RequestMethod.PATCH)
	public Tag modifyTagBy_id(@PathVariable("_id") String _id, @Valid @RequestBody Tag tag) {
		tag.set_id(_id);
		tagService.updateTagBy_id(tag);
		return tag;
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Tag createTag(@Valid @RequestBody Tag newTag) {
		Tag createdTag = tagService.createTag(newTag);
		return createdTag;
	}

	@RequestMapping(value = "/{_id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteTag(@PathVariable String _id) {
		tagService.deleteTagBy_id(_id);
		return new ResponseEntity<String>("Tag with ID: '" + _id + "' was deleted", HttpStatus.OK);
	}

}
