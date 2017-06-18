package test;

import main.MatrixElementsSum;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MatrixElementsSumTest {

	@Test
	public void shouldSumAllElementsWhenNoZerosOccur() {
		int[][] matrix = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int result = MatrixElementsSum.matrixElementsSum(matrix);
		assertEquals(18, result);
	}

	@Test
	public void shouldNotSumColumnIfFirstElementIsZero() {
		int[][] matrix = { { 0, 1, 3 }, { 2, 2, 2 }, { 2, 2, 2 } };
		int result = MatrixElementsSum.matrixElementsSum(matrix);
		assertEquals(12, result);
	}
	
//	@Test
//	public void shouldNotSumRestOfColumnIfThirdElementIsZero() {
//		int[][] matrix = {{1,2,0,4,5},{1,2,0,4,5},{1,2,0,4,5}};
//		int result = MatrixElementsSum.matrixElementsSum(matrix);
//		assertEquals(9, result);
//	}

}
