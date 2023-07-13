package Abstract_Classes;

public class TestCompartment {
	
	public static void main(String[] args) {
		Compartment[] c = new Compartment[10];
		
		for(int i=0;i<10;i++) {
			int b = (int)(Math.random()*(4-1+1)+1);
			switch(b) {
			case 1 :
				c[i] = new FirstClass();
				break;
			case 2 :
				c[i] = new Ladies();
				break;
			case 3 :
				c[i] = new General();
				break;
			case 4 :
				c[i] = new Luggage();
				break;
			}
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(c[i].notice());
		}
	}

}
