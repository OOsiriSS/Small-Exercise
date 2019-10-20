
import static org.junit.Assert.*;

import org.junit.Test;

public class ExcelSheetColumnNumberTest {

	@Test
	public void testSingleCharacterMin() {
		assertEquals(1, ExcelSheetColumnNumber.titleToNumber("A"));
	}
	
	@Test
	public void testSingleCharacterMax() {
		assertEquals(26, ExcelSheetColumnNumber.titleToNumber("Z"));
	}
	
	@Test
	public void testMultiCharacterMin() {
		assertEquals(27, ExcelSheetColumnNumber.titleToNumber("AA"));
	}
	
	@Test
	public void testMultiCharacter() {
		assertEquals(9745, ExcelSheetColumnNumber.titleToNumber("NJU"));
	}
	
	@Test
	public void tesMaxColumn() {
		assertEquals(16384, ExcelSheetColumnNumber.titleToNumber("XFD"));
	}
}
