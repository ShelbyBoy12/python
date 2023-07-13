package mod2;
import java.util.*;

public class VideoLauncher {
	public static void main(String[] args) {
		VideoStore vs = new VideoStore();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int flag=0;
			
			System.out.println("\n\nMain Menu");
			System.out.println("1. Add Vedios :");
			System.out.println("2. Check Out Vedio :");
			System.out.println("3. Return Vedio :");
			System.out.println("4. Receive Rating :");
			System.out.println("5. List Inventory :");
			System.out.println("6. Exit :");
			System.out.print("Enter your choice(1..6) :   ");
			
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1 :
				System.out.print("Enter the name of the vedio you want to add :");
				String n = sc.next();
				vs.addVideo(n);
				System.out.println("Vedio'"+n+"'added successfully.");
				break;
			case 2 :
				System.out.print("Enter the name of the vedio you want to check out : ");
				String n1 = sc.next();
				vs.doCheckout(n1);
				System.out.println("Vedio '"+n1+"'checked out successfully");
				break;
				
			case 3 :
				System.out.print("Enter the name of the vedio you want to return : ");
				String n2 = sc.next();
				vs.doReturn(n2);
				System.out.println("Vedio '"+n2+"'returned successfully");
				break;
				
			case 4 :
				System.out.print("Enter the name of the vedio you want to rate : ");
				String n3 = sc.next();
				System.out.print("Enter the rating for this vedio : ");
				int r = sc.nextInt();
				vs.receiveRating(n3, r);
				System.out.println("Rating '"+r+"' has been mapped to the vedio '"+n3+"'");
				break;
			case 5 :
				vs.listInventory();
				break;
			case 6 :
				flag = 1;
				break;
			default:
					System.out.println("Enter a valid choice ");
			}
			if(flag==1) {
				System.out.println("Exiting...!! Thanks for using the application");
				System.exit(0);
			}
			
		}
	}

}
