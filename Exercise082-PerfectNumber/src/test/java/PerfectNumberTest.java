import static org.junit.Assert.*;

import org.junit.Test;

public class PerfectNumberTest {

	@Test
	public void testSingleA() {
		
		assertEquals(true,PerfectNumber.checkPerfectNumber(28));
	}

	@Test
	public void testSingleB() {
		
		assertEquals(true,PerfectNumber.checkPerfectNumber(6));
	}
	
	@Test
	public void testSingleC() {
		
		assertEquals(true,PerfectNumber.checkPerfectNumber(496));
	}
	
	@Test
	public void testSingleD() {
		
		assertEquals(false,PerfectNumber.checkPerfectNumber(500));
	}
}