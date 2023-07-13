import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class Employee {
	
	public String findName(ArrayList<String> employees,String name) {
		String result = "";
		
		if(employees.contains(name)) {
			result = "FOUND";
		}
		else {
			result = "NOT FOUND";
		}
		return result;
		
	}
	
	@Test
	public void testCase1() {
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Hello");
		a1.add("World");
		assertEquals("FOUND",findName(a1,"World"));
		assertEquals("NOT FOUND",findName(a1,"ABC"));
	}

}
