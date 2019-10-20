import static org.junit.Assert.*;

import org.junit.Test;

public class IsomorphicStringsTest {

	@Test
	public void testSingleA() {
		
		assertEquals(true,IsomorphicStrings.isIsomorphic("egg", "add"));
	}

	@Test
	public void testSingleB() {
		
		assertEquals(false,IsomorphicStrings.isIsomorphic("foo", "bar"));
	}
	
	@Test
	public void testSingleC() {
		
		assertEquals(true,IsomorphicStrings.isIsomorphic("paper", "title"));

	}
	
}