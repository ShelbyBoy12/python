package mod32;

import static org.junit.Assert.*;

import org.junit.Test;

public class FDAccountTest {

	@Test
	public void testCalculateInterest() {
		FDAccount fd = new FDAccount();
		fd.ageOfACHolder = 22;
		fd.amount = 10000;
		fd.noOfDays = 80;
		assertTrue(750.0 == fd.calculateInterest());
	}

}
