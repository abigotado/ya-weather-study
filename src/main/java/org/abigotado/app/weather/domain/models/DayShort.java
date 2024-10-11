package org.abigotado.app.weather.domain.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayShort{

	@JsonProperty("polar")
	private boolean polar;

	@JsonProperty("temp")
	private int temp;

	@JsonProperty("icon")
	private String icon;

	@JsonProperty("pressure_mm")
	private int pressureMm;

	@JsonProperty("cloudness")
	private Object cloudness;

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

	@JsonProperty("fresh_snow_mm")
	private int freshSnowMm;

	@JsonProperty("condition")
	private String condition;

	@JsonProperty("temp_min")
	private int tempMin;

	@JsonProperty("temp_water")
	private int tempWater;

	@JsonProperty("prec_type")
	private int precType;

	@JsonProperty("humidity")
	private int humidity;

	@JsonProperty("pressure_pa")
	private int pressurePa;

	@JsonProperty("_source")
	private String source;

	@JsonProperty("prec_strength")
	private int precStrength;

	@JsonProperty("wind_speed")
	private int windSpeed;

	@JsonProperty("daytime")
	private String daytime;

	@JsonProperty("prec_mm")
	private int precMm;

	@JsonProperty("prec_prob")
	private int precProb;

	@JsonProperty("uv_index")
	private int uvIndex;

	@JsonProperty("biomet")
	private Biomet biomet;

	public boolean isPolar(){
		return polar;
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

	public Object getCloudness(){
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

	public int getFreshSnowMm(){
		return freshSnowMm;
	}

	public String getCondition(){
		return condition;
	}

	public int getTempMin(){
		return tempMin;
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

	public String getSource(){
		return source;
	}

	public int getPrecStrength(){
		return precStrength;
	}

	public int getWindSpeed(){
		return windSpeed;
	}

	public String getDaytime(){
		return daytime;
	}

	public int getPrecMm(){
		return precMm;
	}

	public int getPrecProb(){
		return precProb;
	}

	public int getUvIndex(){
		return uvIndex;
	}

	public Biomet getBiomet(){
		return biomet;
	}
}