package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.CheckPalindrome;

public class CheckPalindromeTest {

	private String inputString;
	private boolean result;

	private boolean checkPalindrome() {
		result = CheckPalindrome.checkPalindrome(inputString);
		return result;
	}

	@Test
	public void shouldReturnTrueWhenOneLetterString() {
		inputString = "a";
		result = checkPalindrome();
		assertEquals(true, result);
	}

	@Test
	public void shouldReturnFalseWhenInitialLetterDoesNotMatchLastLetter() {
		inputString = "abc";
		result = checkPalindrome();
		assertEquals(false, result);
	}

	@Test
	public void shouldReturnFalseWhenInitialTwoLettersDoNotMatchLastTwoLetters() {
		inputString = "abab";
		result = checkPalindrome();
		assertEquals(false, result);
	}

	@Test
	public void shouldReturnTrueWhenLongPalindrome() {
		inputString = "abcdefgfedcba";
		result = checkPalindrome();
		assertEquals(true, result);
	}

	@Test
	public void shouldReturnTrueNoMatterLetterCaseOfPalindrome() {
		inputString = "AbcDedCBa";
		result = checkPalindrome();
		assertEquals(true, result);
	}

}
