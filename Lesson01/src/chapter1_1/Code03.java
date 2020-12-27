package chapter1_1;

import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		
		String str = "Hello"; // 문자열 저장.
		String input = null;  // String input;으로 써도 노상관.
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please type a string: ");
		input = kb.next(); // next() 메서드는 하나의 문자열(단어 1개)을 읽어준다.
						   // 실수는 nextDouble(), 한 줄은 nextLine() 등이 있다.
		
//		if(str == input) {								 	 // 스트링은 프리미티브 타입이 아니므로
//			System.out.println("Strings match! :-)");		 // if(str == input)를 쓸 수 없다.
//		}													 // -> 문자열 비교는 ==연산자(X)
//		else {												 // -> 문자열 비교는 equal메서드(O)
//			System.out.println("Strings do not match! :-("); // 결과는 true 또는 false.
//		}
		
		if(str.equals(input)) {								 // if(input.equals(str))로 써도 노상관.
			System.out.println("Strings match! :-)");		 // str과 input이 일치할 때 출력.
		}
		else {
			System.out.println("Strings do not match! :-("); // str과 input이 불일치할 때 출력.
		}
		
		kb.close();
	}

}

// hello -> 대소문자 구분하므로 불일치
