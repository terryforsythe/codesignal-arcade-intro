package main;

public class AdjacentElementsProduct {

	public static int adjacentElementsProduct(int[] inputArray) {

		int product = inputArray[0] * inputArray[1];

		for (int index = 1; index < inputArray.length - 1; index++) {

			int nextElementProduct = inputArray[index] * inputArray[index + 1];

			if (product < nextElementProduct) {
				product = nextElementProduct;
			}
		}

		return product;

	}
}
