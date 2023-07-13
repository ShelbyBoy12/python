package Abstract_Classes;

public class first {
	
	public static abstract class GeneralBank{
		public abstract double getSavingsInterestRate();
		public abstract double getFixedDepositInterestRate();
	}
	
	public static class ICICIBank extends GeneralBank{
		public double getSavingsInterestRate() {
			return (4.0);
		}
		
		public double getFixedDepositInterestRate() {
			return (8.5);
		}
	}
	
	public static class KotMBank extends GeneralBank{
		public double getSavingsInterestRate() {
			return (6.0);
		}
		
		public double getFixedDepositInterestRate() {
			return (9.0);
		}
	}
	
	public static void main(String[] args) {
		
		ICICIBank i = new ICICIBank();
		KotMBank k = new KotMBank();
		GeneralBank g = new KotMBank();
		GeneralBank g1 = new ICICIBank();
		System.out.println("ICICIBank Savings interest rate : "+i.getSavingsInterestRate()+"%");
		System.out.println("ICICIBank Fixed deposit interest rate : "+i.getFixedDepositInterestRate()+"%");
		System.out.println("\nKotMBank Savings interest rate : "+k.getSavingsInterestRate()+"%");
		System.out.println("KotMBank Fixed deposit interest rate : "+k.getFixedDepositInterestRate()+"%");
		
		System.out.println("\n\nICICIBank Savings interest rate : "+g1.getSavingsInterestRate()+"%");
		System.out.println("ICICIBank Fixed deposit interest rate : "+g1.getFixedDepositInterestRate()+"%");
		System.out.println("\nKotMBank Savings interest rate : "+g.getSavingsInterestRate()+"%");
		System.out.println("KotMBank Fixed deposit interest rate : "+g.getFixedDepositInterestRate()+"%");
		
	}

}
