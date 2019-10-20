
import static org.junit.Assert.*;

import org.junit.Test;

public class RepeatedSubstringPatternTest {

	@Test
	public void testRepeatedSubstringPatternA() {
		assertEquals(true, RepeatedSubstringPattern.repeatedSubstringPattern("abcabcabc"));
	}
	
	@Test
	public void testRepeatedSubstringPatternB() {
		assertEquals(false, RepeatedSubstringPattern.repeatedSubstringPattern("abca"));
	}
	
	@Test
	public void testRepeatedSubstringPatternC() {
		assertEquals(false, RepeatedSubstringPattern.repeatedSubstringPattern(""));
	}
	
	@Test
	public void testRepeatedSubstringPatternD() {
		assertEquals(true, RepeatedSubstringPattern.repeatedSubstringPattern("abab"));
	}
	
	@Test
	public void testRepeatedSubstringPatternE() {
		assertEquals(false, RepeatedSubstringPattern.repeatedSubstringPattern("a"));
	}
}
