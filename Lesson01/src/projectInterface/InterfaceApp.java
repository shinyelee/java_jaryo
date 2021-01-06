package projectInterface;

// �������̽����� �޼ҵ�� ���� ���� ����
// (�޼ҵ� ���ǽ� ������ ���� ����).
interface Calculable {
	double PI = 3.14;
	int sum(int v1, int v2);
}

interface Printable {
	void print();
}

// �ϳ��� Ŭ������ �������� �������̽��� ������ �� �ִ�.
class RealCal implements Calculable, Printable {

	@Override
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	public void print() {
		System.out.println("This is RealCal!!");
	}
	
}

class AdvancedPrint implements Printable {
	public void print() {
		System.out.println("This is RealCal!!");
	}
}

public class InterfaceApp {

	public static void main(String[] args) {
		// ������
		Printable c = new AdvancedPrint();
		c.print();
	}

}
