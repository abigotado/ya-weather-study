package org.abigotado.app.weather.domain.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Biomet{

	@JsonProperty("condition")
	private String condition;

	@JsonProperty("index")
	private int index;

	public String getCondition(){
		return condition;
	}

	public int getIndex(){
		return index;
	}
}