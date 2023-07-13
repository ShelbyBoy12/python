package mod32;

import static org.junit.Assert.*;

import org.junit.Test;

public class SBAccountTest {

	@Test
	public void testCalculateInterest() {
		SBAccount sb = new SBAccount();
		sb.amount = 10000;
		assertTrue(400.00 == sb.calculateInterest());
	}

}
