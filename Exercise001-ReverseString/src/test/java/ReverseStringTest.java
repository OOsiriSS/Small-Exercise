
import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void testReverseString() {
		assertEquals("fedcba",ReverseString.reverseString("abcdef"));
	}

}
