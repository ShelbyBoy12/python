package Inheritance;

public class third {
	
	public static class Person{
		String name;
		String DOB;
	}
	
	public static class Teacher extends Person{
		int salary;
		String sub;
		Teacher(String n,String d,int s, String su) {
			name = n;
			DOB = d;
			salary = s;
			sub = su;
		}
		
		void getDetails() {
			System.out.println("\nThe details of teacher are : ");
			System.out.println("The name of teacher is : "+name);
			System.out.println("The DOB of teacher is : "+DOB);
			System.out.println("The salary of teacher is : "+salary);
			System.out.println("The subject of teacher is : "+sub);
		}
	}
	
	public static class Student extends Person{
		int studentID;
		Student(String n,String d,int sid) {
			name = n;
			DOB = d;
			studentID = sid;
		}
		
		void getDetails() {
			System.out.println("\nThe details of student are : ");
			System.out.println("The name of student is : "+name);
			System.out.println("The DOB of student is : "+DOB);
			System.out.println("The student ID is : "+studentID);
		}
	}
	
	public static class college_student extends Student{
		String collegeName;
		String year; 
		college_student(String n, String d, int sid, String cname,String y) {
			super(n,d,sid);
			collegeName = cname;
			year = y;
		}
		void getDetails() {
			System.out.println("\nThe details of student are : ");
			System.out.println("The name of student is : "+name);
			System.out.println("The DOB of student is : "+DOB);
			System.out.println("The student ID is : "+studentID);
			System.out.println("The name of the college is : "+collegeName);
			System.out.println("The year of student is : "+year);
			
		}
	}
	
	public static void main(String[] args) {
		Teacher t = new Teacher("PS","12/01/1975",2000,"DAA");
		t.getDetails();
		Student s = new Student("SP","06/07/2000",123);
		s.getDetails();
		college_student c = new college_student("TS","01/01/2001",124,"MSRIT","first");
		c.getDetails();
		
		
	}
	

}
