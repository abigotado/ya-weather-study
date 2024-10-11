package org.abigotado.app.weather.domain.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hour {

	@JsonProperty("hour_ts")
	private int hourTs;

	@JsonProperty("temp")
	private int temp;

	@JsonProperty("icon")
	private String icon;

	@JsonProperty("pressure_mm")
	private int pressureMm;

	@JsonProperty("cloudness")
	private int cloudness;

	@JsonProperty("prec_period")
	private int precPeriod;

	@JsonProperty("wind_dir")
	private String windDir;

	@JsonProperty("feels_like")
	private int feelsLike;

	@JsonProperty("wind_gust")
	private Object windGust;

	@JsonProperty("wind_angle")
	private int windAngle;

	@JsonProperty("condition")
	private String condition;

	@JsonProperty("hour")
	private String hour;

	@JsonProperty("uv_index")
	private int uvIndex;

	@JsonProperty("temp_water")
	private int tempWater;

	@JsonProperty("prec_type")
	private int precType;

	@JsonProperty("humidity")
	private int humidity;

	@JsonProperty("pressure_pa")
	private int pressurePa;

	@JsonProperty("prec_strength")
	private int precStrength;

	@JsonProperty("wind_speed")
	private Object windSpeed;

	@JsonProperty("prec_mm")
	private int precMm;

	@JsonProperty("prec_prob")
	private int precProb;

	public int getHourTs(){
		return hourTs;
	}

	public int getTemp(){
		return temp;
	}

	public String getIcon(){
		return icon;
	}

	public int getPressureMm(){
		return pressureMm;
	}

	public int getCloudness(){
		return cloudness;
	}

	public int getPrecPeriod(){
		return precPeriod;
	}

	public String getWindDir(){
		return windDir;
	}

	public int getFeelsLike(){
		return feelsLike;
	}

	public Object getWindGust(){
		return windGust;
	}

	public int getWindAngle(){
		return windAngle;
	}

	public String getCondition(){
		return condition;
	}

	public String getHour(){
		return hour;
	}

	public int getUvIndex(){
		return uvIndex;
	}

	public int getTempWater(){
		return tempWater;
	}

	public int getPrecType(){
		return precType;
	}

	public int getHumidity(){
		return humidity;
	}

	public int getPressurePa(){
		return pressurePa;
	}

	public int getPrecStrength(){
		return precStrength;
	}

	public Object getWindSpeed(){
		return windSpeed;
	}

	public int getPrecMm(){
		return precMm;
	}

	public int getPrecProb(){
		return precProb;
	}
}