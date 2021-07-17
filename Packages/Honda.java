package com.automobile.twowheeler;

public class Honda extends com.automobile.Vehicle{
	public String getModelName() {
		return("Honda");
	}
	
	public String getRegistrationNumber() {
		return("KA39AE1099");
	}
	
	public String getOwnerName() {
		return("XYZ");
	}
	
	public int getSpeed() {
		return(40);
	}
	
	public void cdplayer() {
		System.out.println("Playing CD player");
	}

}
