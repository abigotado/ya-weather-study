package org.abigotado.app.weather.domain.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Forecast {

	@JsonProperty("date")
	private String date;

	@JsonProperty("rise_begin")
	private String riseBegin;

	@JsonProperty("sunrise")
	private String sunrise;

	@JsonProperty("hours")
	private List<Hour> hours;

	@JsonProperty("week")
	private int week;

	@JsonProperty("moon_text")
	private String moonText;

	@JsonProperty("date_ts")
	private int dateTs;

	@JsonProperty("sunset")
	private String sunset;

	@JsonProperty("parts")
	private Parts parts;

	@JsonProperty("set_end")
	private String setEnd;

	@JsonProperty("moon_code")
	private int moonCode;

	@JsonProperty("biomet")
	private Biomet biomet;

	public String getDate(){
		return date;
	}

	public String getRiseBegin(){
		return riseBegin;
	}

	public String getSunrise(){
		return sunrise;
	}

	public List<Hour> getHours(){
		return hours;
	}

	public int getWeek(){
		return week;
	}

	public String getMoonText(){
		return moonText;
	}

	public int getDateTs(){
		return dateTs;
	}

	public String getSunset(){
		return sunset;
	}

	public Parts getParts(){
		return parts;
	}

	public String getSetEnd(){
		return setEnd;
	}

	public int getMoonCode(){
		return moonCode;
	}

	public Biomet getBiomet(){
		return biomet;
	}
}