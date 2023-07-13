package mod32;



public class RDAccount extends Account{
	double interestRate;
	int noOfMonths;
	double monthlyAmount;
	int ageOfACHolder;
	
	
	double calculateInterest() {
		
		if(noOfMonths == 6) {
			if(ageOfACHolder > 60) {
				interestRate = 8.00;
			}
			else {
				interestRate = 7.50;
			}
		}
		
		else if(noOfMonths == 9) {
			if(ageOfACHolder > 60) {
				interestRate = 8.25;
			}
			else {
				interestRate = 7.75;
			}
		}
		
		else if(noOfMonths == 12) {
			if(ageOfACHolder > 60) {
				interestRate = 8.50;
			}
			else {
				interestRate = 8.00;
			}
		}
		else if(noOfMonths == 15) {
			if(ageOfACHolder > 60) {
				interestRate = 8.75;
			}
			else {
				interestRate = 8.25;
			}
		}
		else if(noOfMonths == 18) {
			if(ageOfACHolder > 60) {
				interestRate = 9.00;
			}
			else {
				interestRate = 8.50;
			}
		}
		else if(noOfMonths == 21) {
			if(ageOfACHolder > 60) {
				interestRate = 9.25;
			}
			else {
				interestRate = 8.75;
			}
		}
		
		double n = noOfMonths/3;
		double t = noOfMonths/12;
		double maturity = monthlyAmount*(Math.pow((1+(interestRate/100)/n), n*t));
		double interest = maturity - t*monthlyAmount;
		return interest;
	}

}