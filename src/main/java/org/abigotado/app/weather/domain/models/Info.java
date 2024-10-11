package org.abigotado.app.weather.domain.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Info{

	@JsonProperty("nr")
	private boolean nr;

	@JsonProperty("ns")
	private boolean ns;

	@JsonProperty("f")
	private boolean f;

	@JsonProperty("def_pressure_mm")
	private int defPressureMm;

	@JsonProperty("_h")
	private boolean h;

	@JsonProperty("lon")
	private Object lon;

	@JsonProperty("zoom")
	private int zoom;

	@JsonProperty("nsr")
	private boolean nsr;

	@JsonProperty("n")
	private boolean n;

	@JsonProperty("url")
	private String url;

	@JsonProperty("tzinfo")
	private Tzinfo tzinfo;

	@JsonProperty("p")
	private boolean p;

	@JsonProperty("def_pressure_pa")
	private int defPressurePa;

	@JsonProperty("lat")
	private Object lat;

	public boolean isNr(){
		return nr;
	}

	public boolean isNs(){
		return ns;
	}

	public boolean isF(){
		return f;
	}

	public int getDefPressureMm(){
		return defPressureMm;
	}

	public boolean isH(){
		return h;
	}

	public Object getLon(){
		return lon;
	}

	public int getZoom(){
		return zoom;
	}

	public boolean isNsr(){
		return nsr;
	}

	public boolean isN(){
		return n;
	}

	public String getUrl(){
		return url;
	}

	public Tzinfo getTzinfo(){
		return tzinfo;
	}

	public boolean isP(){
		return p;
	}

	public int getDefPressurePa(){
		return defPressurePa;
	}

	public Object getLat(){
		return lat;
	}
}