package ProjectMethod;

public class WhyMethod {

	public static void printTwoTimes(String text) {
		System.out.println("-");
		System.out.println(text); // ����ϴ� ���ڸ� �����Ӱ� �����Ϸ���
		System.out.println(text);
	}
	
	public static void main(String[] args) {
		printTwoTimes("a"); // ""�� ���ϴ� ���ڸ� �Է��ϸ� �ȴ�.
		printTwoTimes("a");
		printTwoTimes("a");
		printTwoTimes("b");

	}

}
