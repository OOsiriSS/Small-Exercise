
import static org.junit.Assert.*;

import org.junit.Test;

public class ValidPerfectSquareTest {

	@Test
	public void testValidPerfectSquareA() {
		assertEquals(true, ValidPerfectSquare.isPerfectSquare(1));
	}
	
	@Test
	public void testValidPerfectSquareB() {
		assertEquals(false, ValidPerfectSquare.isPerfectSquare(2));
	}
	
	@Test
	public void testSqrtC() {
		assertEquals(false, ValidPerfectSquare.isPerfectSquare(2147483647));
	}
	
	@Test
	public void testSqrtD() {
		assertEquals(true, ValidPerfectSquare.isPerfectSquare(4));
	}
	
	@Test
	public void testSqrtE() {
		assertEquals(true, ValidPerfectSquare.isPerfectSquare(65536));
	}
}
