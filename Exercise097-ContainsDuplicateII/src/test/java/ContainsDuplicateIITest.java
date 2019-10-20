
import static org.junit.Assert.*;

import org.junit.Test;

public class ContainsDuplicateIITest {

	@Test
	public void testContainsDuplicateA() {
		assertEquals(true, ContainsDuplicateII.containsDuplicate(new int[]{1,2,3,1}, 3));
	}
	
	@Test
	public void testContainsDuplicateB() {
		assertEquals(false, ContainsDuplicateII.containsDuplicate(new int[]{1,2,3,1}, 2));
	}
	
	@Test
	public void testContainsDuplicateC() {
		assertEquals(false, ContainsDuplicateII.containsDuplicate(new int[]{1,2,3,4}, 1));
	}
	
	@Test
	public void testContainsDuplicateD() {
		assertEquals(true, ContainsDuplicateII.containsDuplicate(new int[]{1,3,2,4,3,6,1,1}, 10));
	}
	
	@Test
	public void testContainsDuplicateNull() {
		assertEquals(false, ContainsDuplicateII.containsDuplicate(new int[]{}, 5));
	}
}
