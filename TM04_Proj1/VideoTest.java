package mod3;
import static org.junit.Assert.*;

import org.junit.Test;

public class VideoTest {

	@Test
	public void testGetName() {
		Video v = new Video("ABC");
		assertEquals("ABC",v.getName());
	}

	@Test
	public void testDoCheckout() {
		Video v = new Video("ABC");
		v.doCheckout();
		assertTrue(v.checkout);
	}

	@Test
	public void testDoReturn() {
		Video v = new Video("ABC");
		v.doCheckout();
		v.doReturn();
		assertFalse(v.checkout);
	}

	@Test
	public void testReceiveRating() {
		Video v = new Video("ABC");
		v.receiveRating(8);
		assertEquals(8,v.rating);
	}

	@Test
	public void testGetCheckout() {
		Video v = new Video("ABC");
		assertFalse(v.getCheckout());
	}

}
