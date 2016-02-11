package com.algorithm.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void sort(int[] intArr) {

		int i = 0;
		int value = 0;
		boolean wasSwapped = true;

		while (wasSwapped) {
			wasSwapped = false;
			for (int j = 1; j < intArr.length - i; j++) {
				if (intArr[j - 1] > intArr[j]) {
					value = intArr[j - 1];
					intArr[j - 1] = intArr[j];
					intArr[j] = value;
					wasSwapped = true;
				}
			}
			i++;
		}
	}

	public static void main(String[] args) {
		int[] intArr = { 3, 6, 4, 7, 10, 2, 9 };
		BubbleSort.sort(intArr);
		System.out.println(Arrays.toString(intArr));
	}
}
