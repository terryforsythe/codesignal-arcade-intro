package main;

public class CommonCharacterCount {

	public static int commonCharacterCount(String s1, String s2) {

		int count = 0;

		StringBuilder stringOne = new StringBuilder(s1.toLowerCase());
		StringBuilder stringTwo = new StringBuilder(s2.toLowerCase());

		for (int string1Index = 0; string1Index < stringOne.length(); string1Index++) {
			for (int string2Index = 0; string2Index < stringTwo.length(); string2Index++) {

				if (stringOne.charAt(string1Index) == stringTwo.charAt(string2Index)) {
					count += 1;
					stringTwo.deleteCharAt(string2Index);
					break;
				}

			}
		}

		return count;

	}

}
