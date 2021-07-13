package Arrays;

public class tenth {
	
	public static void main(String[] args) {
		if(args.length != 9) {
			System.out.println("Please enter 9 integers");
		}
		else {
			
			int[] arr = new int[9];
			for(int i=0;i<9;i++)
				arr[i] = Integer.parseInt(args[i]);
			
			int[][] threeD = new int[3][3];
			int k=0;
			
			for(int i=0;i<3;i++)
				for(int j=0;j<3;j++)
					threeD[i][j] = arr[k++];
			System.out.println("The given array is : ");
			
			for(int i=0;i<3;i++)
				{ for(int j=0;j<3;j++)
					System.out.print(threeD[i][j]+ " ");
					System.out.print("\n");
				}
			
			int max = 0;
			
			for(int i=0;i<3;i++)
				for(int j=0;j<3;j++)
					if(max < threeD[i][j])
						max = threeD[i][j];
			
			System.out.println("The biggest element is : "+max);
				
			}
		}
	}


