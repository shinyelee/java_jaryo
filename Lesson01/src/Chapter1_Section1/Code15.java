package Chapter1_Section1;

import java.util.Scanner;

public class Code15 {
	
	public static void main(String[] args) {
		
		// 버블정렬(bubble sort) 알고리즘 응용문제
		// 사용자로부터 n개의 정수를 입력받아 배열에 저장한 후,
		// 정수가 하나씩 입력될 때마다 현재까지 입력된 정수들을 오름차순으로 정렬해 출력하시오.
		
		System.out.println("입력하고 싶은 숫자는 총 몇 개인가요?");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println("정수 " + n + "개를 무작위로 입력하세요.");
		int [] data = new int[n];
		
		for(int i=0; i<n; i++) {
			int tmp = kb.nextInt();
			
			int j = i-1;
			while(j>=0 && data[j]>tmp) {
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = tmp;
			
			System.out.println("Sorted data: ");
			for(int k=0; k<=i; k++)
				System.out.print(data[k] + " ");
			System.out.println();
		}
		kb.close();
	}	

}
