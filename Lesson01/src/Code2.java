import java.util.Scanner; // import문은 라이브러리를 사용할 수 있게 해준다.

public class Code2 {
	
	public static void main(String[] args) {
		
		int number = 123;
		
		Scanner kb = new Scanner(System.in);	// kb라는 이름의 스캐너. 키보드로부터 입력을 받는다.
		System.out.println("Please enter an integer: ");
		
		int input = kb.nextInt();
		
		if(input == number) {							// 키보드로 입력한 숫자가 int number 값과 같으면
			System.out.println("Numbers match! :-)");	// "" 속 문자열 출력.
		} else {												// 다르면
			System.out.println("Numbers do not match! :-(");	// "" 속 문자열 출력.
		}
		
		kb.close(); // 스캐너 종료(이 코드 빼먹어도 프로그램 실행에 문제 없으나 스캐너가 필요없어지는 지점에서 닫는 것을 권장).
	}

}

// import문 자동생성 : ctl+shift+o