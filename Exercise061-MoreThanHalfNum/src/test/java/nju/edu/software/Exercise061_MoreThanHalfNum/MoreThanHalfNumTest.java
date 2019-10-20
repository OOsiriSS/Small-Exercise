package nju.edu.software.Exercise061_MoreThanHalfNum;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MoreThanHalfNumTest {
	MoreThanHalfNum morethanhalfnum;
	@Before
	public void setUp() throws Exception {
		morethanhalfnum = new MoreThanHalfNum();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testMoreThanHalfNum1(){
		int[] array = {1,2,3,2,2,2,5,4,2};
		assertEquals(2, morethanhalfnum.getMoreThanHalfNum(array));
	}
	
	@Test
	public void testMoreThanHalfNum2(){
		int[] array = {1};
		assertEquals(1, morethanhalfnum.getMoreThanHalfNum(array));
	}
	
	@Test
	public void testMoreThanHalfNum3(){
		int[] array = {1,2};
		assertEquals(1, morethanhalfnum.getMoreThanHalfNum(array));
	}
	
	@Test
	public void testMoreThanHalfNum4(){
		int[] array = {1,3,5,3,2};
		assertEquals(-1, morethanhalfnum.getMoreThanHalfNum(array));
	}
	
	@Test
	public void testMoreThanHalfNum5(){
		int[] array = {1,3,4,3,4,3,5,3,3,4,4,4};
		assertEquals(-1, morethanhalfnum.getMoreThanHalfNum(array));
	}
	
	@Test
	public void testMoreThanHalfNum6(){
		int[] array = {0,2,1,4,22,113,1,44,1,3,13};
		assertEquals(-1, morethanhalfnum.getMoreThanHalfNum(array));
	}
	
	@Test
	public void testMoreThanHalfNum7(){
		int[] array = {1,1,2,1,1,1,1,1,1,1,};
		assertEquals(1, morethanhalfnum.getMoreThanHalfNum(array));
	}
	
	@Test
	public void testMoreThanHalfNum8(){
		int[] array = {4,2,34,1,3,3,2,2,2,2,2,2};
		assertEquals(2, morethanhalfnum.getMoreThanHalfNum(array));
	}
	
	@Test
	public void testMoreThanHalfNum9(){
		int[] array = {};
		assertEquals(-1, morethanhalfnum.getMoreThanHalfNum(array));
	}
	
	@Test
	public void testMoreThanHalfNum10(){
		int[] array = {1,2,1};
		assertEquals(1, morethanhalfnum.getMoreThanHalfNum(array));
	}
}
