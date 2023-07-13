import java.util.*;
import java.io.*;
public class project5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String filename = "D://input1.txt";
		
		while(true) {
			System.out.println("Main Menu");
			System.out.println("1. Add an Employee");
			System.out.println("2. Display All");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1 :
				System.out.println("Enter Employee ID :");
				int empid = sc.nextInt();
				System.out.println("Enter Employee name :");
				String name = sc.next();
				
				System.out.println("Enter Employee Age :");
				int age = sc.nextInt();
				System.out.println("Enter Employee salary :");
				int salary = sc.nextInt();
				
				try {
				BufferedWriter out = new BufferedWriter(new FileWriter(filename,true));
				out.write(empid+" "+name+" "+age+" "+salary);
				out.newLine();
				out.close();
				}catch(Exception e) {
					
				}
				System.out.println("Employee added successfully");
				break;
			case 2 :
				System.out.println("---Report---");
				try {
					BufferedReader in = new BufferedReader(new FileReader(filename));
					String line;
					while((line = in.readLine()) != null) {
						System.out.println(line);
					}
					
					System.out.println("---End of Report---");
				}catch(Exception e) {
					
				}
				break;
			case 3:
				System.out.println("Exiting");
				System.exit(0);
			}
			
				
		}
	}
}
