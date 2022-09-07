package mod32;

import static org.junit.Assert.*;

import org.junit.Test;

public class RDAccountTest {

	@Test
	public void testCalculateInterest() {
		RDAccount rd = new RDAccount();
		rd.ageOfACHolder = 22;
		rd.monthlyAmount = 1000;
		rd.noOfMonths = 12;
		assertTrue(82.43216000000007 == rd.calculateInterest());
	}

}
