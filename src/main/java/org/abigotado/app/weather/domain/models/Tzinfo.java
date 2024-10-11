package org.abigotado.app.weather.domain.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tzinfo{

	@JsonProperty("dst")
	private boolean dst;

	@JsonProperty("offset")
	private int offset;

	@JsonProperty("name")
	private String name;

	@JsonProperty("abbr")
	private String abbr;

	public boolean isDst(){
		return dst;
	}

	public int getOffset(){
		return offset;
	}

	public String getName(){
		return name;
	}

	public String getAbbr(){
		return abbr;
	}
}