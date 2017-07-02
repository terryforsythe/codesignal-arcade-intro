package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.AdjacentElementsProduct;

public class AdjacentElementsProductTest {

	@Test
	public void shouldMultiplyElementThreeByRightElementAndReassignProductAs36() {
		int[] inputArray = { 5, 7, -3, 9, 4, -7 };
		int result = AdjacentElementsProduct.adjacentElementsProduct(inputArray);
		assertEquals(36, result);
	}

}
