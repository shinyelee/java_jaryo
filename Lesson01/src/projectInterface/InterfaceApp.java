package projectInterface;

// 인터페이스에서 메소드와 변수 정의 가능
// (메소드 정의시 내용은 들어가지 않음).
interface Calculable {
	double PI = 3.14;
	int sum(int v1, int v2);
}

interface Printable {
	void print();
}

// 하나의 클래스에 여러개의 인터페이스를 구현할 수 있다.
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
		// 다형성
		Printable c = new AdvancedPrint();
		c.print();
	}

}
