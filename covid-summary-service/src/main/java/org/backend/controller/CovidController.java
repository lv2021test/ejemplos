package org.backend.controller;



import java.util.ArrayList;
import java.util.List;

import org.backend.model.Summary;
import org.backend.model.summary.Country;
import org.backend.model.summary.Root;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.client.UnknownHttpStatusCodeException;

@RestController
@RequestMapping("/covid")
public class CovidController {
	private static final String URL_API_SUMMARY =  "https://api.covid19api.com/summary";
	private static final String URL_API_COUNTRY =  "https://api.covid19api.com/country/";
	private static final Logger logger = LoggerFactory.getLogger(CovidController.class);
	
	
	
	@GetMapping("/paises")
	public List<Summary> summaryCountry() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Root> response  = null;
		

		List<Summary> summary = new ArrayList<Summary>();
		Summary newSummary = null;
		try {
			response  =   restTemplate.getForEntity(URL_API_SUMMARY, Root.class);	
		} catch(HttpClientErrorException e) {
			//in case of HTTP status 4xx
			logger.error("CovidController.resumeCountry", e);
		} catch(HttpServerErrorException e) {
			//in case of HTTP status 5xx
			logger.error("CovidController.resumeCountry", e);
		} catch(UnknownHttpStatusCodeException e) {
			//in case of an unknown HTTP status
			logger.error("CovidController.resumeCountry", e);
		} 

		
		if(response!=null) {
			logger.info("");
			logger.info("GET All StatusCode = " + response.getStatusCode());
			logger.info("GET All Headers = " + response.getHeaders());
	
			if (response.getBody()!=null && response.getBody().getCountries() != null)
			for(Country country: response.getBody().getCountries()) {
				newSummary = new Summary();
				newSummary.setCountry(country.getCountry());
				newSummary.setTotalConfirmed(country.getTotalConfirmed());
				newSummary.setTotalDeaths(country.getTotalDeaths());
				newSummary.setTotalRecovered(country.getTotalRecovered());
				summary.add(newSummary);
			}
		}

		return summary;
	}
	
	
	
	
	@GetMapping("/pais/{name}")
	public List<org.backend.model.Country> getCountry(@PathVariable  String name) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<org.backend.model.country.Root[]> response  = null;
		logger.info(">>>>>>>> " + name);

		List<org.backend.model.Country> countryList= new ArrayList<org.backend.model.Country>();
		org.backend.model.Country newRoot = null;
		try {
			response  =   restTemplate.getForEntity(URL_API_COUNTRY + name, org.backend.model.country.Root[].class);	
		} catch(HttpClientErrorException e) {
			//in case of HTTP status 4xx
			logger.error("CovidController.resumeCountry", e);
		} catch(HttpServerErrorException e) {
			//in case of HTTP status 5xx
			logger.error("CovidController.resumeCountry", e);
		} catch(UnknownHttpStatusCodeException e) {
			//in case of an unknown HTTP status
			logger.error("CovidController.resumeCountry", e);
		} 

		
		if(response!=null) {
			logger.info("");
			logger.info("GET All StatusCode = " + response.getStatusCode());
			logger.info("GET All Headers = " + response.getHeaders());
			
			if( response.getBody()!=null ) 
				for(org.backend.model.country.Root root : response.getBody()) {
					newRoot = new org.backend.model.Country();
					newRoot.setActive(root.getActive());
					newRoot.setConfirmed(root.getConfirmed());
					newRoot.setDate(root.getDate());
					newRoot.setDeaths(root.getDeaths());
					newRoot.setRecovered(root.getRecovered());
					countryList.add(newRoot);
					
				}

		}

		return countryList;
	}
	
	
	
	
	
	
}
