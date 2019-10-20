package nju.edu.software.Exercise063_TwoStringSame;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoStringSameTest {
	TwoStringSame stringSame;
	@Before
	public void setUp() throws Exception {
		stringSame = new TwoStringSame();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testTwoStringSame1(){
		String strA = "This is new computer";
		String strB = "is This new computer";
		assertEquals(true,stringSame.same(strA, strB));
	}
	
	@Test
	public void testTwoStringSame2(){
		String strA = "Here you are";
		String strB = "Are you here";
		assertEquals(false,stringSame.same(strA, strB));
	}
	
	@Test
	public void testTwoStringSame3(){
		String strA = "It is an apple";
		String strB = "apple an is it";
		assertEquals(false,stringSame.same(strA, strB));
	}
	
	@Test
	public void testTwoStringSame4(){
		String strA = "nice cup";
		String strB = "nice cup";
		assertEquals(true,stringSame.same(strA, strB));
	}
	
	@Test
	public void testTwoStringSame5(){
		String strA = "1 + 2 = 3";
		String strB = "2 + 1 = 3";
		assertEquals(true,stringSame.same(strA, strB));
	}
	
	@Test
	public void testTwoStringSame6(){
		String strA = "";
		String strB = "Are you ok";
		assertEquals(false,stringSame.same(strA, strB));
	}
	
	@Test
	public void testTwoStringSame7(){
		String strA = "my major is software engineer";
		String strB = "software engineer is my major";
		assertEquals(true,stringSame.same(strA, strB));
	}
	
	@Test
	public void testTwoStringSame8(){
		String strA = "1 4 3 7 2 5";
		String strB = "2 5 6 7 3";
		assertEquals(false,stringSame.same(strA, strB));
	}
	
	@Test
	public void testTwoStringSame9(){
		String strA = "1 4 5 7 9";
		String strB = "4 5 1 7 9";
		assertEquals(true,stringSame.same(strA, strB));
	}
	
	@Test
	public void testTwoStringSame10(){
		String strA = "Hello World";
		String strB = "hello world";
		assertEquals(false,stringSame.same(strA, strB));
	}
}
