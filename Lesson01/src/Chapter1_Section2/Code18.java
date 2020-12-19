package Chapter1_Section2;

import java.util.Scanner;

public class Code18 {

	public static void main(String[] args) {
		
		System.out.println("입력하고 싶은 숫자는 총 몇 개인가요?");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println("정수 " + n + "개를 무작위로 입력하세요.");
		int [] data = new int[n];
		
		for(int i=0; i<n; i++)
			data[i] = kb.nextInt();
		kb.close();
		
		bubbleSort(n, data); // 1. 메서드 bubbleSort를 호출하면서
							 //    매개변수로 배열 data와 n의 값을 건넨다.
		
		System.out.println("Sorted data: ");
		for(int i=0; i<n; i++)
			System.out.println(data[i]);
	}

	// 버블정렬(bubble sort) 알고리즘
	
	// 2. 메서드 bubbleSort는 매개변수로 하나의 배열과 하나의 정수를 건네받으며
	//    각각을 data와 n이라고 이름 짓는다.
	static void bubbleSort(int n, int [] data) { // void는 리턴값 없는 함수 -> 값 저장, t/f검사 불가능.
		for(int i=n-1; i>0; i--) {				 // 정렬만 해줌.
			for(int j=0; j<i; j++) {
				if(data[j]>data[j+1]) {
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
		}
		// (여기에 return; 써넣어도 됨.)
	}
	// 3. 메서드 bubbleSort는 아무 것도 return하지 않는다.
	//    하지만 이 메서드가 한 일은 배열 data에 이미 반영되어 있다.
}
