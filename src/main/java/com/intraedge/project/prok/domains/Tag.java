package com.intraedge.project.prok.domains;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tags")
public class Tag {
	
	@Id
	private String _id;
	private String tagName;
	private String tagDescription;
	
	public Tag() {}
	
	public Tag(String _id, String tagName, String tagDescription) {
		super();
		this._id = _id;
		this.tagName = tagName;
		this.tagDescription = tagDescription;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public String getTagDescription() {
		return tagDescription;
	}
	public void setTagDescription(String tagDescription) {
		this.tagDescription = tagDescription;
	}

	@Override
	public String toString() {
		return "Tag [_id=" + _id + ", tagName=" + tagName + ", tagDescription=" + tagDescription + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((_id == null) ? 0 : _id.hashCode());
		result = prime * result + ((tagDescription == null) ? 0 : tagDescription.hashCode());
		result = prime * result + ((tagName == null) ? 0 : tagName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tag other = (Tag) obj;
		if (_id == null) {
			if (other._id != null)
				return false;
		} else if (!_id.equals(other._id))
			return false;
		if (tagDescription == null) {
			if (other.tagDescription != null)
				return false;
		} else if (!tagDescription.equals(other.tagDescription))
			return false;
		if (tagName == null) {
			if (other.tagName != null)
				return false;
		} else if (!tagName.equals(other.tagName))
			return false;
		return true;
	}
	
	

}
