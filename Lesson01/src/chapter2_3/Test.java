package chapter2_3;

public class Test {

	static int s = 0;
	int t = 0;
	
	// �� static �޼��忡�� ���� Ŭ������ non-static ����� ������ �� �� ���°�?
	// -> static ����� class ����̰�
	// non-static ����� object �����.
	
	public static void print1() {		
		System.out.println("s = " + s);	
//		System.out.println("t = " + t);
	}
	
	public void print2() {	
		System.out.println("s = " + s);
		System.out.println("t = " + t);
	}
	
	public static void main(String[] args) {
		s = 100;
//		t = 100;
		print1();
//		print2();
		
		// �̷��� ��ü �����ϸ� t, print2 ȣ�� ����.
		Test test1 = new Test();
		test1.t = 100;
		test1.print2();
	}
}
