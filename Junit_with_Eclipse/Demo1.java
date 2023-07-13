import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class Demo1 {

	String stringConcat(String a, String b) {
		return (a+b);
	}
	
	@Test
	public void testCase(){
		System.out.println("Inside test case");
		assertEquals("HelloWorld",stringConcat("Hello","World"));
	}

}
