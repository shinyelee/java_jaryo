package chapter2_3;

public class TestTest {

	public static void main(String[] args) {
		
		Test test1 = new Test();
		test1.t = 10; // ��ü ���
		Test.s = 100; // Ŭ���� ���
		test1.print2();
		
		Test test2 = new Test();
		Test.print1();  // Ŭ���� ���
		test1.print2(); // ��ü ���

	}

}
