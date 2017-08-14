package main;

public class IsLucky {

	public static boolean isLucky(int n) {

		String ticketNumber = Integer.toString(n);
		int halfNumberLength = ticketNumber.length() / 2;

		char[] firstHalfOfNumber = ticketNumber.substring(0, halfNumberLength).toCharArray();
		char[] secondHalfOfNumber = ticketNumber.substring(halfNumberLength).toCharArray();

		int firstHalfOfNumberSum = 0;
		int secondHalfOfNumberSum = 0;

		for (char digit : firstHalfOfNumber) {
			firstHalfOfNumberSum += digit;
		}

		for (char digit : secondHalfOfNumber) {
			secondHalfOfNumberSum += digit;
		}

		return firstHalfOfNumberSum == secondHalfOfNumberSum;

	}

}
