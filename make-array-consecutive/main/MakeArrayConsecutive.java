package main;

public class MakeArrayConsecutive {

	public static int makeArrayConsecutive(int[] statues) {

		int lowestNumber = statues[0];
		int highestNumber = statues[0];
		int numberOfMissingStatues = 0;

		for (int index = 0; index < statues.length; index++) {

			if (statues[index] < lowestNumber) {
				lowestNumber = statues[index];
			}

			if (statues[index] > highestNumber) {
				highestNumber = statues[index];
			}

			numberOfMissingStatues = (highestNumber - lowestNumber) - (statues.length - 1);

		}

		return numberOfMissingStatues;

	}

}
