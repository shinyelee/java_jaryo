package ProjectMethod;

public class WhyMethod {

	public static void printTwoTimesA() {
		// ���⼭ 1���� �����ϸ�
		System.out.println("-");
		System.out.println("A");
		System.out.println("A");
	}
	
	public static void main(String[] args) {
		// ��������� ������ �ʿ� ����
		printTwoTimesA();
		printTwoTimesA();
		printTwoTimesA();

	}

}

// �ڵ� �ڵ����� �޼ҵ�ȭ�ϴ� ���?
// ������ �� ��Ŭ�� -> Refactor -> Extract Method...
// -> Method name ���� -> public üũ -> OK -> OK
