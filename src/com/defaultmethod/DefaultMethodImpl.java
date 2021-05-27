package com.defaultmethod;

/**
 * With default functions in interfaces, there is a possibility that a class is
 * implementing two interfaces with same default methods.
 * 
 * Complier gives error "Duplicate default methods named show with the
 * parameters () and () are inherited from the mupltiple interface"
 * 
 * The following code explains how this ambiguity can be resolved.
 * 
 *  1. To create an own method that overrides the default implementation. 
 *  2. To call the default method of the specified interface using super.
 * 
 *
 */
public class DefaultMethodImpl implements DefaultMethodInterface1, DefaultMethodInterface2 {

	@Override
	public void square(int a) {
		System.out.println("Square of a :" + a * a);
	}

	// Cannot reduce visibilty from public to protected, default & private of
	// show method
	// because show method define into interface as default method
	public void show() {
		DefaultMethodInterface1.super.show();
		System.out.println("implementation class show method :");
	}

	public static void main(String[] args) {
		DefaultMethodInterface1 df = new DefaultMethodImpl();
		df.show();
		DefaultMethodInterface1.display();

	}

}
