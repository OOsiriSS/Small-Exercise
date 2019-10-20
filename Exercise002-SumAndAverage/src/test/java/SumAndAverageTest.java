import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SumAndAverageTest {
	SumAndAverage sumAndAverage;
	int sum = 0;          
    double average;       
    int lowerbound = 1;   
    int upperbound = 100;

	@Before
	public void setUp() throws Exception {
		sumAndAverage = new SumAndAverage();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculateSum() {
		sum = sumAndAverage.calculateSum(lowerbound, upperbound);
		assertEquals(sum,5050);
	}

    @Test
	public void testCalculateAverage() {
		average = sumAndAverage.calculateAverage(lowerbound, upperbound);
		assertEquals(average,50.5,0.1);
	}

}
