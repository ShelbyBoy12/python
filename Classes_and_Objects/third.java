package Classes_and_Objects;

public class third {
	
	public static class patient{
		String patientName;
		double height;
		double weight;
		patient(String pn,double h, double w)
		{
			patientName = pn;
			height = h;
			weight = w;
		}
		
		double computeBMI() {
			return (double)(weight)/(height*height);
		}
	}
	
	public static void main(String[] args) {
		
		patient P = new patient("ABC",1.7,78);
		
		System.out.println("Patient Name : "+P.patientName+"\nPatient height in mts: "+P.height+"\nPatient weight in kgs : "+P.weight+"\nPatient BMI is : "+P.computeBMI());
	}
}
