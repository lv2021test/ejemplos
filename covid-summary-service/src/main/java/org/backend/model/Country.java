package org.backend.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country implements Serializable {

	private static final long serialVersionUID = 1L;

    private int Confirmed;
    private int Deaths;
    private int Recovered;
    private int Active;
    @JsonProperty("Date") 
    private Date date;

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
