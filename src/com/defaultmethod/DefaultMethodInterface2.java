package com.defaultmethod;

public interface DefaultMethodInterface2 {

	// abstract method
	public void square(int a);

	// default method
	default void show() {

		System.out.println("Interface2 show method :");
	}

	
}
