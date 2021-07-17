package Exception_Handling;

public class fourth {
	
	public static void main(String[] args) {
		
		if(args.length != 5) {
			System.out.println("Please provide 5 integers");
		}
		else {
			
			int[] arr = new int[5];
			int sum = 0;
			float avg = 0;
			for(int i=0;i<5;i++) {
				try {
					arr[i] = Integer.parseInt(args[i]);
				}catch(NumberFormatException e) {
					System.out.println(e);
					System.exit(0);
				}
			}
			
			for(int i=0;i<5;i++) {
				sum += arr[i];
			}
			
			System.out.println("Sum is : "+sum);
			
			try {
				avg = (float)sum/5;
				System.out.println("The average is : "+avg);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
