import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestCommonPrefixTest {

	@Test
	public void testSingleA() {

		assertEquals("ab", LongestCommonPrefix.longestCommonPrefix(new String[]{"abc","ab","abcd"}));

	}

	@Test
	public void testSingleB() {

		assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{"abc","b","cd"}));

	}
	
	@Test
	public void testSingleC() {

		assertEquals("abc", LongestCommonPrefix.longestCommonPrefix(new String[]{"abc","abcd","abcde"}));

	}
	
	
}