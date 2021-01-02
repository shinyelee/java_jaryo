package ProjectMethod;

public class WhyMethod {

	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter); // 특수문자도
		System.out.println(text);
		System.out.println(text);
		// delimiter, text -> 매개변수, parameter
	}
	
	public static void main(String[] args) {
		printTwoTimes("a", "-"); // 자유롭게 변경 가능.
		printTwoTimes("a", "*");
		printTwoTimes("a", "&");
		printTwoTimes("b", "!");
		// "a", "-" -> 인자, argument
	}

}
