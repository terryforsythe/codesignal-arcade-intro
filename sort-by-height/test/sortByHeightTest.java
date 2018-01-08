package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import main.sortByHeight;

public class sortByHeightTest {

	int[] inputArray;
	
	private int[] result() {
		return sortByHeight.sortByHeight(inputArray);
	}
	
	@Test
	public void shouldSortHeightsByAscendingOrderWhenNoTreesOccur() {
		inputArray = new int[] { 160, 190, 150 };
		int[] expectedResult = { 150, 160, 190 };
		assertThat(result(), is(expectedResult));
	}


	@Test
	public void shouldSortHeightsByAscendingOrderWhileKeepingInitialIndexesOfTrees() {
		inputArray = new int[] { -1, 150, 190, 170, -1, -1, 160, 180 };
		int[] expectedResult = { -1, 150, 160, 170, -1, -1, 180, 190 };
		assertThat(result(), is(expectedResult));
	}

}
