import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KthLargestElementTest {

	@Test
	public void testSingleA() {

		assertEquals(5, KthLargestElement.findKthLargest(new int[]{3,2,1,5,6,4}, 2));

	}

	@Test
	public void testSingleB() {

		assertEquals(4, KthLargestElement.findKthLargest(new int[]{3,2,1,5,6,4}, 3));

	}
	
	@Test
	public void testSingleC() {

		assertEquals(1, KthLargestElement.findKthLargest(new int[]{3,2,1,5,6,4}, 6));

	}
	
	
}