package nju.edu.software.Exercise058_PalindromicWord;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PalindromicWordTest {
	PalindromicWord palindromicWord;
	@Before
	public void setUp() throws Exception {
		palindromicWord = new PalindromicWord();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testPalindromicWord1(){
		assertEquals(true,palindromicWord.checkPalindromicWord("level"));
	}
	
	@Test
	public void testPalindromicWord2(){
		assertEquals(true,palindromicWord.checkPalindromicWord("aaabbbaaa"));
	}
	
	@Test
	public void testPalindromicWord3(){
		assertEquals(false,palindromicWord.checkPalindromicWord("addac"));
	}
	
	@Test
	public void testPalindromicWord4(){
		assertEquals(true,palindromicWord.checkPalindromicWord("haa aah"));
	}
	
	@Test
	public void testPalindromicWord5(){
		assertEquals(true,palindromicWord.checkPalindromicWord("hahaAHAH"));
	}
	
	@Test
	public void testPalindromicWord6(){
		assertEquals(true,palindromicWord.checkPalindromicWord("baAb"));
	}
	
	@Test
	public void testPalindromicWord7(){
		assertEquals(false,palindromicWord.checkPalindromicWord("baba"));
	}
	
	@Test
	public void testPalindromicWord8(){
		assertEquals(false,palindromicWord.checkPalindromicWord("lily hh Lily"));
	}
	
	@Test
	public void testPalindromicWord9(){
		assertEquals(true,palindromicWord.checkPalindromicWord(""));
	}
	
	@Test
	public void testPalindromicWord10(){
		assertEquals(true,palindromicWord.checkPalindromicWord(" hiih "));
	}
}
