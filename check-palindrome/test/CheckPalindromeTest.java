package test;


import main.CheckPalindrome;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CheckPalindromeTest {

	private String inputString;

	private boolean result() {
		return CheckPalindrome.checkPalindrome(this.inputString);
	}
	
	@Test
	public void shouldReturnTrueWhenOneLetterString() {
		inputString = "a";
		assertEquals(true, result());
	}


	@Test
	public void shouldReturnFalseWhenInitialLetterDoesNotMatchLastLetter() {
		inputString = "abc";
		assertEquals(false, result());
	}

	@Test
	public void shouldReturnFalseWhenInitialTwoLettersDoNotMatchLastTwoLetters() {
		inputString = "abab";
		assertEquals(false, result());
	}

	@Test
	public void shouldReturnTrueWhenLongPalindrome() {
		inputString = "abcdefgfedcba";
		assertEquals(true, result());
	}

	@Test
	public void shouldReturnTrueNoMatterLetterCaseOfPalindrome() {
		inputString = "AbcDedCBa";
		assertEquals(true, result());
	}

}
