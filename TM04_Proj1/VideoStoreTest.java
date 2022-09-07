package mod3;

import static org.junit.Assert.*;

import org.junit.Test;

public class VideoStoreTest {

	@Test
	public void testAddVideo() {
		VideoStore vs = new VideoStore();
		vs.addVideo("ABC");
		assertEquals("ABC",vs.store[1].videoName);
	}

	@Test
	public void testDoCheckout() {
		VideoStore vs = new VideoStore();
		vs.addVideo("ABC");
		vs.doCheckout("ABC");
		assertTrue(vs.store[1].checkout);
	}

	@Test
	public void testDoReturn() {
		VideoStore vs = new VideoStore();
		vs.addVideo("ABC");
		vs.doReturn("ABC");
		assertFalse(vs.store[1].checkout);
	}

	@Test
	public void testReceiveRating() {
		VideoStore vs = new VideoStore();
		vs.addVideo("ABC");
		vs.receiveRating("ABC", 8);
		assertEquals(8,vs.store[1].rating);
	}

}
