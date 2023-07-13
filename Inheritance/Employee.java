package Inheritance;

public class Employee extends Person{
	double annual_salary;
	int year;
	String insurance;
	Employee(String n,double a,int y,String i){
		super(n);
		annual_salary = a;
		year = y;
		insurance = i;
	}
	
	void getDetails() {
		System.out.println("\nThe details are :");
		System.out.println("The name of the employee is "+name);
		System.out.println("The annual salary of the employee is "+annual_salary);
		System.out.println("The year when employee started to work "+year);
		System.out.println("The national insurance number is  "+insurance+"\n");
	}
	
	void setName(String n) {
		name = n;
		System.out.println("After updating, the details are : ");
		getDetails();
	}
	
	void setSalary(double a) {
		annual_salary = a;
		System.out.println("After updating, the details are : ");
		getDetails();
	}
	
	void setYear(int y) {
		year = y;
		System.out.println("After updating, the details are : ");
		getDetails();
	}
	
	void setInsurance(String i) {
		insurance = i;
		System.out.println("After updating, the details are : ");
		getDetails();
	}
}
