package chapter2_2;

public class OrthoLine {

	public MyPoint2 u; // ���� �� ��
	public MyPoint2 v; // �ٸ��� �� ��
	
	public OrthoLine(MyPoint2 p, MyPoint2 q) {
		u = p;
		v = q;
		if(p.x>q.x || p.x==q.x && p.y>q.y)
			swap();
	}
	
	// ���� ������ ��� ������ u, �Ʒ����� v
	// ���� ������ ��� ������ u, �������� v
	
	private void swap() {
		MyPoint2 tmp = u;
		u = v;
		v = tmp;
	}
	
	public boolean isVertical() { // ���� �������� �˻�.
		return u.x == v.x;
	}
	
	public boolean intersects(OrthoLine other) { // �� ������ �����ϴ��� �˻�.
		if(isVertical() && !other.isVertical()) {
			return(other.u.x<u.x && other.v.x>u.x && other.u.y>u.y && other.u.y<v.y);
		}
		else if(!isVertical() && other.isVertical()) {
			return(other.u.y<u.y && other.v.y>u.y && other.u.x>u.x && other.u.x<v.x);
		}
		else
			return false;
	}
}
