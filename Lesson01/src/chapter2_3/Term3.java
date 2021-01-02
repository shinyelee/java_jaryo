package chapter2_3;

public class Term3 {
	
	public int coef;
	private int expo; // ĸ��ȭ
	
	public Term3(int c, int e) {
		coef = c;
		expo = e;
	}
	
	public int getExpo() { // getter method
		return expo;	   // �б�(O) ����(x)
	}					   // �ǵ�ġ ���� ���� ����
	
	public int calcTerm(int x) {
		return (int) (coef * Math.pow(x, expo));
	}

	public void printTerm() {
		System.out.print(coef + "x^" + expo);
	}

}
