import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		String str = "Hello, world";
		String input = null;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please type a string: ");
		input = kb.next(); // next() 메서드는 하나의 문자열을 읽어준다.
						   // 실수는 nextDouble(), 한 줄은 nextLine() 등이 있다.
		if(str == input) {									 // 두 String을 비교한다.
			System.out.println("Strings match! :-)");		 // 일치할 때
		}
		else {
			System.out.println("Strings do not match! :-("); // 불일치할 때
		}
		
		kb.close();
	}

}
