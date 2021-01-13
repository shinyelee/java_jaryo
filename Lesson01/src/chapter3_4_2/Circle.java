package chapter3_4_2;

public class Circle extends Shape {
	public int radius;
	
	public Circle(int r) {
		super("Circle");
		radius = r;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double computeArea() {
		return Math.PI*radius*radius;
	}
	
	public double computePerimeter() {
		return 2.0*Math.PI*radius;
	}
	
	public String toString() {
		return "Circle: radius is " + radius;
	}
}
