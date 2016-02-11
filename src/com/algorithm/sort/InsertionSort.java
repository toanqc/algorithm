package com.algorithm.sort;

import java.util.Arrays;

/**
 * 
 * @author qct
 *
 */
public class InsertionSort {

	public static void sort(Integer[] intArr) {
		sort(intArr);
	}

	public static void sort(int[] intArr) {
		if (intArr.length == 0) {
			return;
		}

		int value = 0;
		int j = 0;
		for (int i = 1; i < intArr.length; i++) {
			j = i - 1;
			value = intArr[i];
			while (j > -1 && value < intArr[j]) {
				intArr[j + 1] = intArr[j];
				intArr[j] = value;
				j--;
			}
		}
	}

	public static void main(String[] args) {
		int[] intArr = { 3, 6, 4, 7, 10, 2, 9 };
		InsertionSort.sort(intArr);
		System.out.println(Arrays.toString(intArr));
	}
}
