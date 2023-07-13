package Classes_and_Objects;



public class first {
	
public static class Box{
		int width;
		int height;
		int depth;
		
		Box(int w, int h,int d){
			width = w;
			height = h;
			depth = d;
		}
		
		int returnVol() {
			return (width*height*depth);
		}
	}
	 
	 public static void main(String[] args) {
		 Box b1 = new Box(2,3,4);
		 
		 System.out.println("The dimension of the box are \nwidth : "+b1.width+"\theight "+b1.height+"\tdepth "+b1.depth+"\nVolume : "+b1.returnVol());
		 
	 } 
	
	

}
