package main;

public class CommonCharacterCount {

	public static int commonCharacterCount(String s1, String s2) {

		int count = 0;
		
		char[] string1 = s1.toLowerCase().toCharArray();
		StringBuilder string2 = new StringBuilder(s2.toLowerCase());

		for (char string1Index : string1) {
			for (int string2Index = 0; string2Index < string2.length(); string2Index++) {

				if (string1Index == string2.charAt(string2Index)) {
					count += 1;
					string2.deleteCharAt(string2Index);
					break;
				}

			}
		}

		return count;

	}

}
