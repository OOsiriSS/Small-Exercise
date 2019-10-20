package nju.edu.software.Exercise054_FindNumInArray;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FindNumInArrayTest {

	FindNumInArray findnum;
	@Before
	public void setUp() throws Exception {
		findnum = new FindNumInArray();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testFindNumInArray1(){
		int[][] a = {{1,2,3},{4,5,6}};
		assertEquals(true,findnum.Find(a, 3));
	}
	
	@Test
	public void testFindNumInArray2(){
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		assertEquals(true,findnum.Find(a, 6));
	}
	
	@Test
	public void testFindNumInArray3(){
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		assertEquals(false,findnum.Find(a, 10));
	}
	
	@Test
	public void testFindNumInArray4(){
		int[][] a = {{2,3,4},{5,6,7},{8,9,10}};
		assertEquals(true,findnum.Find(a, 8));
	}
	
	@Test
	public void testFindNumInArray5(){
		int[][] a = {{12,13,14,15},{17,18,19,20},{21,22,23,24},{25,26,27,28}};
		assertEquals(true,findnum.Find(a, 20));
	}
	
	@Test
	public void testFindNumInArray6(){
		int[][] a = {{1,2,3}};
		assertEquals(true,findnum.Find(a, 3));
	}
	
	@Test
	public void testFindNumInArray7(){
		int[][] a = {{1,2,3}};
		assertEquals(false,findnum.Find(a, 4));
	}
	
	@Test
	public void testFindNumInArray8(){
		int[][] a = {{1}};
		assertEquals(false,findnum.Find(a, 3));
	}
	
	@Test
	public void testFindNumInArray9(){
		int[][] a = {};
		assertEquals(false,findnum.Find(a, 1));
	}
	
	@Test
	public void testFindNumInArray10(){
		int[][] a = {{1,5,9},{3,7,15},{8,32,77}};
		assertEquals(true,findnum.Find(a, 77));
	}
}
