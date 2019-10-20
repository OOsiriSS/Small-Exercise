
import static org.junit.Assert.*;

import org.junit.Test;

public class PowImplementationTest {

	@Test
	public void testExponentialZero() {
		assertEquals(1.0, PowImplementation.myPow(2.0, 0), 0.0);
	}
	
	@Test
	public void testBaseZero() {
		assertEquals(0.0, PowImplementation.myPow(0, 10), 0.0);
	}
	
	@Test
	public void testExponentialPositive() {
		assertEquals(1024.0, PowImplementation.myPow(2.0, 10), 0.0);
	}
	
	@Test
	public void testExponentialNegative() {
		assertEquals(0.25, PowImplementation.myPow(2.0, -2), 0.0);
	}
	
	@Test
	public void testBaseNegative() {
		assertEquals(-0.5, PowImplementation.myPow(-2.0, -1), 0.0);
	}
}
