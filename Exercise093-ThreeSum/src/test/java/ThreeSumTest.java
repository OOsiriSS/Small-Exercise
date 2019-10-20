
import static org.junit.Assert.*;

import org.junit.Test;

public class ThreeSumTest {

	@Test
	public void testThreeSumA() {
		assertArrayEquals(new int[]{0, 1, 2}, ThreeSum.threeSum(new int[]{2, 7, 11, 15}, 20));
	}
	
	@Test
	public void testThreeSumB() {
		assertArrayEquals(new int[]{0, 2, 3}, ThreeSum.threeSum(new int[]{7, 3, 5, 1}, 13));
	}
	
	@Test
	public void testThreeSumC() {
		assertArrayEquals(new int[]{1, 2, 3}, ThreeSum.threeSum(new int[]{9, 8, 5, 1}, 14));
	}
}
