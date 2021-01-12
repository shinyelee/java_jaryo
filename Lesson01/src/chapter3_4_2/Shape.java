package chapter3_4_2;

public abstract class Shape {
	private String shapeName;
	
	public Shape(String name) {
		shapeName = name;
	}
	
	public abstract double computerArea();
	public abstract double computerPerimeter();
}
