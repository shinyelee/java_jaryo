package projectInheritance;

class Cal {
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
}

class Cal3 extends Cal { // Cal Ŭ������ Ȯ���Ѵٴ� �ǹ�.
	// ������ �޼ҵ带 ����� �ٸ� Ŭ������ ���� ��.
	// -> ���뼺�� ���������� �������� �ڵ���
}

public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println("c : " + c.sum(2, 1));
		
		Cal c3 = new Cal3(); // Cal Ŭ���� ��ӵ�.
		System.out.println("c3 : " + c3.sum(2, 1));
	}

}

class Cal2 {
	public int sum(int v1, int v2) { // Cal Ŭ������ �ߺ��� �ڵ�.
		return v1 + v2;
	}
	
	public int minus(int v1, int v2) {
		return v1 - v2;
	}
}