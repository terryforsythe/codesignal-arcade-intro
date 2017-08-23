package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import main.sortByHeight;

public class sortByHeightTest {

	@Test
	public void shouldSortHeightsByAscendingOrderWhenNoTreesOccur() {
		int[] inputArray = { 160, 190, 150 };
		int[] methodResult = sortByHeight.sortByHeight(inputArray);
		int[] expectedResult = { 150, 160, 190 };
		assertThat(methodResult, is(expectedResult));
	}

	@Test
	public void shouldSortHeightsByAscendingOrderWhileKeepingInitialIndexesOfTrees() {
		int[] inputArray = { -1, 150, 190, 170, -1, -1, 160, 180 };
		int[] methodResult = sortByHeight.sortByHeight(inputArray);
		int[] expectedResult = { -1, 150, 160, 170, -1, -1, 180, 190 };
		assertThat(methodResult, is(expectedResult));
	}

}
