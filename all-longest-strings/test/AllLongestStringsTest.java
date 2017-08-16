package test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import main.AllLongestStrings;


public class AllLongestStringsTest {

	@Test
	public void shouldAddSameLengthStringsToArrayList() {
		String[] inputArray = { "abc", "cde", "efg" };
		String[] expected = inputArray;
		String[] result = AllLongestStrings.allLongestStrings(inputArray);
		assertThat(result, is(equalTo(expected)));
	}

	@Test
	public void shouldReturnLongestStrings() {
		String[] inputArray = { "abc", "efgh", "fghi", "abcdefg", "cba", "tuvwxyz" };
		String[] expected = { "abcdefg", "tuvwxyz" };
		String[] result = AllLongestStrings.allLongestStrings(inputArray);
		assertThat(result, is(equalTo(expected)));
	}

}
