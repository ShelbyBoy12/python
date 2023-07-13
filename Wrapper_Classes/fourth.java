package Wrapper_Classes;

public class fourth {
	
	public static class employee implements Cloneable{
		String name;
		int emp_id;
		
		employee(String name,int emp_id){
			this.name = name;
			this.emp_id = emp_id;
		}
		
		public Object clone() throws CloneNotSupportedException{
			return super.clone();
		}
	}
	
	public static void main(String[] args) {
		try {
		employee e = new employee("ABC",123);
		employee c = (employee)e.clone();
		
		e.emp_id = 456;
		e.name = "XYZ";
		System.out.println("Original object : "+e.emp_id+ " "+e.name);
		System.out.println("Clone object : "+c.emp_id+ " "+c.name);
		
		}catch(CloneNotSupportedException e) {}
	}

}
