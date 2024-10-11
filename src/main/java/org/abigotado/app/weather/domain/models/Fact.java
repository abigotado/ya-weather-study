package org.abigotado.app.weather.domain.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fact{

	@JsonProperty("icon")
	private String icon;

	@JsonProperty("source")
	private String source;

	@JsonProperty("wind_gust")
	private Object windGust;

	@JsonProperty("wind_angle")
	private int windAngle;

	@JsonProperty("is_thunder")
	private boolean isThunder;

	@JsonProperty("uv_index")
	private int uvIndex;

	@JsonProperty("temp_water")
	private int tempWater;

	@JsonProperty("prec_type")
	private int precType;

	@JsonProperty("season")
	private String season;

	@JsonProperty("humidity")
	private int humidity;

	@JsonProperty("pressure_pa")
	private int pressurePa;

	@JsonProperty("wind_speed")
	private Object windSpeed;

	@JsonProperty("obs_time")
	private int obsTime;

	@JsonProperty("polar")
	private boolean polar;

	@JsonProperty("temp")
	private int temp;

	@JsonProperty("visibility")
	private int visibility;

	@JsonProperty("pressure_mm")
	private int pressureMm;

	@JsonProperty("cloudness")
	private int cloudness;

	@JsonProperty("wind_dir")
	private String windDir;

	@JsonProperty("feels_like")
	private int feelsLike;

	@JsonProperty("uptime")
	private int uptime;

	@JsonProperty("condition")
	private String condition;

	@JsonProperty("prec_strength")
	private int precStrength;

	@JsonProperty("daytime")
	private String daytime;

	@JsonProperty("prec_prob")
	private int precProb;

	public String getIcon(){
		return icon;
	}

	public String getSource(){
		return source;
	}

	public Object getWindGust(){
		return windGust;
	}

	public int getWindAngle(){
		return windAngle;
	}

	public boolean isIsThunder(){
		return isThunder;
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

	public String getSeason(){
		return season;
	}

	public int getHumidity(){
		return humidity;
	}

	public int getPressurePa(){
		return pressurePa;
	}

	public Object getWindSpeed(){
		return windSpeed;
	}

	public int getObsTime(){
		return obsTime;
	}

	public boolean isPolar(){
		return polar;
	}

	public int getTemp(){
		return temp;
	}

	public int getVisibility(){
		return visibility;
	}

	public int getPressureMm(){
		return pressureMm;
	}

	public int getCloudness(){
		return cloudness;
	}

	public String getWindDir(){
		return windDir;
	}

	public int getFeelsLike(){
		return feelsLike;
	}

	public int getUptime(){
		return uptime;
	}

	public String getCondition(){
		return condition;
	}

	public int getPrecStrength(){
		return precStrength;
	}

	public String getDaytime(){
		return daytime;
	}

	public int getPrecProb(){
		return precProb;
	}
}