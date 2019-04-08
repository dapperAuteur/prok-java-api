package com.intraedge.project.prok.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.intraedge.project.prok.domains.Tag;

public interface TagRepository extends MongoRepository<Tag, String> {
	Tag findTagBy_id(String _id);
}
