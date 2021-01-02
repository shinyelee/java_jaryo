package ProjectMethod;

public class WhyMethod {

	public static void printTwoTimes(String text) {
		System.out.println("-");
		System.out.println(text); // 출력하는 문자를 자유롭게 변경하려면
		System.out.println(text);
	}
	
	public static void main(String[] args) {
		printTwoTimes("a"); // ""에 원하는 문자를 입력하면 된다.
		printTwoTimes("a");
		printTwoTimes("a");
		printTwoTimes("b");

	}

}
