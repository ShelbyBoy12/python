package com.automobile.FourWheeler;

public class Logan extends com.automobile.Vehicle{
	
	public String getModelName() {
		return("Logan");
	}
	
	public String getRegistrationNumber() {
		return("KA39AE1000");
	}
	
	public String getOwnerName() {
		return("DEF");
	}
	
	public int speed() {
		return(60);
	}
	public void gps() {
		System.out.println("Controlling gps");
	}
	

}
