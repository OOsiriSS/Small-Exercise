
import static org.junit.Assert.*;

import org.junit.Test;

public class StrStrTest {

	@Test
	public void testStrStrA() {
		assertEquals(0, StrStr.strStr("", ""));
	}
	
	@Test
	public void testStrStrB() {
		assertEquals(1, StrStr.strStr("abcde", "b"));
	}
	
	@Test
	public void testStrStrC() {
		assertEquals(1, StrStr.strStr("abcde", "bcd"));
	}
	
	@Test
	public void testStrStrD() {
		assertEquals(-1, StrStr.strStr("abcde", "f"));
	}
	
	@Test
	public void testStrStrE() {
		assertEquals(-1, StrStr.strStr("abcde", "abcdef"));
	}
}
