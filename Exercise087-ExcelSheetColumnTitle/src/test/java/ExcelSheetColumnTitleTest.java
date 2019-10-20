
import static org.junit.Assert.*;

import org.junit.Test;

public class ExcelSheetColumnTitleTest {

	@Test
	public void testSingleCharacterMin() {
		assertEquals("A", ExcelSheetColumnTitle.convertToTitle(1));
	}
	
	@Test
	public void testSingleCharacterMax() {
		assertEquals("Z", ExcelSheetColumnTitle.convertToTitle(26));
	}
	
	@Test
	public void testMultiCharacterMin() {
		assertEquals("AA", ExcelSheetColumnTitle.convertToTitle(27));
	}
	
	@Test
	public void testMultiCharacter() {
		assertEquals("NJU", ExcelSheetColumnTitle.convertToTitle(9745));
	}
	
	@Test
	public void tesMaxColumn() {
		assertEquals("XFD", ExcelSheetColumnTitle.convertToTitle(16384));
	}
}
