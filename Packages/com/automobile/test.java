package com.automobile.twowheeler;
import com.automobile.FourWheeler.*;

public class test {
	
	public static void main(String[]args) {
		Honda honda = new Honda();
		Hero hero = new Hero();
		
		Logan logan = new Logan();
		Ford ford = new Ford();
		
		System.out.println("Speed of honda is "+honda.getSpeed()+"kmph");
		honda.cdplayer();
		
		System.out.println("Speed of hero is "+hero.getSpeed()+"kmph");
		hero.radio();
		
		System.out.println("\nSpeed of Logan is "+logan.speed()+"kmph");
		logan.gps();
		
		System.out.println("Speed of Ford is "+ford.speed()+"kmph");
		ford.tempControl();
	}

}
