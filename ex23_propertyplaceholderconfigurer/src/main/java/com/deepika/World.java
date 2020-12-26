package com.deepika;

public class World {
	private String country1;
	private String country2;
	
	public void setCountry1(String country1) {
		this.country1 = country1;
	}
	public void setCountry2(String country2) {
		this.country2 = country2;
	}
	@Override
	public String toString() {
		return "World [country1=" + country1 + ", country2=" + country2 + "]";
	}
	
}
