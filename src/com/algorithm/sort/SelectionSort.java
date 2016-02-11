/**
 * 
 */
package com.algorithm.sort;

import java.util.Arrays;

/**
 * @author qct
 *
 */
public class SelectionSort {

	public static void sort(int[] intArr) {
		if (intArr.length == 0) {
			return;
		}

		int minIndex = 0;
		int value = 0;
		for (int i = 0; i < intArr.length; i++) {
			minIndex = i;
			for (int j = i + 1; j < intArr.length; j++) {
				if (intArr[j] < intArr[minIndex]) {
					minIndex = j;
				}
			}

			if (minIndex != i) {
				value = intArr[i];
				intArr[i] = intArr[minIndex];
				intArr[minIndex] = value;
			}
		}
	}

	public static void main(String[] args) {
		int[] intArr = { 3, 6, 4, 7, 10, 2, 9 };
		SelectionSort.sort(intArr);
		System.out.println(Arrays.toString(intArr));
	}
}
