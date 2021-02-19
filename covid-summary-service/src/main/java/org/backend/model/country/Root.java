package org.backend.model.country;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Root implements Serializable {


	private static final long serialVersionUID = 1L;
	public String ID;
    public String Country;
    public String CountryCode;
    public String Province;
    public String City;
    public String CityCode;
    public String Lat;
    public String Lon;
    public int Confirmed;
    public int Deaths;
    public int Recovered;
    public int Active;
    @JsonProperty("Date") 
    public Date date;
    
    
    
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public String getProvince() {
		return Province;
	}
	public void setProvince(String province) {
		Province = province;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCityCode() {
		return CityCode;
	}
	public void setCityCode(String cityCode) {
		CityCode = cityCode;
	}
	public String getLat() {
		return Lat;
	}
	public void setLat(String lat) {
		Lat = lat;
	}
	public String getLon() {
		return Lon;
	}
	public void setLon(String lon) {
		Lon = lon;
	}
	public int getConfirmed() {
		return Confirmed;
	}
	public void setConfirmed(int confirmed) {
		Confirmed = confirmed;
	}
	public int getDeaths() {
		return Deaths;
	}
	public void setDeaths(int deaths) {
		Deaths = deaths;
	}
	public int getRecovered() {
		return Recovered;
	}
	public void setRecovered(int recovered) {
		Recovered = recovered;
	}
	public int getActive() {
		return Active;
	}
	public void setActive(int active) {
		Active = active;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
    
    
    
}

