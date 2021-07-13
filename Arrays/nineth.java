package Arrays;

public class nineth {
	public static void main(String[] args)
	{
		if(args.length != 4)
			System.out.println("Please enter 4 integer numbers");
		
		else
		{
			int[] arr = new int[4];
			for(int i=0;i<4;i++)
				arr[i] = Integer.parseInt(args[i]);
			
			int[][] twoD_arr = new int[2][2];
			int[][] new_arr = new int[2][2];
			int k = 0;
			
			System.out.println("Original array :");
			
			for(int i = 0; i<2;i++)
			{	for(int j=0;j<2;j++)
				{	twoD_arr[i][j] = arr[k++];
					System.out.print(twoD_arr[i][j] + " ");
				  }
			System.out.print("\n");
			}
			
			System.out.println("New array : ");
			for(int i = 1;i>=0;i--)
				for(int j = 1;j>=0;j--)
					new_arr[1-i][1-j] = twoD_arr[i][j];
			
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
					System.out.print(new_arr[i][j] + " ");
				System.out.print("\n");
			}
			
			
		}
	}

}
