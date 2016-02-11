package com.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

	public boolean isHappy(int number) {
		int workingNumber = number;
		int total = 0;
		do {
	        List<Integer> listInt = extractAllNumbers(workingNumber);
	        total = sumDigitSquare(listInt);
	        workingNumber = total;
		} while (total > 9);

		if (total == 1) {
        	return true;
        }
        return false;
    }

	private int sumDigitSquare(List<Integer> listInt) {
		int total = 0;
		for (Integer integer : listInt) {
			total += (integer * integer);
		}
		return total;
	}

	private List<Integer> extractAllNumbers(int number) {
		// 879;
		int remainingNumber = number;
		List<Integer> listInt = new ArrayList<Integer>();
		while(remainingNumber > 0) {
			listInt.add(remainingNumber % 10);
			remainingNumber = remainingNumber / 10;
        }
		return listInt;
	}

	public static void main(String[] args) {
		HappyNumber happyNumber = new HappyNumber();
		System.out.println(happyNumber.isHappy(19));
		System.out.println(happyNumber.isHappy(20));
		System.out.println(happyNumber.isHappy(678));
	}
}
