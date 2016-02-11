package com.algorithm.leetcode;

/**
 * You are a product manager and currently leading a team to develop a new
 * product. Unfortunately, the latest version of your product fails the quality
 * check. Since each version is developed based on the previous version, all the
 * versions after a bad version are also bad.
 * 
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first
 * bad one, which causes all the following ones to be bad.
 * 
 * You are given an API bool isBadVersion(version) which will return whether
 * version is bad. Implement a function to find the first bad version. You
 * should minimize the number of calls to the API.
 * 
 * @author qct
 *
 */
public class FirstBadVersion extends VersionControl {
	public int firstBadVersion(int n) {
		int start = 1;
		int end = n;
		int middle;
		while (start <= end) {
			middle = ((end - start) >> 1) + start;
			if (isBadVersion(middle))
				end = middle - 1;
			else
				start = middle + 1;
		}
		return end + 1;
	}
}

class VersionControl {
	public boolean isBadVersion(int version) {
		return true;
	}
}
