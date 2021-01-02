package chapter2_3;

public class Term3 {
	
	public int coef;
	private int expo; // 캡슐화
	
	public Term3(int c, int e) {
		coef = c;
		expo = e;
	}
	
	public int getExpo() { // getter method
		return expo;	   // 읽기(O) 수정(x)
	}					   // 의도치 않은 오류 방지
	
	public int calcTerm(int x) {
		return (int) (coef * Math.pow(x, expo));
	}

	public void printTerm() {
		System.out.print(coef + "x^" + expo);
	}

}
