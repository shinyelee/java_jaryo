package chapter2_3;

public class Term3 {
	
	private int coef; // ĸ��ȭ(�ڵ�)
	private int expo; // ĸ��ȭ(����)
	
	public Term3(int c, int e) {
		setCoef(c);
		expo = e;
	}
	
	public int getExpo() { // getter method
		return expo;	   // �б�(O) ����(x)
	}					   // �ǵ�ġ ���� ���� ����
	
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
