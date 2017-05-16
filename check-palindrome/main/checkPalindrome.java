package main;

public class CheckPalindrome {

	public static boolean checkPalindrome(String inputString) {

		int length = inputString.length();

		for (int index = 0; index < (length / 2); index++) {
			 
			if (inputString.charAt(index) != inputString.charAt((length - 1) - index)) {
				return false;
			}
		}

		return true;
	}

}
