package com.automobile.FourWheeler;

public class Ford extends com.automobile.Vehicle{
	
	public String getModelName() {
		return("Ford");
	}
	
	public String getRegistrationNumber() {
		return("KA39AE1001");
	}
	
	public String getOwnerName() {
		return("GHY");
	}
	
	public int speed() {
		return(90);
	}
	
	public void tempControl() {
		System.out.println("Controlling temperature");
	}

}
