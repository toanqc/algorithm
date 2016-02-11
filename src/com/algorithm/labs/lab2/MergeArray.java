package com.algorithm.labs.lab2;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 5, 8, 17 };
		int[] arr2 = { 2, 4, 8, 11, 13, 21, 23, 25 };

		int[] result = MergeArray.merge(arr1, arr2);
		System.out.println(Arrays.toString(result));
	}

	/**
	 * 
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		int index = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				result[index] = arr1[i];
				i++;
			} else {
				result[index] = arr2[j];
				j++;
			}
			index++;
		}

		if (i < arr1.length) {
			for (; i < arr1.length; i++) {
				result[index] = arr1[i];
				index++;
			}
		} else if (j < arr2.length) {
			for (; j < arr2.length; j++) {
				result[index] = arr2[j];
				index++;
			}
		}

		return result;
	}
}
