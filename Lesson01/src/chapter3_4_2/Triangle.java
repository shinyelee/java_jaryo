package chapter3_4_2;

public class Triangle extends Shape {
	public int width;
	public int height;
	
	public Triangle(int w, int h) {
		super("Rectangle");
		width = w;
		height = h;
	}
	
	public double computeArea() {
		return (double)width*height/2;
	}
	
	public double computePerimeter() {
		return 2.0*(width+height);
	}
	
	public String toString() {
		return "Tritangle: width is " + width + ", height is " + height;
	}
}
