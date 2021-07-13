package mod2;

import java.util.*;

public class VideoStore {
	
	Video[] store = new Video[1];
	
	void addVideo(String name) {
		
		Video v = new Video(name);
		List<Video> arrlist = new ArrayList<Video>(Arrays.asList(store));
		
		arrlist.add(v);
		
		store = arrlist.toArray(store);
		
	}
	
	void doCheckout(String name) {
		for(int i=1;i<store.length;i++) {
			if(store[i].getName().equals(name)) {
				store[i].doCheckout();
			}
		}
	}
	
	void doReturn(String name) {
		for(int i=1;i<store.length;i++) {
			if(store[i].getName().equals(name)) {
				store[i].doReturn();
			}
		}
	}
	
	void receiveRating(String name,int rating) {
		for(int i=1;i<store.length;i++) {
			if(store[i].getName().equals(name)) {
				store[i].receiveRating(rating);
			}
		}
	}
	
	void listInventory() {
		System.out.print("Video Name   Checkout Status   Rating\n");
		for(int i=1;i<store.length;i++) {
			System.out.print(store[i].getName()+"\t\t"+store[i].getCheckout()+"\t\t"+store[i].rating+"\n");
			
		}
	}
}
