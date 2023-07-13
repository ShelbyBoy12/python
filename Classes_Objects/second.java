package Classes_and_Objects;
import java.lang.Math;


public class second {
	
	public static class Calculator{
		public static double powerInt(int num1,int num2) {
			return (Math.pow(num1,num2));
		}
		
		public static double powerDouble(double num1, int num2) {
			return (Math.pow(num1, num2));
		}
	}
	 
	 public static void main(String[] args) {
		System.out.println(Calculator.powerInt(2, 4));
		
		System.out.println(Calculator.powerDouble(2.4, 4));
	 }

}
