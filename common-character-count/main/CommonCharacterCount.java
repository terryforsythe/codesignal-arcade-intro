package main;

import java.util.ArrayList;
import java.util.List;

public class CommonCharacterCount {

	public static int commonCharacterCount(String string1, String string2) {

		int commonCharacterCount = 0;

		// add string1 characters to ArrayList
		List<Character> string1Characters = new ArrayList<Character>();
		for (char character : string1.toLowerCase().toCharArray()) {
			string1Characters.add(character);
		}

		// add string2 characters to ArrayList
		List<Character> string2Characters = new ArrayList<Character>();
		for (char character : string2.toLowerCase().toCharArray()) {
			string2Characters.add(character);
		}

		// count number of common characters between the two ArrayLists
		for (int string1Index = 0; string1Index < string1Characters.size(); string1Index++) {
			for (int string2Index = 0; string2Index < string2Characters.size(); string2Index++) {

				Character string1Character = string1Characters.get(string1Index);
				Character string2Character = string2Characters.get(string2Index);
				
				if (string1Character == string2Character) {
					string2Characters.remove(string2Index);
					commonCharacterCount++;
				}

			}
		}

		return commonCharacterCount;
	}
}
