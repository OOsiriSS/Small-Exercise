package nju.edu.software.Exercise052_RemoveLeastNumbers;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RemoveLeastNumbersTest {
	RemoveLeastNumbers removeLeastNumbers;
	@Before
	public void setUp() throws Exception {
		removeLeastNumbers = new RemoveLeastNumbers();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testRemoveLeastNumbers1(){
		assertEquals("dd",removeLeastNumbers.remove("abcdd"));
	}
	
	@Test
	public void testRemoveLeastNumbers2(){
		assertEquals("hkakjjhja",removeLeastNumbers.remove("hkusadbkjjhja"));
	}	
	
	@Test
	public void testRemoveLeastNumbers3(){
		assertEquals("llool",removeLeastNumbers.remove("helloworld"));
	}
	
	@Test
	public void testRemoveLeastNumbers4(){
		assertEquals("tttwwww",removeLeastNumbers.remove("tttssggyywwww"));
	}
	
	@Test
	public void testRemoveLeastNumbers5(){
		assertEquals("yyttnsnsiikktt",removeLeastNumbers.remove("yyttnsnsgiikktt"));
	}
	
	@Test
	public void testRemoveLeastNumbers6(){
		assertEquals("gooonng",removeLeastNumbers.remove("goodmorning"));
	}
	
	@Test
	public void testRemoveLeastNumbers7(){
		assertEquals("",removeLeastNumbers.remove("ppyyfastfastmoremore"));
	}
	
	@Test
	public void testRemoveLeastNumbers8(){
		assertEquals("",removeLeastNumbers.remove("gggg"));
	}
	
	@Test
	public void testRemoveLeastNumbers9(){
		assertEquals("hhh",removeLeastNumbers.remove("hahah"));
	}
	
	@Test
	public void testRemoveLeastNumbers10(){
		assertEquals("bb",removeLeastNumbers.remove("baby"));
	}
}
