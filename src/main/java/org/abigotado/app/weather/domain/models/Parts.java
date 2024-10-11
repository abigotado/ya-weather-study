package org.abigotado.app.weather.domain.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Parts {

	@JsonProperty("night")
	private Night night;

	@JsonProperty("day_short")
	private DayShort dayShort;

	@JsonProperty("evening")
	private Evening evening;

	@JsonProperty("day")
	private Day day;

	@JsonProperty("night_short")
	private NightShort nightShort;

	@JsonProperty("morning")
	private Morning morning;

	public Night getNight(){
		return night;
	}

	public DayShort getDayShort(){
		return dayShort;
	}

	public Evening getEvening(){
		return evening;
	}

	public Day getDay(){
		return day;
	}

	public NightShort getNightShort(){
		return nightShort;
	}

	public Morning getMorning(){
		return morning;
	}
}