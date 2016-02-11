package com.algorithm.leetcode;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Given a list of non negative integers, arrange them such that they form the
 * largest number.
 * 
 * For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 * 
 * Note: The result may be very large, so you need to return a string instead of
 * an integer.
 * 
 * @author qct
 */
public class LargestNumber {

	public String largestNumber(int[] nums) {
		if (nums.length == 0) {
			return String.valueOf(0);
		}
		if (nums.length == 1) {
			return String.valueOf(nums[0]);
		}

		String[] strArr = initStringArray(nums);
		sortStringArray(strArr);
		BigInteger largestNumber = buildLargestString(strArr);

		return String.valueOf(largestNumber);
	}

	private BigInteger buildLargestString(String[] strArr) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strArr.length; i++) {
			sb.append(strArr[i]);
		}

		BigInteger largestNumber = new BigInteger(sb.toString());
		return largestNumber;
	}

	private void sortStringArray(String[] strArr) {
		Arrays.sort(strArr, new Comparator<String>() {
			@Override
			public int compare(String left, String right) {
				String leftRight = left.concat(right);
				String rightLeft = right.concat(left);
				return rightLeft.compareTo(leftRight);
			}
		});
	}

	private String[] initStringArray(int[] nums) {
		String[] strArr = new String[nums.length];

		for (int i = 0; i < nums.length; i++) {
			strArr[i] = String.valueOf(nums[i]);
		}
		return strArr;
	}

	public static void main(String[] args) {
		LargestNumber largestNumber = new LargestNumber();
		largestNumber.largestNumber(new int[] {3, 30, 34, 5, 9});
	}
}
