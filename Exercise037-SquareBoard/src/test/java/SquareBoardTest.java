import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SquareBoardTest {
	private final static String SEPERATOR=System.lineSeparator();
	
	InputStream in = null;
	PrintStream out = null;

	InputStream inputStream = null;
	OutputStream outputStream = null;

	@Before
	public void setUp() {
		in = System.in;
		out = System.out;

		outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));
	}
	
	@After
	public void tearDown() {
		System.setIn(in);
		System.setOut(out);
	}
	
	@Test
	public void testNegativeInput() throws Exception {
		check(-1, Arrays.asList(""));
	}
	
	@Test
	public void testZero() throws Exception {
		check(0, Arrays.asList(""));
	}
	
	@Test
	public void testOne() throws Exception {
		check(1, Arrays.asList("#"));
	}
	
	@Test
	public void testEvenSize() throws Exception {
		check(2, Arrays.asList("# #","# #"));
	}
	
	@Test
	public void testOddSize() throws Exception {
		check(3, Arrays.asList("# # #","# # #","# # #"));
		
	}
	
	private void check(int size,  List<String> results){
		SquareBoard.print(size);
		checkOutput(results);
	}
	
	
	private void checkOutput(List<String> results){
		String[] outputs = outputStream.toString().split(SEPERATOR);
		for(int i=0;i<results.size();i++){
			assertEquals(results.get(i),outputs[i]);
		}
	}

}