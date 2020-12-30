package chapter2_2;

public class OrthoLine {

	public MyPoint2 u; // 한쪽 끝 점
	public MyPoint2 v; // 다른쪽 끝 점
	
	public OrthoLine(MyPoint2 p, MyPoint2 q) {
		u = p;
		v = q;
		if(p.x>q.x || p.x==q.x && p.y>q.y)
			swap();
	}
	
	// 수직 선분의 경우 위쪽이 u, 아래쪽이 v
	// 수평 선분의 경우 왼쪽이 u, 오른쪽이 v
	
	private void swap() {
		MyPoint2 tmp = u;
		u = v;
		v = tmp;
	}
	
	public OrthoLine(int x1, int y1, int x2, int y2) {
		u = new MyPoint2(x1, y1);
		v = new MyPoint2(x2, y2);
	}
	
	public boolean isVertical() { // 수직 선분인지 검사.
		return u.x == v.x;
	}
	
	public boolean intersects(OrthoLine other) { // 두 선분이 교차하는지 검사.
		if(isVertical() && !other.isVertical()) {
			return(other.u.x<u.x && other.v.x>u.x && u.y<other.u.y && v.y>other.u.y);
		}
		else if(!isVertical() && other.isVertical()) {
			return(other.u.y<u.y && other.v.y>u.y && u.x<other.u.x && v.x>other.u.x);
		}
		else
			return false;
	}
}
