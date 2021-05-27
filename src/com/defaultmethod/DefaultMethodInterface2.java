package com.defaultmethod;

/**
 * 1. Default methods allow the interfaces to have methods with implementation
 * without affecting the classes that implement the interface.
 * 
 * 2. It provide backward compatibility so that existing interfaces can use the
 * lambda expressions without implementing the methods in the implementation
 * class.
 * 
 * @author Tejas
 *
 */
public interface DefaultMethodInterface2 {

	// abstract method
	public void square(int a);

	// default method
	default void show() {

		System.out.println("Interface2 show method :");
	}

	
}
