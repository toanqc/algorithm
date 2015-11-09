package com.algrothim.labs.lab4;

import java.util.Arrays;

public class MergeSortPlus {

	private int[] sortedArray;
	private int length;

	/**
	 * 
	 * @param inputArray
	 * @return
	 */
	public int[] sort(int[] inputArray) {
		length = inputArray.length;
		int[] tempArray = new int[length];
		sortedArray = inputArray;
		mergeSort(tempArray, 0, length - 1);

		return sortedArray;
	}

	private void mergeSort(int[] tempArray, int low, int high) {
		if (low == high) {
			return;
		}

		if (high - low <= 20) {
			insertionSort(low, high);
		} else {
			int middle = (low + high) / 2;
			mergeSort(tempArray, low, middle);
			mergeSort(tempArray, middle + 1, high);
			merge(tempArray, low, middle, high);
		}
	}

	private void merge(int[] tempArray, int low, int middle, int high) {
		int index = 0;
		int i = low;
		int j = middle + 1;

		while (i <= middle && j <= high) {
			if (sortedArray[i] < sortedArray[j]) {
				tempArray[index++] = sortedArray[i++];
			} else {
				tempArray[index++] = sortedArray[j++];
			}
		}

		// copy remaining value of left side
		while (i <= middle) {
			tempArray[index++] = sortedArray[i++];
		}

		// copy remaining value of right side
		while (j <= high) {
			tempArray[index++] = sortedArray[j++];
		}

		// copy tempArray back to sortedArray
		while (index < high - low - 1) {
			sortedArray[low + index] = tempArray[index++];
		}

	}

	private void insertionSort(int low, int high) {
		for (int i = low; i <= high; i++) {
			int key = sortedArray[i];
			int j = i - 1;
			while ((j > low - 1) && (sortedArray[j] > key)) {
				sortedArray[j + 1] = sortedArray[j];
				j--;
			}
			sortedArray[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		MergeSortPlus mergeSortPlus = new MergeSortPlus();

		int[] inputArray = { 5, 6, 2, 3, 4, 9, 1 };
		System.out.println(Arrays.toString(mergeSortPlus.sort(inputArray)));

		int[] intArr = { 1, 3, 9, 6, 10, 30, 19, 35, 0, 40, 11 };
		System.out.println(Arrays.toString(mergeSortPlus.sort(intArr)));
	}
}
