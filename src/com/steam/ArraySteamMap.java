package com.steam;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

/**
 * Using steam API .Write one line code to achieve following requirements Input
 * List = {1, 2, 3, 4} O/P List = {1, 4, 9, 16}
 * 
 * @author Tejas
 *
 */
public class ArraySteamMap {

	private static IntUnaryOperator square = (x) -> x * x;

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };
		IntStream.of(a) // Create
				// .map(i -> i*i) //Process
				.map(square) // Process
				.forEach(System.out::println); // consume

	}

}
