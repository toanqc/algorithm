package com.algorithm.mum.entry.one;

public interface InterfaceB extends InterfaceA {

	default String method() {
		return "InterfaceB";
	}
}
