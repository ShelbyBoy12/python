package Project3;

public class SBAccount extends Account{
	double interestRate;
	double amount;
	
	
	double calculateInterest() {
		interestRate = 4.00;
		return(amount*interestRate/100);
	}

}
