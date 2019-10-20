import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchInsertTest {

	@Test
	public void testSingleA() {

		assertEquals(2, SearchInsert.searchInsert(new int[]{1,3,5,6}, 5));

	}

	@Test
	public void testSingleB() {

		assertEquals(1, SearchInsert.searchInsert(new int[]{1,3,5,6}, 2));

	}
	
	@Test
	public void testSingleC() {

		assertEquals(4, SearchInsert.searchInsert(new int[]{1,3,5,6}, 7));

	}
	
	@Test
	public void testSingleD() {

		assertEquals(0, SearchInsert.searchInsert(new int[]{1,3,5,6}, 0));

	}
}