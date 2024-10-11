package org.abigotado.app.weather.domain.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather {

	@JsonProperty("now_dt")
	private String nowDt;

	@JsonProperty("fact")
	private Fact fact;

	@JsonProperty("now")
	private int now;

	@JsonProperty("info")
	private Info info;

	@JsonProperty("forecasts")
	private List<Forecast> forecasts;

	public String getNowDt(){
		return nowDt;
	}

	public Fact getFact(){
		return fact;
	}

	public int getNow(){
		return now;
	}

	public Info getInfo(){
		return info;
	}

	public List<Forecast> getForecasts(){
		return forecasts;
	}
}