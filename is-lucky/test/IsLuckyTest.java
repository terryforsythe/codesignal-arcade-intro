package test;

import org.junit.Test;
import main.IsLucky;
import static org.junit.Assert.assertEquals;

public class IsLuckyTest {

	int ticketNumber;

	boolean luckyResult() {
		return IsLucky.isLucky(this.ticketNumber);
	}

	@Test
	public void shouldReturnTrueWhenFirstNumberEqualsSecondNumberInTwoDigitNumber() {
		ticketNumber = 33;
		assertEquals(true, luckyResult());
	}

	@Test
	public void shouldReturnFalseWhenFirstNumberDoesNotEqualSecondNumberInTwoDigitNumber() {
		ticketNumber = 54;
		assertEquals(false, luckyResult());
	}

	@Test
	public void shouldReturnTrueWhenFirstHalfOfNumberEqualsSecondHalfInFourDigitNumber() {
		ticketNumber = 1524;
		assertEquals(true, luckyResult());
	}

	@Test
	public void shouldReturnTrueWhenFirstHalfOfNumberEqualsSecondHalfInSixDigitNumber() {
		ticketNumber = 234162;
		assertEquals(true, luckyResult());
	}

	@Test
	public void shouldReturnFalseWhenTicketHasOddNumberOfDigits() {
		ticketNumber = 23432;
		assertEquals(false, luckyResult());
	}

}
