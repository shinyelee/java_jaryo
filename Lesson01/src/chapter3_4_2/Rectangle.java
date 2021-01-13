package chapter3_4_2;

public class Rectangle extends Shape {
	private int width;
	private int height;
	
	public Rectangle(int w, int h) {
		super("Rectangle");
		width = w;
		height = h;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public double computeArea() {
		return (double)width*height;
	}
	
	public double computePerimeter() {
		return 2.0*(width+height);
	}
	
	public String toString() {
		return "Rectangle: width is " + width + ", height is " + height;
	}
}
