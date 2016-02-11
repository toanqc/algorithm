package com.algorithm.labs.lab1;

import java.util.Arrays;

public class SubsetSum {

	public static void main(String[] args) {
		int[] intArr1 = { 1, 2, 3, 5, 6 };
		System.out.println(SubsetSum.subsetsum(intArr1, 10)); // true

		int[] intArr2 = { 1, 2, 3, 5, 6 };
		System.out.println(SubsetSum.subsetsum(intArr2, 4)); // true

		int[] intArr3 = { 1, 2, 3, 5, 6 };
		System.out.println(SubsetSum.subsetsum(intArr3, 7)); // true

		int[] intArr4 = { 1, 2, 3, 5, 6 };
		System.out.println(SubsetSum.subsetsum(intArr4, 9)); // true

		int[] intArr5 = { 1, 3, 4, 9, 10 };
		System.out.println(SubsetSum.subsetsum(intArr5, 15)); // true

		int[] intArr6 = { 1, 3, 4, 9, 10 };
		System.out.println(SubsetSum.subsetsum(intArr6, 20)); // true

		int[] intArr7 = { 1, 3, 4, 9, 10 };
		System.out.println(SubsetSum.subsetsum(intArr7, 21)); // false

		int[] intArr8 = { 2, 2, 4, 8, 6 };
		System.out.println(SubsetSum.subsetsum(intArr8, 7)); // false
	}

	/**
	 * 
	 * Problem 2. Brute Force Solution. Formulate your own procedure for solving
	 * the SubsetSum Problem. Think of it as a Java method subsetsum that
	 * accepts as input S, sum, and outputs a subset T of S with the property
	 * that the sum of the s[i] in T is k if such a T exists, or null if no such
	 * T can be found. (A non-null return value can be thought of as a return of
	 * "true" and a null return value signifies "false.") Implement your idea in
	 * Java code.
	 * 
	 * @param intArr
	 * @param sum
	 * @return
	 */
	public static boolean subsetsum(int[] intArr, int sum) {
		// sort the array
		Arrays.sort(intArr);

		for (int i = 0; i < intArr.length; i++) {
			// set total value is the first value of the array
			int totalValue = intArr[i];
			// store the j index
			int storedIndex = i + 1;

			for (int j = i + 1; j < intArr.length;) {
				totalValue += intArr[j];
				// if total value is equal to the given value then return true
				if (totalValue == sum) {
					return true;
				} else if (totalValue < sum) {
					// if the total value is less than the given value, increase
					// the index j and do the loop
					// but if the length is over then we start the j from store
					// index plus 1.
					j++;
					if (j >= intArr.length) {
						totalValue = intArr[i];
						storedIndex++;
						j = storedIndex;
					}
				} else if (totalValue > sum) {
					// if the total value is larger than the given value,
					// subtract it the the current index and the previous index
					// then start again with the current index without
					// increasing it
					totalValue = totalValue - intArr[j] - intArr[j - 1];
				}
			}
		}

		return false;
	}
}
