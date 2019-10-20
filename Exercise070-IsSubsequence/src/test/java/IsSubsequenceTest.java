import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IsSubsequenceTest {

	@Test
	public void testSingleA() {

		assertEquals(true, IsSubsequence.isSubsequence("abc", "ahbgdc"));

	}

	@Test
	public void testSingleB() {

		assertEquals(false, IsSubsequence.isSubsequence("acb", "ahbgdc"));

	}
	@Test
	public void testSingleC() {

		assertEquals(false, IsSubsequence.isSubsequence("axc", "ahbgdc"));

	}
	
	
	
	
}