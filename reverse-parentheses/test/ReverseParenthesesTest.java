package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import main.ReverseParentheses;

public class ReverseParenthesesTest {

	String inputString;
	String result;

	private String reverseParenthesesResult() {
		return ReverseParentheses.reverseParentheses(inputString);
	}
	
	@Test
	public void shouldAddLetterTwoIndexesAfterLeftParenthesisToFirstIndexOfOutputString() {
		inputString = "(xy)";
		result = reverseParenthesesResult().substring(0, 1);
		assertThat(result, is("y"));
	}

	@Test
	public void shouldAddLetterTwoIndexesBeforeRightParenthesisToSecondIndexOfOutputString() {
		inputString = "(xy)";
		result = reverseParenthesesResult().substring(1, 2);
		assertThat(result, is("x"));
	}
	
	@Test
	public void shouldReverseTwoLettersBetweenParenthesesInLongStringAndReturnWithoutParentheses() {
		inputString = "abcdefghi(kj)lmn";
		result = reverseParenthesesResult();
		assertThat(result, is("abcdefghijklmn"));
	}

}