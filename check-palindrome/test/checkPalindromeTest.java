package test;

import main.CheckPalindrome;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

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

	@Test
	public void shouldReturnTrueNoMatterLetterCaseOfPalindrome() {
		inputString = "AbcDedCBa";
		boolean result = CheckPalindrome.checkPalindrome(inputString);
		assertEquals(true, result);
	}

}
