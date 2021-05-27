package com.steamproblem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import com.pojo.Shape;

/**
 * Given Shape list, get lightest blue circle
 * @author Tejas
 *
 */
public class ShapeProcessing {

	public static void main(String[] args) {
		
		List<Shape> shapes = Arrays.asList(new Shape(Shape.Type.CRICLE, Shape.Color.BLUE, 15),
										   new Shape(Shape.Type.CRICLE, Shape.Color.BLUE, 5),
										   new Shape(Shape.Type.CRICLE, Shape.Color.BLUE, 10),
										   new Shape(Shape.Type.TRIGLE, Shape.Color.BLUE, 15),
										   new Shape(Shape.Type.CRICLE, Shape.Color.YELLO, 15),
										   new Shape(Shape.Type.SQUARE, Shape.Color.BLUE, 15),
										   new Shape(Shape.Type.TRIGLE, Shape.Color.BLUE, 15));
		proceessingShapes(shapes);
	}

	private static void proceessingShapes(List<Shape> shapes) {
		
		shapes.stream()
		.filter(shapePredicate)
		// we can direct use lambdas 
		.filter(shape -> shape.getColor() == Shape.Color.BLUE)
		.sorted(Comparator.comparing(Shape::getWeight))
		.limit(2)
		.map(shape -> shape.getWeight()) // to extract weight from Shape Object
		.forEach(System.out::println);
		
	}

	private static  Predicate<Shape> shapePredicate =  new Predicate<Shape>() {

		@Override
		public boolean test(Shape t) {
			
			return t.getType() == Shape.Type.CRICLE;
		}
	};


}
