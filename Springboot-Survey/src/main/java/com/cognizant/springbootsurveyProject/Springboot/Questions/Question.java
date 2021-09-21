package com.cognizant.springbootsurveyProject.Springboot.Questions;

import java.util.List;

public class Question {
	
	private String id;
	private String description;
	private String correctAnswers;
	private List<String> options;
	public Question(String id, String description, String correctAnswers, List<String> options) {
		super();
		this.id = id;
		this.description = description;
		this.correctAnswers = correctAnswers;
		this.options = options;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCorrectAnswers() {
		return correctAnswers;
	}
	public void setCorrectAnswers(String correctAnswers) {
		this.correctAnswers = correctAnswers;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", description=" + description + ", correctAnswers=" + correctAnswers
				+ ", options=" + options + "]";
		
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((correctAnswers == null) ? 0 : correctAnswers.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((options == null) ? 0 : options.hashCode());
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
		Question other = (Question) obj;
		if (correctAnswers == null) {
			if (other.correctAnswers != null)
				return false;
		} else if (!correctAnswers.equals(other.correctAnswers))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (options == null) {
			if (other.options != null)
				return false;
		} else if (!options.equals(other.options))
			return false;
		return true;
	}
	

}
