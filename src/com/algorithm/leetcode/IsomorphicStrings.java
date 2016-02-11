package com.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Isomorphic Strings
 * 
 * Given two (dictionary) words as Strings, determine if they are isomorphic.
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character but a character may map to itself.
 * 
 * Example: Given "egg", "add", return true. --> Can map 'e' -> 'a' and 'g' ->
 * 'd' Given "foo", "bar", return false. --> Can't map 'f' -> 'b' and 'oo' to
 * 'ar' Given "paper", "title", return true.
 */

public class IsomorphicStrings {

	public boolean isIsomorphic(String s, String t) {
		if (s == null && t == null) {
			return true;
		}
		if (s == null || t == null) {
			return false;
		}
		if (s.length() != t.length()) {
			return false;
		}

		Map<Character, Character> mapS = new HashMap<Character, Character>();
		Map<Character, Character> mapT = new HashMap<Character, Character>();

		for (int i = 0; i < s.length(); i++) {
			char charAtS = s.charAt(i);
			char charAtT = t.charAt(i);

			if (mapS.containsKey(charAtS)) {
				if (mapS.get(charAtS) != charAtT) {
					return false;
				}
			} else if (mapT.containsKey(charAtT)) {
				return false;
			}

			mapS.put(charAtS, charAtT);
			mapT.put(charAtT, charAtS);
		}
		
		return true;
	}


	public static void main(String[] args) {
		IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
		System.out.println(isomorphicStrings.isIsomorphic("ab", "ca"));
	}
}
