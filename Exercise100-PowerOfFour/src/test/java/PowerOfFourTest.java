
import static org.junit.Assert.*;

import org.junit.Test;

public class PowerOfFourTest {

	@Test
	public void testPowerA() {
		assertEquals(true, PowerOfFour.isPowerOfFour(16));
	}
	
	@Test
	public void testPowerB() {
		assertEquals(false, PowerOfFour.isPowerOfFour(5));
	}
	
	@Test
	public void testZero() {
		assertEquals(false, PowerOfFour.isPowerOfFour(0));
	}
	
	@Test
	public void testOne() {
		assertEquals(true, PowerOfFour.isPowerOfFour(1));
	}
	
	@Test
	public void testNegative() {
		assertEquals(false, PowerOfFour.isPowerOfFour(-4));
	}
	
}
