package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.CheckPalindrome;

public class CheckPalindromeTest {

	private String inputString;

	@Test
	public void shouldReturnTrueWhenOneLetterString() {
		inputString = "a";
		boolean result = CheckPalindrome.checkPalindrome(inputString);
		assertEquals(true, result);
	}

	@Test
	public void shouldReturnFalseWhenInitialLetterDoesNotMatchLastLetter() {
		inputString = "abc";
		boolean result = CheckPalindrome.checkPalindrome(inputString);
		assertEquals(false, result);
	}

	@Test
	public void shouldReturnFalseWhenInitialTwoLettersDoNotMatchLastTwoLetters() {
		inputString = "abab";
		boolean result = CheckPalindrome.checkPalindrome(inputString);
		assertEquals(false, result);
	}

	@Test
	public void shouldReturnTrueWhenLongPalindrome() {
		inputString = "abcdefgfedcba";
		boolean result = CheckPalindrome.checkPalindrome(inputString);
		assertEquals(true, result);
	}

}
