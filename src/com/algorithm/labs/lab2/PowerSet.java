package com.algorithm.labs.lab2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PowerSet {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");

		List<Set<String>> powerSet = PowerSet.powerSet(list);
		for (Set<String> set : powerSet) {
			for (String string : set) {
				System.out.print(string);
			}
			System.out.println();
		}
	}

	/**
	 * 
	 * @param list
	 * @return
	 */
	public static <T> List<Set<T>> powerSet(List<T> list) {
		List<Set<T>> result = new ArrayList<>();
		result.add(new HashSet<>());

		Iterator<T> iter = list.iterator();
		while (iter.hasNext()) {
			T tObj = iter.next();
			int length = result.size();
			for (int i = 0; i < length; i++) {
				Set<T> setTemp = new HashSet<>(result.get(i));
				setTemp.add(tObj);
				result.add(setTemp);
			}
		}

		return result;
	}
}
