package com.algorithm.labs.lab3;

import java.util.Arrays;

public class BubbleSortImproved {

	public static void main(String[] args) {
		int[] arr1 = { 5, 3, 9, 7, 1, 8 };
		int[] arr2 = { 1, 3, 5, 7, 8, 9 };
		System.out.println(Arrays.toString(sortByBubble(arr1)));
		System.out.println(Arrays.toString(sortByBubble(arr2)));
	}

	/**
	 * Improve the BubbleSort implementation so that in the best case (which
	 * means here that the input is already sorted), the algorithm runs in O(n)
	 * time. Explain why your new version works --- in other words, prove that
	 * the best case running time of your code is O(n).
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] sortByBubble(int[] arr) {
		boolean wasSwapped = true;

		while (wasSwapped) {
			wasSwapped = false;
			for (int i = 1; i < arr.length - 1; i++) {
				if (arr[i - 1] > arr[i]) {
					int temp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = temp;
					wasSwapped = true;
				}
			}
		}
		return arr;
	}
}
