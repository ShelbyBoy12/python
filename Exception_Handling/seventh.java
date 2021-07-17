package Exception_Handling;
import java.util.*;

public class seventh {
	
	public static class InvalidCountryException extends Exception{
		
		InvalidCountryException(String s){
			super(s);
		}
	}
	
	public static class UserRegistration{
		void registerUser(String username,String userCountry) {
			try {
			if(userCountry.equals("India")) {
				System.out.println("User registration done successfully");
			}
			else
				throw new InvalidCountryException("User Outside India cannot be registered");
			}catch(InvalidCountryException ex) {
				System.out.println(ex);
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the user name and country");
		
		Scanner sc = new Scanner(System.in);
		
		String u = sc.next();
		String c = sc.next();
		
		UserRegistration ur = new UserRegistration();
		ur.registerUser(u, c);
	}

}
