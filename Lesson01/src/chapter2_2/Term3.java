package chapter2_2;

public class Term3 {
	
	public int coef;
	public int expo;
	
	// Ŭ���� �ȿ� Ŭ������ ������ �̸��� ������ return Ÿ���� ���� �޼��带
	// ������(constructor)��� �Ѵ�.
	// �����ڴ� new ������� ��ü�� ������ �� �ڵ����� ����ȴ�.
	// �� ������ ��ü�� ������ �ʵ� ���� �ʱ�ȭ�ϴ� ���̴�.

	public Term3(int c, int e) { // ������(���� Ÿ�� ����)
		coef = c;
		expo = e;
	}
	
	public int calcTerm(int x) { // ���� Ÿ�� : int
		return (int) (coef * Math.pow(x, expo));
	}

	public void printTerm() { // ���� Ÿ�� : void
		System.out.print(coef + "x^" + expo);
	}

}
