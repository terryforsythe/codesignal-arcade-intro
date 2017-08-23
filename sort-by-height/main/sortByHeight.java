package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortByHeight {

	public static int[] sortByHeight(int[] a) {

		// Input array "a" converted into ArrayList for order manipulation
		List<Integer> inputArrayList = new ArrayList<Integer>();

		// ArrayList of heights of each person in line for sorting/comparisons
		List<Integer> heightsOfPeople = new ArrayList<Integer>();

		for (int input : a) {

			inputArrayList.add(input);

			if (input != -1)
				heightsOfPeople.add(input);

		}

		Collections.sort(heightsOfPeople);

		// Array for conditionally assigning sorted values from "inputArrayList" and "heightsOfPeople"
		int[] sortedInputs = new int[a.length];

		for (int index = 0; index < sortedInputs.length; index++) {

			if (inputArrayList.get(index) != -1) {
				sortedInputs[index] = heightsOfPeople.get(0);
				heightsOfPeople.remove(0);
				continue;
			}

			sortedInputs[index] = inputArrayList.get(index);
		}

		return sortedInputs;

	}

}
