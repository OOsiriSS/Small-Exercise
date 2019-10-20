package nju.edu.software.Exercise062_DifferentCharCount;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DifferentCharCountTest {
	DifferentCharCount differentCharCount;
	@Before
	public void setUp() throws Exception {
		differentCharCount = new DifferentCharCount();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testDifferentCharCount1(){
		assertEquals(3, differentCharCount.count("abc"));
	}
	
	@Test
	public void testDifferentCharCount2(){
		assertEquals(13, differentCharCount.count("ddaw%&#$kudhka1223"));
	}
	
	@Test
	public void testDifferentCharCount3(){
		assertEquals(5, differentCharCount.count("6ank88888"));
	}
	
	@Test
	public void testDifferentCharCount4(){
		assertEquals(8, differentCharCount.count("/=--0jdak"));
	}
	
	@Test
	public void testDifferentCharCount5(){
		assertEquals(8, differentCharCount.count("3.1415926"));
	}
	
	@Test
	public void testDifferentCharCount6(){
		assertEquals(7, differentCharCount.count("happy day!"));
	}
	
	@Test
	public void testDifferentCharCount7(){
		assertEquals(4, differentCharCount.count("hello"));
	}
	
	@Test
	public void testDifferentCharCount8(){
		assertEquals(12, differentCharCount.count("computer secience"));
	}
	
	@Test
	public void testDifferentCharCount9(){
		assertEquals(16, differentCharCount.count("$%&(%GJGRGJHJREE#G33vhjjsf"));
	}
	
	@Test
	public void testDifferentCharCount10(){
		assertEquals(0, differentCharCount.count(""));
	}
}
