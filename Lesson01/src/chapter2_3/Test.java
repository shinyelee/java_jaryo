package chapter2_3;

public class Test {

	static int s = 0;
	int t = 0;
	
	// 왜 static 메서드에서 같은 클래스의 non-static 멤버를 엑세스 할 수 없는가?
	// -> static 멤버는 class 멤버이고
	// non-static 멤버는 object 멤버다.
	
	public static void print1() {		
		System.out.println("s = " + s);	
//		System.out.println("t = " + t);
	}
	
	public void print2() {	
//		System.out.println("s = " + s);
		System.out.println("t = " + t);
	}
	
	public static void main(String[] args) {
		s = 100;
//		t = 100;
		print1();
//		print2();
		
		// 이렇게 객체 생성하면 t, print2 호출 가능.
		Test test1 = new Test();
		test1.t = 100;
		test1.print2();
	}
}
