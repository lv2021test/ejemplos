package org.backend.model.summary;

import java.io.Serializable;
import java.util.Date;


public class Global  implements Serializable{

	public int NewConfirmed;
	public int TotalConfirmed;
	public int NewDeaths;
	public int TotalDeaths;
	public int NewRecovered;
	public int TotalRecovered;
	public Date Date;
	
	public int getNewConfirmed() {
		return NewConfirmed;
	}
	public void setNewConfirmed(int newConfirmed) {
		NewConfirmed = newConfirmed;
	}
	public int getTotalConfirmed() {
		return TotalConfirmed;
	}
	public void setTotalConfirmed(int totalConfirmed) {
		TotalConfirmed = totalConfirmed;
	}
	public int getNewDeaths() {
		return NewDeaths;
	}
	public void setNewDeaths(int newDeaths) {
		NewDeaths = newDeaths;
	}
	public int getTotalDeaths() {
		return TotalDeaths;
	}
	public void setTotalDeaths(int totalDeaths) {
		TotalDeaths = totalDeaths;
	}
	public int getNewRecovered() {
		return NewRecovered;
	}
	public void setNewRecovered(int newRecovered) {
		NewRecovered = newRecovered;
	}
	public int getTotalRecovered() {
		return TotalRecovered;
	}
	public void setTotalRecovered(int totalRecovered) {
		TotalRecovered = totalRecovered;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	
	
}
