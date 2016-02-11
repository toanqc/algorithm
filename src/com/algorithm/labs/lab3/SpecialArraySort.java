package com.algorithm.labs.lab3;

import java.util.Arrays;

public class SpecialArraySort {

	public static void main(String[] args) {
		//int[] arr1 = { 0, 1, 0, 2, 0, 1 };
		int[] arr2 = { 1, 0, 0, 2, 2, 1, 0 };
		//System.out.println(Arrays.toString(sortArray(arr1)));
		System.out.println(Arrays.toString(sortArray(arr2)));
	}

	/**
	 * An array A holds n integers, and all integers in A belong to the set
	 * {0,1, 2}. Describe an O(n) sorting algorithm for putting A in sorted
	 * order. Your algorithm may not make use of auxiliary storage such as
	 * arrays or hashtables (more precisely, the only additional space used,
	 * beyond the given array, is O(1)). Give an argument to explain why your
	 * algorithm runs in O(n) time.
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] sortArray(int[] arr) {
		int zeroIndex = 0;
		int oneIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				swap(arr, zeroIndex, i);
				zeroIndex++;
			} else if (arr[i] == 1) {
				swap(arr, zeroIndex++, i);
				oneIndex = zeroIndex + 1;
			} else if (arr[i] == 2) {
				swap(arr, oneIndex++, i);
			}
		}

		return arr;
	}

	private static int[] swap(int[] arr, int source, int target) {
		int temp = arr[source];
		arr[source] = arr[target];
		arr[target] = temp;

		return arr;
	}
}
