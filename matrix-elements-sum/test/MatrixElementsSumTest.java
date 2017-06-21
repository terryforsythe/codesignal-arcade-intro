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
	public void shouldNotSumAnyColumnIfFirstElementIsZero() {
		int[][] matrix = { { 0, 1, 3 }, { 0, 2, 3 }, { 0, 2, 2 } };
		int result = MatrixElementsSum.matrixElementsSum(matrix);
		assertEquals(13, result);
	}

	@Test
	public void shouldNotSumRestOfColumnsIfSecondElementIsZero() {
		int[][] matrix = { { 1, 1, 3, 4, 5 }, { 0, 0, 0, 0, 0 }, { 2, 0, 4, 5, 6 } };
		int result = MatrixElementsSum.matrixElementsSum(matrix);
		assertEquals(14, result);
	}

}
