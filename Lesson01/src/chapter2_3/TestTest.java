package chapter2_3;

public class TestTest {

	public static void main(String[] args) {
		
		Test test1 = new Test();
		test1.t = 10; // °´Ã¼ ¸â¹ö
		Test.s = 100; // Å¬·¡½º ¸â¹ö
		test1.print2();
		
		Test test2 = new Test();
		Test.print1();  // Å¬·¡½º ¸â¹ö
		test1.print2(); // °´Ã¼ ¸â¹ö

	}

}
