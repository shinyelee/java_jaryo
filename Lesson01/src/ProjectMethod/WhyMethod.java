package ProjectMethod;

public class WhyMethod {

	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter); // Ư�����ڵ�
		System.out.println(text);
		System.out.println(text);
		// delimiter, text -> �Ű�����, parameter
	}
	
	public static void main(String[] args) {
		printTwoTimes("a", "-"); // �����Ӱ� ���� ����.
		printTwoTimes("a", "*");
		printTwoTimes("a", "&");
		printTwoTimes("b", "!");
		// "a", "-" -> ����, argument
	}

}
