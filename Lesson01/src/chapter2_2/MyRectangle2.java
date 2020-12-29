package chapter2_2;

public class MyRectangle2 {
	
	public MyPoint2 lu;
	public int width;
	public int height;
	
	// 하나의 클래스가 2개 이상의 생성자를 가질 수 있다.
	// 단, 생성자들은 매개변수의 개수나 타입에 있어서 차이가 있어야 한다.
	// 객체를 생성할 때 어떤 매개변수를 제공하느냐에 따라서
	// 해당되는 생성자가 선택되어 실행한다.
	
	public MyRectangle2(int x, int y, int w, int h) {
		lu = new MyPoint2(x, y);
		width = w;
		height = h;
	}
	
	public MyRectangle2(MyPoint2 p, int w, int h) {
		lu = p;
		width = w;
		height = h;
	}
	
	public int calcArea() {
		return width * height;
	}
	
	public String toString() {
		return "(" + lu.x + ", " + lu.y + ") " + width + " " + height;
	}
}
