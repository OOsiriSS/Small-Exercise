
import static org.junit.Assert.*;

import org.junit.Test;

public class PlusOneTest {

	@Test
	public void testPlusOneA() {
		assertArrayEquals(new int[]{1}, PlusOne.plusOne(new int[]{0}));
	}
	
	@Test
	public void testPlusOneB() {
		assertArrayEquals(new int[]{1,0}, PlusOne.plusOne(new int[]{9}));
	}
	
	@Test
	public void testPlusOneC() {
		assertArrayEquals(new int[]{9,8,7,7,0}, PlusOne.plusOne(new int[]{9,8,7,6,9}));
	}
	
	@Test
	public void testPlusOneD() {
		assertArrayEquals(new int[]{2,1,4,7,4,8,3,6,4,8}, PlusOne.plusOne(new int[]{2,1,4,7,4,8,3,6,4,7}));
	}
}
