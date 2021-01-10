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
		} catch (Exception e) {
			System.out.println("뭔가 잘못된 것 같다."+e.getMessage());
		}	// e.getMessage(): 에러 원인 알려줌.
		System.out.println(5);
	}

}