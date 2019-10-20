
import static org.junit.Assert.*;

import org.junit.Test;

public class Search2DMatrixTest {

	@Test
	public void testSearch2DMatrixA() {
		int[][] matrix = new int[][]{{1,   3,  5,  7},
									 {10, 11, 16, 20},
									 {23, 30, 34, 50}};
		assertEquals(true, Search2DMatrix.searchMatrix(matrix, 1));
	}
	
	@Test
	public void testSearch2DMatrixB() {
		int[][] matrix = new int[][]{{1,   3,  5,  7},
									 {10, 11, 16, 20},
									 {23, 30, 34, 50}};
		assertEquals(true, Search2DMatrix.searchMatrix(matrix, 50));
	}
	
	@Test
	public void testSearch2DMatrixC() {
		int[][] matrix = new int[][]{{1,   3,  5,  7},
									 {10, 11, 16, 20},
									 {23, 30, 34, 50}};
		assertEquals(true, Search2DMatrix.searchMatrix(matrix, 11));
	}
	
	@Test
	public void testSearch2DMatrixD() {
		int[][] matrix = new int[][]{{1,   3,  5,  7},
									 {10, 11, 16, 20},
									 {23, 30, 34, 50}};
		assertEquals(false, Search2DMatrix.searchMatrix(matrix, 0));
	}
	
	@Test
	public void testSearch2DMatrixE() {
		int[][] matrix = new int[][]{{}};
		assertEquals(false, Search2DMatrix.searchMatrix(matrix, 1));
	}
}
