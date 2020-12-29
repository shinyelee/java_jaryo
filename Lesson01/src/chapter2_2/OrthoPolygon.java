package chapter2_2;

public class OrthoPolygon {

	public int n = 0; // ����� �������� ����
	public MyPoint2 [] vertices; // ��������
	
	public OrthoPolygon(int k) { // �������� ������ k���� �ٰ����� ����.
		vertices = new MyPoint2 [k];
	}
	
	public void addVertex(int x, int y) { // ���ο� �������� �ϳ� �߰�.
		vertices[n++] = new MyPoint2(x, y);
	}
	
	public int maxX() { // ���������� x-��ǥ�� �ִ밪�� ã�Ƽ� ��ȯ.
		int max = vertices[0].x;
		for(int i=0; i<n; i++)
			if(vertices[i].x>max)
				max = vertices[i].x;
		return max;
	}
	
	public boolean contains(MyPoint2 p)	{ // �� p�� �ٰ��� ���� ���ԵǴ��� �˻�.
		OrthoLine arrow = new OrthoLine(p, new MyPoint2(maxX()+1, p.y));
		// �� p���� ���� �������� �ٰ��� �ܺα��� ����� �ϳ��� ���� arrow�� �����.
		// p�� �ݴ��� ���� x��ǥ�� ���������� x��ǥ�� �ִ밪���� 1�� ũ�Ƿ�
		// �� ���� �ݵ�� �ٰ����� �ܺο� �ִ�.
		int count = 0;
		for(int i=0; i<n; i++) {
			OrthoLine edge = new OrthoLine(vertices[i], vertices[(i+1)%n]);
			// n-1��° ������ ������ ������(vertex[n-1])�� ù��° ������(vertex[0])�� ����.			
			if(edge.intersects(arrow))
			// arrow�� �����ϴ� �ٰ����� ���� ������ ī��Ʈ.
			// ����� ¦���� ����, Ȧ���� �ܺ�.
				count++;
		}
		return count%2 != 0;
	}
}
