import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumProductSubarrayTest {

	@Test
	public void testSingleA() {

		assertEquals(6, MaximumProductSubarray.maxProduct(new int[]{2,3,-2,4}));

	}

	@Test
	public void testSingleB() {

		assertEquals(6, MaximumProductSubarray.maxProduct(new int[]{-2,1,-3}));

	}
	
	@Test
	public void testSingleC() {

		assertEquals(40, MaximumProductSubarray.maxProduct(new int[]{-1,2,1,-5,4}));

	}
	
	
}