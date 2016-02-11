package com.algorithm.mum.entry.one;

public class MyReversion {

	public String reverseString(String str) {
		if (str.length() <= 1) {
			return str;
		}

		return reverseString(str.substring(1)) + str.charAt(0);
	}

	public int fibonacci(int number) {
		if (number <= 1) {
			return number;
		}

		return fibonacci(number - 1) + fibonacci(number - 2);
	}

	public static void main(String[] args) {
		MyReversion myReversion = new MyReversion();
		String result = myReversion.reverseString("hello");
		System.out.println(result);
		System.out.println(myReversion.fibonacci(8));
	}
}
