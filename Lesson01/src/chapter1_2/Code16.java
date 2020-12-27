package chapter1_2;

import java.util.Scanner;

public class Code16 {

	public static void main(String[] args) {
		
		// 사용자로부터 정수 a와 b를 입력받아 a의 b제곱 형태로 출력하시오.
		
		System.out.println("정수 a와 b를 차례로 입력하면 a의 b제곱을 한 값이 출력됩니다.");
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt(); // 정수 a와 b를
		int b = kb.nextInt(); // 키보드로부터 입력 받음.
		
		// 4. 메서드 power가 return문으로 넘겨준 값을 받아 변수 result에 저장.
		int result = power(a, b); // 1. 메서드 power를 호출하면서 매개변수로 정수 a와 b의 값 전달.
		System.out.println(a + "의 " + b + "제곱은?");
		
		System.out.println(result);
		kb.close();
	}
	
	// 아직 static이 뭔지 안 다룸.
	static int power(int n, int m) { // 2. 메서드 power는 매개변수로 정수 m과 n을 받음(꼭 a, b일 필요 X).
		int result = 1;				 // a의 b제곱이 되려면 a를 b번 곱하는 반복문을 만들어야 한다.
		for(int i=0; i<m; i++)		 // -> 기본값을 1로 두고 1*a*a*a...의 형태가 된다.
			result *= n;			 // 3. 메서드 power는 계산결과(변수 result 값)을 return문을 통해 자신을 호출한 이에게 넘겨준다.
								
		return result;
	}

}
