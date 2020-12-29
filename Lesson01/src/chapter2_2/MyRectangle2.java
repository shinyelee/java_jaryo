package chapter2_2;

public class MyRectangle2 {
	
	public MyPoint2 lu;
	public int width;
	public int height;
	
	// �ϳ��� Ŭ������ 2�� �̻��� �����ڸ� ���� �� �ִ�.
	// ��, �����ڵ��� �Ű������� ������ Ÿ�Կ� �־ ���̰� �־�� �Ѵ�.
	// ��ü�� ������ �� � �Ű������� �����ϴ��Ŀ� ����
	// �ش�Ǵ� �����ڰ� ���õǾ� �����Ѵ�.
	
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
