package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllLongestStrings {

	public static String[] allLongestStrings(String[] inputArray) {

		List<String> longestStrings = new ArrayList<String>(Arrays.asList(inputArray[0]));

		for (int index = 1; index < inputArray.length; index++) {

			String element = inputArray[index];

			if (element.length() > longestStrings.get(0).length()) {
				longestStrings.set(0, element);
			}

			else if (element.length() == longestStrings.get(0).length()) {
				longestStrings.add(element);
			}

		}

		return longestStrings.toArray(new String[0]);

	}
}
