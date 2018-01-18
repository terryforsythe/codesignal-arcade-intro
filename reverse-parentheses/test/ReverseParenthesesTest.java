package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import main.ReverseParentheses;

public class ReverseParenthesesTest {

	String inputString;
	String result;

	@Test
	public void shouldAddLetterTwoIndexesAfterLeftParenthesisToFirstIndexOfOutputString() {
		inputString = "(xy)";
		result = ReverseParentheses.reverseParentheses(inputString).substring(0, 1);
		assertThat(result, is("y"));
	}

	@Test
	public void shouldAddLetterTwoIndexesBeforeRightParenthesisToSecondIndexOfOutputString() {
		inputString = "(xy)";
		result = ReverseParentheses.reverseParentheses(inputString).substring(1, 2);
		assertThat(result, is("x"));
	}
	
	@Test
	public void shouldReverseTwoLettersBetweenParenthesesInLongStringAndReturnWithoutParentheses() {
		inputString = "abcdefghi(kj)lmn";
		result = ReverseParentheses.reverseParentheses(inputString);
		assertThat(result, is("abcdefghijklmn"));
	}

}