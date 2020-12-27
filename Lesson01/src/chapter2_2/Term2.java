package chapter2_2;

public class Term2 {
	
	// 클래스는 서로 관련있는 데이터를 하나의 단위로 묶어둘 뿐만 아니라
	// 그 데이터와 관련이 있는 메서드도 함께 묶어둘 수 있다.
	// -> 코드의 응집도를 높이고 결합도를 낮출 수 있다.
	
	// printTerm과 calcTerm은 Term과 관련이 있는 메서드들이다.
	// 이렇게 서로 관련성이 깊은 데이터와 메서드들을 하나의 클래스로 묶어둘 수 있다.
	
	public int coef;
	public int expo;
	
	public int calcTerm(int x) {
		return (int) (coef * Math.pow(x, expo));
	}
	// calcTerm은 어떤 Term의 일부분이며 자기자신의 값을 계산해 반환한다.
	// 따라서 매개변수로 어떤 항을 받을 필요가 없다.
	
	public void printTerm() {
		System.out.print(coef + "x^" + expo);
	}
	// printTerm은 어떤 Term의 일부분이며 자기자신을 출력하는 기능을 수행한다.
	// 따라서 역시 매개변수로 어떤 항을 받을 필요가 없다.
	
}

// 클래스는 설계도지 실체가 아니다.
// 우리가 실행하는 것은 클래스가 아니라 각각의 객체 안에 있는 메서드들이다.
// 즉, 각각의 객체 안에 calcTerm과 printTerm 메서드가 존재한다.