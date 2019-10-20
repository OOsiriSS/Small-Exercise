import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;


public class TimeTableTest {

	@Test
	public void testPrint() throws Exception {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));
		
		TimeTable.print(2);
		assertEquals(" * |  1  2\n----------\n 1 |  1  2\n 2 |  2  4", outputStream.toString("utf-8"));
	}

}
