package com.defaultmethod;

/**
 * 1. Default methods allow the interfaces to have methods with implementation
 * without affecting the classes that implement the interface.
 * 
 * 2. It provide backward compatibility so that existing interfaces can use the
 * lambda expressions without implementing the methods in the implementation
 * class.
 * 
 * For example, ‘List’ or ‘Collection’ interfaces do not have ‘forEach’ method
 * declaration. Thus, adding such method will simply break the collection
 * framework implementations. Java 8 introduces default method so that
 * List/Collection interface can have a default implementation of forEach
 * method, and the class implementing these interfaces need not implement the
 * same.
 * 
 * After having default and static methods inside the interface, we think about
 * the need of abstract class in Java. An interface and an abstract class is
 * almost similar except that you can create constructor in the abstract class
 * whereas you can't do this in interface.
 * 
 * @author Tejas
 *
 */
public interface DefaultMethodInterface1 {

	// abstract method
	public void square(int a);

	// default method
	default void show() {

		System.out.println("Interface1 show method :");
	}

	// static method
	static void display() {

		System.out.println("Interface display method :");
	}

}
