package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.AdjacentElementsProduct;

public class AdjacentElementsProductTest {

	int[] inputArray = { 5, 7, -3, -7, 9, 4 };
	int adjacentElementsProduct = AdjacentElementsProduct.adjacentElementsProduct(inputArray);

	@Test
	public void shouldMultiplyElementFourByRightElementAndReassignProductAs36() {
		int result = adjacentElementsProduct;
		assertEquals(36, result);
	}

}
