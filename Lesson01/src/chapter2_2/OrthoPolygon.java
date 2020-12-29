package chapter2_2;

public class OrthoPolygon {

	public int n; // 저장된 꼭지점의 개수
	public MyPoint2 [] vertices; // 꼭지점들
	
	public OrthoPolygon(int k) { // 꼭지점의 개수가 k개인 다각형을 만듦.
		n = 0;
		vertices = new MyPoint2 [k];
	}
	
	public void addVertex(int x, int y) { // 새로운 꼭지점을 하나 추가.
		vertices[n++] = new MyPoint2(x, y);
	}
	
	public int maxX() { // 꼭지점들의 x-좌표의 최대값을 찾아서 반환.
		int max = vertices[0].x;
		for(int i=0; i<n; i++) {
			if(vertices[i].x>max)
				max = vertices[i].x;
		}
		return max;
	}
	
	public boolean contains(MyPoint2 p)	{ // 점 p가 다각형 내에 포함되는지 검사.
		OrthoLine arrow = new OrthoLine(p, new MyPoint2(maxX()+1, p.y));
		// 점 p에서 왼쪽 방향으로 다각형 외부까지 뻗어가는 하나의 선분 arrow를 만든다.
		// p의 반대쪽 점의 x좌표가 꼭지점들의 x좌표의 최대값보다 1이 크므로
		// 이 점은 반드시 다각형의 외부에 있다.
		int count = 0;
		for(int i=0; i<n; i++) {
			OrthoLine edge = new OrthoLine(vertices[i], vertices[(i+1)%n]);
			// n-1번째 선분은 마지막 꼭지점(vertex[n-1])과 첫번째 꼭지점(vertex[0])을 연결.			
			if(arrow.intersects(edge))
			// arrow와 교차하는 다각형의 변의 개수를 카운트.
			// 결과가 짝수면 내부, 홀수면 외부.
				count++;
		}
		return(count%2 == 1);
	}
}
