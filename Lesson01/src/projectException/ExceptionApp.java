package projectException;

public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);
		int [] scores = {10, 20, 30};
		
		try {
			System.out.println(2);
			System.out.println(scores[3]); // 여기부터
			System.out.println(3);
			System.out.println(2/0);
			System.out.println(4); // 여기까지 출력 X.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("존재하지 않는 값입니다.");
		} catch (ArithmeticException e) {
			System.out.println("잘못된 계산입니다.");
		}
		System.out.println(5);
	}

}