
import static org.junit.Assert.*;

import org.junit.Test;

public class NumberOfOneBitsTest {

	@Test
	public void testZero() {
		assertEquals(0, NumberOfOneBits.hammingWeight(0));
	}
	
	@Test
	public void testNegative() {
		assertEquals(32, NumberOfOneBits.hammingWeight(-1));
	}
	
	@Test
	public void testPositive() {
		assertEquals(3, NumberOfOneBits.hammingWeight(11));
	}
	
	@Test
	public void testMinNegative() {
		assertEquals(1, NumberOfOneBits.hammingWeight(-2147483648));
	}
	
	@Test
	public void testMaxPositive() {
		assertEquals(31, NumberOfOneBits.hammingWeight(2147483647));
	}
	
}
