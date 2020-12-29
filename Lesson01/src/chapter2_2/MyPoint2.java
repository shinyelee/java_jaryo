package chapter2_2;

public class MyPoint2 {
	
	public int x;
	public int y;
	
	
	public MyPoint2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

// 생성자가 없을 때는 다음과 같이 객체를 생성한 후 따로 데이터 멤버의 값을 초기화했다.
//	MyPoint1 pt1 = new MyPonit1();
//	pt1.x = 3;
//	pt1.y = 2;

// 생성자가 있으면 다음과 같이 객체의 생성과 초기화를 한 번에 할 수 있다.
//	MyPoint2 pt2 = new MyPoint2(3, 2);