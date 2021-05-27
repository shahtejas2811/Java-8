package com.pojo;

public class Shape {

	private Type type;
	private Color color;
	private int weight;

	public enum Type {
		SQUARE, CRICLE, TRIGLE;
	}

	public enum Color {
		BLUE, YELLO, GREEN;
	}

	public Shape(Type type, Color color, int weight) {
		super();
		this.type = type;
		this.color = color;
		this.weight = weight;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Shape [type=" + type + ", color=" + color + ", weight=" + weight + "]";
	}
	

}
