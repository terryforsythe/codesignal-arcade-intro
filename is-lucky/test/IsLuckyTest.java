package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import main.IsLucky;

public class IsLuckyTest {

	int ticketNumber;

	private boolean luckyResult() {
		return IsLucky.isLucky(this.ticketNumber);
	}

	@Test
	public void shouldReturnTrueWhenFirstNumberEqualsSecondNumberInTwoDigitNumber() {
		ticketNumber = 33;
		assertThat(luckyResult(), is(true));
	}

	@Test
	public void shouldReturnFalseWhenFirstNumberDoesNotEqualSecondNumberInTwoDigitNumber() {
		ticketNumber = 54;
		assertThat(luckyResult(), is(false));
	}

	@Test
	public void shouldReturnTrueWhenFirstHalfOfNumberEqualsSecondHalfInFourDigitNumber() {
		ticketNumber = 1524;
		assertThat(luckyResult(), is(true));
	}

	@Test
	public void shouldReturnTrueWhenFirstHalfOfNumberEqualsSecondHalfInSixDigitNumber() {
		ticketNumber = 234162;
		assertThat(luckyResult(), is(true));

	}

	@Test
	public void shouldReturnFalseWhenTicketHasOddNumberOfDigits() {
		ticketNumber = 23432;
		assertThat(luckyResult(), is(false));
		}

}
