package com.intraedge.project.prok.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intraedge.project.prok.domain.Tag;
import com.intraedge.project.prok.repositories.TagRepository;

@Service
public class TagService {

	@Autowired
	private TagRepository tagRepository;

	public List<Tag> getTags() {
		List<Tag> foundTags = tagRepository.findAll();
		return foundTags;
	}

	public Tag findTagBy_id(String _id) {
		Tag foundTag = tagRepository.findTagBy_id(_id);
		return foundTag;
	}

	public Tag createTag(Tag newTag) {
		Tag createdTag = tagRepository.save(newTag);
		return createdTag;
	}

	public Tag updateTagBy_id(Tag tag) {
		Tag updatedTag = tagRepository.save(tag);
		return updatedTag;
	}

	public void deleteTagBy_id(String _id) {
		Tag foundTag = tagRepository.findTagBy_id(_id);
		tagRepository.delete(foundTag);
	}

}
