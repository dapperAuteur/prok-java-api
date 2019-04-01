package com.intraedge.project.prok.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.intraedge.project.prok.domain.Tag;

public interface TagRepository extends MongoRepository<Tag, String> {
	Tag findBy_id(ObjectId _id);
}
