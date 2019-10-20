import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class IntersectionOfTwoArraysIITest {

	@Test
	public void testSingleA() {

		assertArrayEquals(new int[]{2,2}, IntersectionOfTwoArraysII.intersect(new int[]{1,2,2,1}, new int[]{2,2}));
	}

	@Test
	public void testSingleB() {

		assertArrayEquals(new int[]{2,2,3}, IntersectionOfTwoArraysII.intersect(new int[]{1,2,2,3,1}, new int[]{2,2,3,3}));
	}

}