package com.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CountPrimes {

	public int countPrimes(int number) {
		if (number <= 2) {
			return 0;
		}

		boolean[] primes = initPrimeArray(number);
		markNonPrimeNumberAsFalse(number, primes);

		return countPrime(number, primes);
	}

	private void markNonPrimeNumberAsFalse(int number, boolean[] primes) {
		for (int i = 2; i < number; i++) {
			if (primes[i]) {
				for (int j = i + i; j < number; j += i) {
					primes[j] = false;
				}
			}
		}
	}

	private boolean[] initPrimeArray(int number) {
		boolean[] primes = new boolean[number];
		for (int i = 2; i < number; i++) {
			primes[i] = true;
		}
		return primes;
	}

	private int countPrime(int number, boolean[] primes) {
		int counter = 0;
		for (int i = 2; i < number; i++) {
			if (primes[i]) {
				counter++;
			}
		}
		return counter;
	}

	private int countPrimeNumber(List<Integer> listInt) {
		int count = 0;
		for (int i = 2; i < listInt.size(); i++) {
			if (listInt.get(i) != -1) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		CountPrimes countPrimes = new CountPrimes();
		int counter = countPrimes.countPrimes(1500000);
		System.out.println(counter);
	}

	public int countPrimesNumberFirstSolution(int n) {
		int counter = 0;
		if (n <= 1) {
			return 0;
		}

		for (int i = 2; i < n; i++) {
			if (isPrimeNumber(i)) {
				counter++;
			}
		}
		return counter;
	}

	private boolean isPrimeNumber(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int countPrimesSecondSolution(int number) {
		if (number <= 2) {
			return 0;
		}

		List<Integer> listInt = getListInt(number);
		markNonPrimeNumberAsNegative(listInt);
		return countPrimeNumber(listInt);
	}

	private List<Integer> getListInt(int number) {
		List<Integer> listInt = new ArrayList<Integer>();
		for (int i = 2; i < number; i++) {
			listInt.add(i);
		}
		return listInt;
	}

	private void markNonPrimeNumberAsNegative(List<Integer> listInt) {
		for (int i = 2; i <= listInt.size() - 1; i++) {
			Integer integer = listInt.get(i);
			if (integer != -1) {
				for (int j = i + i; j < listInt.size(); j += i) {
					listInt.set(j, Integer.valueOf(-1));
				}
			}
		}
	}
}
