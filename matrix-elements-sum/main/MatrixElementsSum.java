package main;

public class MatrixElementsSum {

	public static int matrixElementsSum(int[][] matrix) {

		int matrixSum = 0;

		for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
			for (int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++) {

				int matrixIndex = matrix[rowIndex][columnIndex];

				if (matrixIndex == 0 && matrixIndex != matrix[matrix.length - 1][columnIndex]) {
					matrix[rowIndex + 1][columnIndex] = 0;
				}

				else if (matrixIndex != 0) {
					matrixSum += matrixIndex;
				}
			}
		}

		return matrixSum;

	}

}
