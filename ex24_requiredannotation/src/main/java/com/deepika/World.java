package com.deepika;

import org.springframework.beans.factory.annotation.Required;

public class World {
	private String country1;
	private String country2;
	
	
	public void setCountry1(String country1) {
		this.country1 = country1;
	}
	@Required
	public void setCountry2(String country2) {
		this.country2 = country2;
	}
	@Override
	public String toString() {
		return "World [country1=" + country1 + ", country2=" + country2 + "]";
	}
	
}
