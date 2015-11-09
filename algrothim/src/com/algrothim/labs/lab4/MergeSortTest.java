package com.algrothim.labs.lab4;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class MergeSortTest {

	private int[] intArray;
	private static final int ARRAY_LENGTH = 100000;
	private static final int MAX_NUMBER = 100;

	@Before
	public void setUp() throws Exception {
		intArray = new int[ARRAY_LENGTH];
		Random generator = new Random();
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = generator.nextInt(MAX_NUMBER);
		}
	}

	@Test
	public void testMergeSort() {
		long startTime = System.nanoTime();
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(intArray);
		long stopTime = System.nanoTime();
		System.out.println("Merge Sort: " + (stopTime - startTime));
	}

	@Test
	public void testMergeSortPlus() {
		long startTime = System.nanoTime();
		MergeSortPlus mergeSortPlus = new MergeSortPlus();
		mergeSortPlus.sort(intArray);
		long stopTime = System.nanoTime();
		System.out.println("Merge Sort Plus: " + (stopTime - startTime));
	}
}
