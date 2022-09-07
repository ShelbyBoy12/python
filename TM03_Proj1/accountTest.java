package Project3;
import java.util.*;

public class accountTest {
	
	public static class MyClass extends Exception{
		MyClass(String g){
			super(g);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("MAIN MENU");
			System.out.println("1. Interest Calculator - SB");
			System.out.println("2. Interest Calculator - FD");
			System.out.println("3. Interest Calculator - RD");
			System.out.println("4. Exit");
			
			System.out.print("Enter your option (1..4)");
			int ch = sc.nextInt();
			switch(ch) {
			case 1 :
				
				System.out.print("Enter the average amount in your account : ");
				try {
				double amt = sc.nextDouble();
				SBAccount sb = new SBAccount();
				if(amt<0) {
					throw new MyClass("Negative value not allowed");
				}
				sb.amount = amt;
				
				System.out.println("Interest gained : "+sb.calculateInterest());
				}catch(MyClass e) {
					System.out.println(e.getMessage());
					System.exit(0);
				}
				
				break;
				
			case 2 : 
				try {
				System.out.println("Enter the FD amount");
				double amt1 = sc.nextDouble();
				if(amt1<0) {
					throw new MyClass("Negative values not allowed");
				}
				
				System.out.println("Enter the number of days");
				int n = sc.nextInt();
				if(n<0) {
					throw new MyClass("Negative values not allowed");
				}
				
				System.out.println("Enter your age");
				int age = sc.nextInt();
				if(age<0) {
					throw new MyClass("Negative values not allowed");
				}
				FDAccount fd = new FDAccount();
				fd.amount = amt1;
				fd.noOfDays = n;
				fd.ageOfACHolder = age;
				System.out.println("Interest gained is : "+fd.calculateInterest());
				}catch(MyClass e) {
					System.out.println(e.getMessage());
					System.exit(0);
				}
				break;
			case 3 :
				try {
				System.out.println("Enter the monthly amount");
				double mAmt = sc.nextDouble();
				if(mAmt<0) {
					throw new MyClass("Negative values not allowed");
				}
				System.out.println("Enter the number of months");
				int n1 = sc.nextInt();
				if(n1<0) {
					throw new MyClass("Negative values not allowed");
				}
				System.out.println("Enter your age");
				int age1 = sc.nextInt();
				if(age1<0) {
					throw new MyClass("Negative values not allowed");
				}
				RDAccount rd = new RDAccount();
				rd.ageOfACHolder = age1;
				rd.monthlyAmount = mAmt;
				rd.noOfMonths = n1;
				System.out.println("Interest gained is : "+rd.calculateInterest());
				}catch(MyClass e) {
					System.out.println(e.getMessage());
					System.exit(0);
				}
				break;
			case 4:
				System.out.println("Exiting the application..");
				System.exit(0);
						
			}
			
		}
	}

}
