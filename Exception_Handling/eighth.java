package Exception_Handling;

public class eighth {
	
	public static class MyClass extends Exception{
		MyClass(String g){
			super(g);
		}
	}
	
	public static void main(String[] args) {
		
		try {
		String name = args[0];
		String x = args[1];
		}catch(Exception e) {
			System.out.println(e);
			System.exit(0);
		}
		int age;
		String name = args[0];
		String x = args[1];
		
		try {
			 age = Integer.parseInt(x);
			 if(age<18 || age >=60) {
					throw new MyClass("Age not valid");
				}
			 System.out.println("Name and age are : "+name+" " +age);
		}catch(MyClass ex) {
			System.out.println(ex);
			System.exit(0);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
			System.exit(0);
		}
		
		
		
		
	}

}
