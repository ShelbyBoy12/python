package mod32;


public class FDAccount extends Account{
	
	double interestRate;
	double amount;
	int noOfDays;
	int ageOfACHolder;
	
	double calculateInterest() {
		
		if(amount < 10000000) {
			if(noOfDays>= 7 && noOfDays<= 14) {
				if(ageOfACHolder > 60) {
					interestRate = 5.00;
				}
				else {
					interestRate = 4.50;
				}
			}
			
			else if(noOfDays>= 15 && noOfDays<= 29) {
				if(ageOfACHolder > 60) {
					interestRate = 5.25;
				}
				else {
					interestRate = 4.75;
				}
			}
			
			else if(noOfDays>= 30 && noOfDays<= 45) {
				if(ageOfACHolder > 60) {
					interestRate = 6.00;
				}
				else {
					interestRate = 5.50;
				}
			}
			
			else if(noOfDays>= 46 && noOfDays<= 60) {
				if(ageOfACHolder > 60) {
					interestRate = 7.50;
				}
				else {
					interestRate = 7.00;
				}
			}
			
			else if(noOfDays>= 61 && noOfDays<= 184) {
				if(ageOfACHolder > 60) {
					interestRate = 8.00;
				}
				else {
					interestRate = 7.50;
				}
			}
			
			else if(noOfDays>= 185 && noOfDays<= 365) {
				if(ageOfACHolder > 60) {
					interestRate = 8.50;
				}
				else {
					interestRate = 8.00;
				}
			}
		}
		
		else if(amount >= 10000000) {
			
			if(noOfDays >= 7 && noOfDays <= 14) {
				interestRate = 6.50;
			}
			else if(noOfDays >= 15 && noOfDays <= 29) {
				interestRate = 6.75;
			}
			else if(noOfDays >= 30 && noOfDays <= 45) {
				interestRate = 6.75;
			}
			else if(noOfDays >= 46 && noOfDays <= 60) {
				interestRate = 8.00;
			}
			else if(noOfDays >= 61 && noOfDays <= 184) {
				interestRate = 8.50;
			}
			else if(noOfDays >= 185 && noOfDays <= 365) {
				interestRate = 10.00;
			}
		}
		
		double interest = amount*interestRate/100;
		return interest;
	}

}