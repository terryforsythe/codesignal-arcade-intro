package main;

public class MatrixElementsSum {

	public static int matrixElementsSum(int[][] matrix) {

		int matrixSum = 0;

		for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++) {

				int matrixIndex = matrix[rowIndex][columnIndex];

				if (rowIndex != matrix.length - 1 && matrixIndex == 0) {
					matrix[rowIndex + 1][columnIndex] = 0;
				}

				matrixSum += matrixIndex;

			}

		}

		return matrixSum;

	}

}
