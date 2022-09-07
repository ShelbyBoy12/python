import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Demo2 {

	public boolean palindromeCheck(String str) {
		
		StringBuffer s = new StringBuffer(str);
		s.reverse();
		String str1 = s.toString();
		if(str1.equals(str)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Test
	public void TestCase() {
		assertTrue(palindromeCheck("mom"));
		assertFalse(palindromeCheck("boy"));
	}
	
}
