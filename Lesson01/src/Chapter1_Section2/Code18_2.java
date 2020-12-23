package Chapter1_Section2;

import java.util.Scanner;

public class Code18_2 {

	public static void main(String[] args) {
		
		System.out.println("입력하고 싶은 숫자는 총 몇 개인가요?");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println("정수 " + n + "개를 무작위로 입력하세요.");
		int [] data = new int[n];
		
		for(int i=0; i<n; i++)
			data[i] = kb.nextInt();
		kb.close();
		
		bubbleSort(n, data);
		
		System.out.println("Sorted data: ");
		for(int i=0; i<n; i++)
			System.out.println(data[i]);
	}

	static void bubbleSort(int n, int [] data) {
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(data[j]>data[j+1]) {
					swap(data[j], data[j+1]);
					// 두 정수 data[j]와 data[j+1]을 swap하기 위해 메서드 swap을 호출했다.
				}
			}
		}
	}

	public static void swap(int a, int b) {
	
		int tmp = a;
		a = b;
		b = tmp;
		// 매개변수로 건네받은 두 정수를 swap했다.
	}
	
	// Code18과 달리 Code18_2는 실행해보면 제대로 동작하지 않는다(잘못된 코드의 예시).
	
}
