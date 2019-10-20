import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SortColorsTest {

	@Test
	public void testSingleA() {
		
		int[]a=new int[]{2,0,1,0,1,2};
		SortColors.sortColors(a);
		assertArrayEquals(new int[]{0,0,1,1,2,2}, a);
	}

}