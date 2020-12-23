package Chapter1_Section1;

import java.util.Scanner;

public class Code09 {

	public static void main(String[] args) {
		
		// 사용자로부터 n개의 정수를 입력받아 순서대로 배열에 저장한 후, 오른쪽으로 한 칸 이동(shift)시키시오.
		// 예) 사용자가 [1 2 3 4 5]를 입력했다면 출력 결과는 [5 1 2 3 4]가 된다.
		
		System.out.println("입력하고 싶은 숫자는 총 몇 개인가요?");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println("정수 " + n + "개를 무작위로 입력하세요.");
		int [] data = new int[n]; // 배열 생성함.
		
		for(int i=0; i<n; i++)	  // 순서대로 저장.
			data [i] = kb.nextInt();
		kb.close();

		int tmp = data[n-1];		// 마지막 값(예시 기준 [5])을 임시로 킵해두는 일회용 변수.
		for(int i=n-2; i>=0; i--) { // 나머지 값(예시 기준 [1 2 3 4])
			data[i+1] = data [i];	// 한 칸씩 shift.
		}
		data[0] = tmp;
		
		// 이렇게도 가능.
//		int tmp = data[n-1];
//		for(int i=n-1; i>=1; i--) {
//			data[i] = data [i-1];
//		}
//		data[0] = tmp;
		
		for(int i=0; i<n; i++) // 최종.
			System.out.print(data[i] + " ");
	}

}
