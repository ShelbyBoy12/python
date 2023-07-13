package Flow_control_statements;

public class thirteenth {
	public static void main(String[] args) {
		
		for(int i=11;i<99;i++)
		{
			int s=0;
			for(int j=1;j<=i;j++)
				if(i%j == 0)
					s++;
			if(s==2)
				System.out.println(i);
		}
	}

}
