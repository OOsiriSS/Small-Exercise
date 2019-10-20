package nju.edu.software.Exercise060_LeftRotateString;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LeftRotateStringTest {
	LeftRotateString leftRotateString;
	@Before
	public void setUp() throws Exception {
		leftRotateString = new LeftRotateString();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testLeftRotateString1(){
		assertEquals("XYZdeabc",leftRotateString.leftrotate("abcXYZde",3));
	}
	
	@Test
	public void testLeftRotateString2(){
		assertEquals("hsdufbhad",leftRotateString.leftrotate("dhsdufbha",1));
	}
	
	@Test
	public void testLeftRotateString3(){
		assertEquals("43jhadgyuD92347",leftRotateString.leftrotate("9234743jhadgyuD",5));
	}
	
	@Test
	public void testLeftRotateString4(){
		assertEquals("HAPPY",leftRotateString.leftrotate("HAPPY",5));
	}
	
	@Test
	public void testLeftRotateString5(){
		assertEquals("hadakhf",leftRotateString.leftrotate("hadakhf",0));
	}
	
	@Test
	public void testLeftRotateString6(){
		assertEquals("",leftRotateString.leftrotate("",3));
	}
	
	@Test
	public void testLeftRotateString7(){
		assertEquals("11100001100",leftRotateString.leftrotate("00110011100",6));
	}
	
	@Test
	public void testLeftRotateString8(){
		assertEquals("adbfbvvsadashdhhdajhjd",leftRotateString.leftrotate("hdhhdajhjdadbfbvvsadas",10));
	}
	
	@Test
	public void testLeftRotateString9(){
		assertEquals("llohe",leftRotateString.leftrotate("hello",7));
	}
	
	@Test
	public void testLeftRotateString10(){
		assertEquals("appyH",leftRotateString.leftrotate("Happy",6));
	}
	
}
