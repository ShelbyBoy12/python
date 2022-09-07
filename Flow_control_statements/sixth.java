package Flow_control_statements;

public class sixth {
	
	public static void main(String[] args) {
		
		String gender = args[0];
		int age = Integer.parseInt(args[1]);
		double POI = 0.0;
		String m = "Male";
		String f = "Female";
		
		if(gender.equals(f) && age>1 && age<58) 
			POI = 8.2;
		else if(gender.equals(f) && age>59 && age<100)
			POI = 9.2;
		else if(gender.equals(m) && age>1 && age<58)
			POI = 8.4;
		else if(gender.equals(m) && age>59 && age<100)
			POI = 10.5;
		
		System.out.println("Percentage of interest is : "+POI+"%");
		
			
	}

}
