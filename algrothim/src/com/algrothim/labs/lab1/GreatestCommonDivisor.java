package com.algrothim.labs.lab1;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		System.out.println(GreatestCommonDivisor.gcd(12, 20));
	}

	/**
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public static int greatestCommon(int m, int n) {
		int smaller = m > n ? n : m;
		int gcd = 1;
		for (int i = 0; i < smaller; i++) {
			if (m % i == 0 && n % i == 0) {
				gcd = i;
			}
		}

		return gcd;
	}

	/**
	 * GCD Algorithm. Write a Java method int gcd(int m, int n) which accepts
	 * positive integer inputs m, n and outputs the greatest common divisor of m
	 * and n.
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public static int gcd(int m, int n) {
		if (m < n) {
			int temp = m;
			m = n;
			n = temp;
		}
		while (n > 0) {
			int r = m % n;
			m = n;
			n = r;
		}
		return m;
	}
}
