package test;

import main.MatrixElementsSum;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MatrixElementsSumTest {

	private int matrixResult(int[][] matrix) {
		return MatrixElementsSum.matrixElementsSum(matrix);
	}

	@Test
	public void shouldSumAllElementsWhenNoZerosOccur() {
		int[][] matrix = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		assertEquals(18, matrixResult(matrix));
	}

	@Test
	public void shouldNotSumAnyColumnIfFirstElementIsZero() {
		int[][] matrix = { { 0, 1, 3 }, { 0, 2, 3 }, { 0, 2, 2 } };
		assertEquals(13, matrixResult(matrix));
	}

	@Test
	public void shouldNotSumRestOfColumnsIfSecondElementIsZero() {
		int[][] matrix = { { 1, 1, 3, 4, 5 }, { 0, 0, 0, 0, 0 }, { 2, 0, 4, 5, 6 } };
		assertEquals(14, matrixResult(matrix));
	}

}
