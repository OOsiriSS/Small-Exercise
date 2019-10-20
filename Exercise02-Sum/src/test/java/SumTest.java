import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {

	@Test
	public void test1() {
		testSum(3, 2);
	}

	@Test
	public void test2() {
		testSum(45, 9);
	}

	@Test
	public void test3() {
		testSum(55, 10);
	}

	@Test
	public void test4() {
		testSum(6, 3);
	}

	@Test
	public void test5() {
		testSum(5050, 100);
	}

	@Test
	public void test6() {
		testQuadraticSum(338350, 100);
	}

	@Test
	public void test7() {
		testQuadraticSum(14, 3);
	}

	
	@Test
	public void test8() {
		testQuadraticSum(30, 4);
	}

	@Test
	public void test9() {
		testQuadraticSum(55, 5);
	}
	
	@Test
	public void test10() {
		testQuadraticSum(91, 6);
	}
	
	private void testSum(int expected,int n){
		assertEquals(expected, Sum.calcSum(n));
	}
	private void testQuadraticSum(int expected,int n){
		assertEquals(expected, Sum.calcQuadraticSum(n));
	}

}
