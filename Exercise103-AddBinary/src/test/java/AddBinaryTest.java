
import static org.junit.Assert.*;

import org.junit.Test;

public class AddBinaryTest {

	@Test
	public void testAddBinaryA() {
		assertEquals("100", AddBinary.addBinary("11", "1"));
	}
	
	@Test
	public void testAddBinaryB() {
		assertEquals("1", AddBinary.addBinary("0", "1"));
	}
	
	@Test
	public void testAddBinaryC() {
		assertEquals("0", AddBinary.addBinary("0", "0"));
	}
	
	@Test
	public void testAddBinaryD() {
		assertEquals("11100110", AddBinary.addBinary("11010111", "1111"));
	}
	
	@Test
	public void testAddBinaryE() {
		assertEquals("11100110", AddBinary.addBinary( "1111", "11010111"));
	}
	
	@Test
	public void testAddBinaryF() {
		assertEquals("100000000000000000000000000001110", AddBinary.addBinary( "1111", "11111111111111111111111111111111"));
	}
}
