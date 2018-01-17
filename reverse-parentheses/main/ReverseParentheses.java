package main;

public class ReverseParentheses {

	public static String reverseParentheses(String inputString) {

		String outputString = "";

		for (int index = 0; index < inputString.length(); index++) {

			String characterToAdd = inputString.substring(index, index + 1);
			String leftParenthesis = "(";
			String rightParenthesis = ")";

			if (characterToAdd.equals(leftParenthesis)) {

				String twoCharactersAfterParenthesis = inputString.substring(index + 2, index + 3);

				characterToAdd = twoCharactersAfterParenthesis;
				index += 2;
			}

			if (characterToAdd.equals(rightParenthesis)) {

				String twoCharactersBeforeParenthesis = inputString.substring(index - 2, index - 1);

				characterToAdd = twoCharactersBeforeParenthesis;
			}

			outputString += characterToAdd;
		}

		return outputString;
	}

}
