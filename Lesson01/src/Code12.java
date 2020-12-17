import java.util.Scanner;

public class Code12 {

	public static void main(String[] args) {
		
		// 사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 연속된 정수를 합한 값 중 최대값을 출력하시오.
		// 예) 입력한 정수가 [1 -2 5 0 3 -4]인 경우 출력값은 [5 0 3]을 더한 8이 된다.
		
		System.out.println("입력하고 싶은 숫자는 총 몇 개인가요?");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println("정수 " + n + "개를 무작위로 입력하세요.");
		int [] data = new int[n];
		
		for(int i=0; i<n; i++)
			data[i] = kb.nextInt();
		kb.close();
		
		int max = 0; // 최대값 초기화
		for(int i=0; i<n; i++) {	  // 구간 시작점
			for (int j=i; j<n; j++) { // 구간 끝점
				
				int sum = 0;
				for(int k=i; k<=j; k++) // 구간 합
					sum += data[k];
				
				if(sum>max) // 구간 합 중 최대값
					max=sum;	
			}
		}
		
		// 코드 간소화 ver.		
//		int max = 0;
//		for(int i=0; i<n; i++) {
//			int sum = 0;
//			for (int j=i; j<n; j++) {
//					sum += data[j];
//				if(sum>max) // 구간 합 중 최대값
//					max=sum;	
//			}			
//		}
		
		System.out.println("연속된 정수를 합한 값 중 최대값은 " + max + "입니다.");
	}

}
