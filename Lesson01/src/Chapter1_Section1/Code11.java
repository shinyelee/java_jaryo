package Chapter1_Section1;

import java.util.Scanner;

public class Code11 {
	
	public static void main(String[] args) {
		
		// 사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 중복된 정수쌍의 개수를 카운트해 출력하시오.
		// 예) 입력한 정수가 [1 3 4 5 5 3 5]인 경우 모든 정수쌍은
		//    (1,3) (1,4) (1,5) (1,5) (1,3) (1,5)
		//	  (3,4) (3,5) (3,5) (3,3) (3,5)
		//	  (4,5) (4,5) (4,3) (4,5)
		//	  (5,5) (5,3) (5,5)
		//	  (5,3) (5,5)
		//	  (3,5)
		// 여기서 중복인 정수쌍은 (3,3) (5,5) (5,5) (5,5) -> 총 4쌍이 된다.
		
		System.out.println("입력하고 싶은 숫자는 총 몇 개인가요?");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println("정수 " + n + "개를 무작위로 입력하세요.");
		int [] data = new int [n];
		
		for(int i=0; i<n; i++)
			data[i] = kb.nextInt();
		kb.close();
		
		int count = 0;
		
		for(int i=0; i<n-1; i++) {	   // 정수쌍 비교
			for(int j=i+1; j<n; j++) { // 정수쌍 세팅
				if(data[i] == data[j]) // i와 j가 같으면 예) (3,3)
					count++;		   // 카운트 함(1 증가)
			}
		}
		System.out.println("중복되는 정수쌍은 " + count + "개 입니다.");
	}

}
