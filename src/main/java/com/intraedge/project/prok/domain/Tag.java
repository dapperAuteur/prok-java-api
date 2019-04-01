package com.intraedge.project.prok.domain;

public class Tag {
	
	private String tagName;
	private String tagDescription;
	
	public Tag() {}
	
	public Tag(String tagName, String tagDescription) {
		super();
		this.tagName = tagName;
		this.tagDescription = tagDescription;
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
		return "Tag [tagName=" + tagName + ", tagDescription=" + tagDescription + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
