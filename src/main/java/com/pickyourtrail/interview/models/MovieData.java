package com.pickyourtrail.interview.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieData {

	@JsonProperty("Title")
	private String Title;

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}
	
}
