package chapter1_1;

import java.util.Scanner;

public class Code08 {

	public static void main(String[] args) {
		
		// 사용자로부터 n개의 정수를 입력받은 후 합과 최대값을 구하여 출력하시오.
		
		System.out.println("입력하고 싶은 숫자는 총 몇 개인가요?");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println("정수 " + n + "개를 무작위로 입력하세요.");
		int [] data = new int[n];
		
		for(int i=0; i<n; i++)
			data[i] = kb.nextInt();
		kb.close();
		
//		int sum = 0;
//		for(int i=0; i<n; i++) {
//			sum += data[i];
//		}
//		System.out.println("The sum is " + sum);
		
		int sum = 0;
		int max = data[0]; // int sum = 0, max = data[0];과 동일.
		
		for(int i=0; i<n; i++) {
			sum += data[i]; // sum = sum + data[i];과 동일.
			if(data[i] > max) max = data[i];
		}
		System.out.println("입력하신 수의 총 합은 [" + sum + "]이고, 가장 큰 수는 [" + max + "]입니다.");
	}

}
