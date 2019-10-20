
import static org.junit.Assert.*;

import org.junit.Test;

public class PolynomialTest {

	@Test
	public void testPolynomialA() {
		assertEquals(5.0, Polynomial.calculatePolynomial(2.0, new int[]{2, 1}), 0.0);
	}
	
	@Test
	public void testPolynomialB() {
		assertEquals(14.0, Polynomial.calculatePolynomial(2.0, new int[]{3, 0, 2}), 0.0);
	}
	
	@Test
	public void testPolynomialC() {
		assertEquals(0.0, Polynomial.calculatePolynomial(2.0, new int[]{1, 0, -4}), 0.0);
	}
	
	@Test
	public void testExponentialZero() {
		assertEquals(0.0, Polynomial.calculatePolynomial(2.0, new int[]{0, 0, 0}), 0.0);
	}
}
