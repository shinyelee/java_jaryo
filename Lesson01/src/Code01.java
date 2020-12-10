
//  static int num;	// 클래스 밖에서 변수 선언 - 불가능

public class Code01 {
	
	static int num; // 메서드 밖에서 변수 선언 - 가능
	
	public static void main(String[] args) { // public, static 등 요소는 나중에 배울 예정.
		
		int anotherNum = 5; // 메서드 안에서 변수 선언 - 가능
							// 메서드 내부에 선언한 변수는 그 메서드 내에서만 사용할 수 있고,
		num = 2;			// 메서드 외부에 선언한 변수는 그 클래스 전체에서 사용할 수 있다.
		
		System.out.println(num + anotherNum);				// 숫자 + 숫자 => 두 수를 더한 값 출력.
		System.out.println("Num: " + num);					// ""는 문자 => 문자 + 숫자 => 문자와 숫자를 연속해 출력.
		System.out.println("AnotherNum: " + anotherNum);	// ""는 문자 => 문자 + 숫자 => 문자와 숫자를 연속해 출력.
		System.out.println("Sum: " + num + anotherNum);		// ""로 시작 => 문자 + 숫자 + 숫자 => 문자와 숫자를 연속해 출력. 
		System.out.println("Sum: " + (num + anotherNum));	// 괄호부터 처리 => 문자 + (숫자 + 숫자) => 두 수를 더한 값 출력.
	}

}

//println문 자동생성 : sysout 입력 후 ctl+space