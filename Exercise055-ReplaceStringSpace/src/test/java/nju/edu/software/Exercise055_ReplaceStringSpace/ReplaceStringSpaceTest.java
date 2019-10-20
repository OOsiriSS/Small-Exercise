package nju.edu.software.Exercise055_ReplaceStringSpace;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReplaceStringSpaceTest {
	ReplaceStringSpace replacespace;
	@Before
	public void setUp() throws Exception {
		replacespace = new ReplaceStringSpace();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testReplaceStringSpace1(){
		String str = "We Are Happy";
		assertEquals("We%20Are%20Happy",replacespace.replaceSpace(str));
	}
	
	@Test
	public void testReplaceStringSpace2(){
		String str = "I'm Lily";
		assertEquals("I'm%20Lily",replacespace.replaceSpace(str));
	}
	
	@Test
	public void testReplaceStringSpace3(){
		String str = "We  Are Happy";
		assertEquals("We%20%20Are%20Happy",replacespace.replaceSpace(str));
	}
	
	@Test
	public void testReplaceStringSpace4(){
		String str = " We Are Happy";
		assertEquals("%20We%20Are%20Happy",replacespace.replaceSpace(str));
	}
	
	@Test
	public void testReplaceStringSpace5(){
		String str = " ";
		assertEquals("%20",replacespace.replaceSpace(str));
	}
	
	@Test
	public void testReplaceStringSpace6(){
		String str = "";
		assertEquals("",replacespace.replaceSpace(str));
	}
	
	@Test
	public void testReplaceStringSpace7(){
		String str = "I have 5 apples.";
		assertEquals("I%20have%205%20apples.",replacespace.replaceSpace(str));
	}
	
	@Test
	public void testReplaceStringSpace8(){
		String str = "helloworld";
		assertEquals("helloworld",replacespace.replaceSpace(str));
	}
	
	@Test
	public void testReplaceStringSpace9(){
		String str = "30 * 40 = 1200";
		assertEquals("30%20*%2040%20=%201200",replacespace.replaceSpace(str));
	}
	
	@Test
	public void testReplaceStringSpace10(){
		String str = "@#%&*$*^% ()";
		assertEquals("@#%&*$*^%%20()",replacespace.replaceSpace(str));
	}
	
}
