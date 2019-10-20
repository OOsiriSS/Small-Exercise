package nju.edu.software.Exercise056_reOrderArray;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class reOrderArrayTest {
	reOrderArray reorderarray;
	@Before
	public void setUp() throws Exception {
		reorderarray = new reOrderArray();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testReplaceStringSpace1(){
		int[] array = {2,3,6,8,5,9,23};
		int[] result = reorderarray.reOrder(array); 
		int[] compare = {3,5,9,23,2,6,8};
		assertEquals(true,equals(result,compare));
	}
	
	@Test
	public void testReplaceStringSpace2(){
		int[] array = {1,2,3,4,5,6};
		int[] result = reorderarray.reOrder(array); 
		int[] compare = {1,3,5,2,4,6};
		assertEquals(true,equals(result,compare));
	}
	
	@Test
	public void testReplaceStringSpace3(){
		int[] array = {1,3,5,7};
		int[] result = reorderarray.reOrder(array); 
		int[] compare = {1,3,5,7};
		assertEquals(true,equals(result,compare));
	}
	
	@Test
	public void testReplaceStringSpace4(){
		int[] array = {2,1};
		int[] result = reorderarray.reOrder(array); 
		int[] compare = {1,2};
		assertEquals(true,equals(result,compare));
	}
	
	@Test
	public void testReplaceStringSpace5(){
		int[] array = {2,4,8,10,3,7,5,11};
		int[] result = reorderarray.reOrder(array); 
		int[] compare = {3,7,5,11,2,4,8,10};
		assertEquals(true,equals(result,compare));
	}
	
	@Test
	public void testReplaceStringSpace6(){
		int[] array = {7,9,0};
		int[] result = reorderarray.reOrder(array); 
		int[] compare = {7,9,0};
		assertEquals(true,equals(result,compare));
	}
	
	@Test
	public void testReplaceStringSpace7(){
		int[] array = {0,20,30,6,8,4,5,3,12,13,17,18,22};
		int[] result = reorderarray.reOrder(array); 
		int[] compare = {5,3,13,17,0,20,30,6,8,4,12,18,22};
		assertEquals(true,equals(result,compare));
	}
	
	@Test
	public void testReplaceStringSpace8(){
		int[] array = {9};
		int[] result = reorderarray.reOrder(array); 
		int[] compare = {9};
		assertEquals(true,equals(result,compare));
	}
	
	@Test
	public void testReplaceStringSpace9(){
		int[] array = {33,71,111,4,99,313,66,77,88};
		int[] result = reorderarray.reOrder(array); 
		int[] compare = {33,71,111,99,313,77,4,66,88};
		assertEquals(true,equals(result,compare));
	}
	
	@Test
	public void testReplaceStringSpace10(){
		int[] array = {};
		int[] result = reorderarray.reOrder(array); 
		int[] compare = {};
		assertEquals(true,equals(result,compare));
	}
	
	public static boolean equals(int[]a,int[]b){
		if (a==b)
			return true;
	    if (a==null || b==null)
	        return false;

	    int lengthOfa = a.length;
	    int lengthOfb = b.length;
	        
	    if (lengthOfa!=lengthOfb)
	       return false;

	    for (int i=0; i<lengthOfa; i++) {
	       if(!(a[i] == b[i]))
	    	   return false;
	    }

	   return true;        
	}
}
