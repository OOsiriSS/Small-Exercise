package nju.edu.software.Exercise057_GetLeastNumbers;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GetLeastNumbersTest {
	GetLeastNumbers getleastnumbers;
	@Before
	public void setUp() throws Exception {
		getleastnumbers = new GetLeastNumbers();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetLeastNumbers1(){
		int[] array = {2,3,6,8,5,9,23};
		int[] result = getleastnumbers.getNumbers(array, 2); 
		int[] compare = {2,3};
		assertEquals(true,equals(result,compare));
	}
	
	@Test
	public void testGetLeastNumbers2(){
		int[] array = {4,5,1,6,2,7,3,8};
		int[] result = getleastnumbers.getNumbers(array, 4); 
		int[] compare = {1,2,3,4};
		assertEquals(true,equals(result,compare));
	}
	
	@Test
	public void testGetLeastNumbers3(){
		int[] array = {1,4,24,5566,42,324,5,34,13,4,56,352,4131};
		int[] result = getleastnumbers.getNumbers(array, 4); 
		int[] compare = {1,4,4,5};
		assertEquals(true,equals(result,compare));
	}
	
	@Test
	public void testGetLeastNumbers4(){
		int[] array = {1,2,31,41,5342,56,74};
		int[] result = getleastnumbers.getNumbers(array, 3); 
		int[] compare = {1,2,31};
		assertEquals(true,equals(result,compare));
	}
	
	@Test
	public void testGetLeastNumbers5(){
		int[] array = {3,5,1,4,6,7};
		int[] result = getleastnumbers.getNumbers(array, 6); 
		int[] compare = {1,3,4,5,6,7};
		assertEquals(true,equals(result,compare));
	}
	
	@Test
	public void testGetLeastNumbers6(){
		int[] array = {1,2,4,5,7};
		int[] result = getleastnumbers.getNumbers(array, 6); 
		int[] compare = {1,2,4,5,7};
		assertEquals(true,equals(result,compare));
	}
	
	@Test
	public void testGetLeastNumbers7(){
		int[] array = {4,5,1,6,2,7,3,8};
		int[] result = getleastnumbers.getNumbers(array, 1); 
		int[] compare = {1};
		assertEquals(true,equals(result,compare));
	}
	
	@Test
	public void testGetLeastNumbers8(){
		int[] array = {4,5,1,6,2,7,3,8};
		int[] result = getleastnumbers.getNumbers(array, 0); 
		int[] compare = {};
		assertEquals(true,equals(result,compare));
	}
	
	@Test
	public void testGetLeastNumbers9(){
		int[] array = {5434,455,33,454,13,8,9};
		int[] result = getleastnumbers.getNumbers(array, 6); 
		int[] compare = {8,9,13,33,454,455};
		assertEquals(true,equals(result,compare));
	}
	
	@Test
	public void testGetLeastNumbers10(){
		int[] array = {1,11,111,1111,35,777,43,2435,356,34,545,777,2233,55};
		int[] result = getleastnumbers.getNumbers(array, 5); 
		int[] compare = {1,11,34,35,43};
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
