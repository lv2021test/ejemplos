package org.backend.model.summary;

import java.io.Serializable;
import java.util.Date;
import java.util.List;



public class Root implements Serializable{

    public String ID;
    public String Message;
    public Global Global; 
    public List<Country> Countries;
    public Date Date;
    
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public Global getGlobal() {
		return Global;
	}
	public void setGlobal(Global global) {
		Global = global;
	}
	public List<Country> getCountries() {
		return Countries;
	}
	public void setCountries(List<Country> countries) {
		Countries = countries;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
    
    
    
}

