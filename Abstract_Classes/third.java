package Abstract_Classes;

public class third {
	
	public static abstract class Instrument{
		
		public abstract void play() ;
		
	}
	
	public static class Piano extends Instrument{
		public void play() {
			System.out.println("Piano is playing tan tan tan tan");
		}
	}
	
	public static class Flute extends Instrument{
		public void play() {
			System.out.println("Flute is playing toot toot toot toot");
		}
	}
	
	public static class Guitar extends Instrument{
		public void play() {
			System.out.println("Guitar is playing tin tin tin tin");
		}
	}
	
	public static void main(String[] args) {
		Instrument[] it = new Instrument[10];
		
		for(int i=0;i<10;i++) {
			int b = (int)(Math.random()*(3-1+1)+1);
			switch(b) {
			case 1:
				it[i] = new Piano();
				break;
			case 2 :
				it[i] = new Flute();
				break;
			case 3:
				it[i] = new Guitar();
				break;
			}
		}
		
		for(int i=0;i<10;i++) {
			it[i].play();
		}
		
		for(int i=0;i<10;i++) {
			if(it[i] instanceof Piano) {
				System.out.println("Piano Object");
			}
			else if(it[i] instanceof Flute) {
				System.out.println("Flute Object");
			}
			else {
				System.out.println("Guitar Object");
			}
		}
	}

}
