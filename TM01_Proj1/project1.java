
public class project1 {
	
	public static void main(String[] args) {
		
		int[] emp_no = new int[] { 1001,1002,1003,1004,1005,1006,1007 };
		
		String[] emp_name = new String[] { "Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay" };
		
		String[] join_date = new String[] { "01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/01/2000","12/06/2006" } ;
		
		char[] desig_code = new char[] { 'e','c','k','r','m','e','c'};
		
		String[] dept_name = new String[] { "R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM" };
		
		int[] basic = new int[] { 20000,30000,10000,12000,50000,23000,29000 };
		
		int[] hra = new int[] { 8000,12000,8000,6000,20000,9000,12000 };
		
		int[] it = new int[] { 3000,9000,1000,2000,20000,4400,10000};
		
		int empid = Integer.parseInt(args[0]);
		int index = -1;
		
		for(int i=0;i<7;i++)
		{
			if(empid == emp_no[i])
				index = i;
		}
		
		if(index == -1)
			System.out.println("There is no employee with empid : "+empid);
		else
		{
			String desig = "";
			int DA = 0;
			
			switch(desig_code[index])
			{
			case 'e' :
				desig = "Engineer";
				DA = 20000;
				break;
			case 'c' :
				desig = "Consultant";
				DA = 32000;
				break;
			case 'k' :
				desig = "Clerk";
				DA = 12000;
				break;
			case 'r' :
				desig = "Receptionist";
				DA = 15000;
				break;
			case 'm' :
				desig = "Manager";
				DA = 40000;
				break;
			default : break;
			}
			
			float salary = (float)(basic[index] + hra[index] + DA - it[index]);
			
			System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
			System.out.println(empid+"\t"+emp_name[index]+"\t\t"+dept_name[index]+"\t\t"+desig+"\t"+salary);
		}
		
		
		
	}

}
