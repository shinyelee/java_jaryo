package chapter2_3;

public class Term3 {
	
	private int coef; // 캡슐화(자동)
	private int expo; // 캡슐화(수동)
	
	public Term3(int c, int e) {
		setCoef(c);
		expo = e;
	}
	
	public int getExpo() { // getter method
		return expo;	   // 읽기(O) 수정(x)
	}					   // 의도치 않은 오류 방지
	
	public int calcTerm(int x) {
		return (int) (getCoef() * Math.pow(x, expo));
	}

	public void printTerm() {
		System.out.print(getCoef() + "x^" + expo);
	}

	public int getCoef() { // getter, accessor
		return coef;
	}

	public void setCoef(int coef) { // setter, mutator
		this.coef = coef;
	}

}
