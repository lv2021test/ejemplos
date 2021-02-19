package org.backend.model;

import java.io.Serializable;


public class Summary implements Serializable{



	private static final long serialVersionUID = 1L;
	private String Country;
	private int TotalConfirmed;
	private int TotalDeaths;
	private int TotalRecovered;
	
	
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getTotalConfirmed() {
		return TotalConfirmed;
	}
	public void setTotalConfirmed(int totalConfirmed) {
		TotalConfirmed = totalConfirmed;
	}
	public int getTotalDeaths() {
		return TotalDeaths;
	}
	public void setTotalDeaths(int totalDeaths) {
		TotalDeaths = totalDeaths;
	}
	public int getTotalRecovered() {
		return TotalRecovered;
	}
	public void setTotalRecovered(int totalRecovered) {
		TotalRecovered = totalRecovered;
	}


}
