package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.CommonCharacterCount;

public class CommonCharacterCountTest {

	String string1;
	String string2;

	private int countResult() {
		return CommonCharacterCount.commonCharacterCount(this.string1, this.string2);
	}

	@Test
	public void shouldMatchSingleCommonCharacterInBothStringsAndReturnCountAs1() {
		string1 = "abcd";
		string2 = "defg";
		assertEquals(1, countResult());
	}

	@Test
	public void shouldMatchTwoCommonCharactersInBothStringsAndReturnCountAs2() {
		string1 = "acbc";
		string2 = "cdecf";
		assertEquals(2, countResult());
	}

	@Test
	public void shouldMatchThreeCommonCharactersInBothStringsWhenStringHasExtraCommonCharacters() {
		string1 = "aaadddhhh";
		string2 = "adh";
		assertEquals(3, countResult());
	}

	@Test
	public void shouldMatchCommonCharactersInBothStringsWhenStringsHaveNoLogicalOrder() {
		string1 = "dehxggyz";
		string2 = "gkadcgfh";
		assertEquals(4, countResult());
	}

	@Test
	public void shouldReturnCountNoMatterCharacterCase() {
		string1 = "ABCD";
		string2 = "abcd";
		assertEquals(4, countResult());
	}

}
