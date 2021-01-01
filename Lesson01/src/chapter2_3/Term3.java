package chapter2_3;

public class Term3 {
	
	public int coef;
	public int expo;
	
	// 클래스 안에 클래스와 동일한 이름을 가지며 return 타입이 없는 메서드를
	// 생성자(constructor)라고 한다.
	// 생성자는 new 명령으로 객체가 생성될 때 자동으로 실행된다.
	// 주 목적은 객체의 데이터 필드 값을 초기화하는 것이다.

	public Term3(int c, int e) { // 생성자(리턴 타입 없음)
		coef = c;
		expo = e;
	}
	
	public int calcTerm(int x) { // 리턴 타입 : int
		return (int) (coef * Math.pow(x, expo));
	}

	public void printTerm() { // 리턴 타입 : void
		System.out.print(coef + "x^" + expo);
	}

}
