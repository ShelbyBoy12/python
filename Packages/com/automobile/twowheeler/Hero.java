package com.automobile.twowheeler;

public class Hero extends com.automobile.Vehicle{
	
	
	public String getModelName() {
		return("Hero");
	}
	
	public String getRegistrationNumber() {
		return("KA39AE1098");
	}
	
	public String getOwnerName() {
		return("ABCD");
	}
	
	public int getSpeed() {
		return(30);
	}
	
	public void radio() {
		System.out.println("Controlling the radio");
	}

}
