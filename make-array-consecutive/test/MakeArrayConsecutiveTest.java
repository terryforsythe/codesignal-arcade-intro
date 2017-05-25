package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.MakeArrayConsecutive;

public class MakeArrayConsecutiveTest {

	@Test
	public void shouldReturn2ForNumberOfMissingStatues() {
		int[] statues = { 6, 5, 3, 9, 8 };
		int result = MakeArrayConsecutive.makeArrayConsecutive(statues);
		assertEquals(2, result);
	}

}
