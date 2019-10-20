import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BestTimeToBuyAndSellStockIITest {

	@Test
	public void testSingleA() {

		assertEquals(7, BestTimeToBuyAndSellStockII.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));

	}

	@Test
	public void testSingleB() {

		assertEquals(0, BestTimeToBuyAndSellStockII.maxProfit(new int[] { 7, 6, 4, 3, 1 }));
	}

}