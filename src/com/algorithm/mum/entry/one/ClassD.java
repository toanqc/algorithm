package com.algorithm.mum.entry.one;

public class ClassD implements InterfaceB, InterfaceC {

	@Override
	public String method() {
		return InterfaceB.super.method();
	}

}
