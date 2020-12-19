package Chapter1_Section3; // [Java로 배우는 자료구조] 제1-2장: 메서드 호출과 프로그램의 기능적 분할 (4/4)는 pass함.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code21 {

	// input.txt라는 파일로부터 사람들의 이름과 고유번호 쌍을 입력받아 배열에 저장한 후 알파벳 순으로 정렬해 출력하시오.

	public static void main(String[] args) {
		
		String [] names = new String [100]; // 클래스에서 선언(a.k.a. 전역변수)하지 않고 <- Code20
		int [] numbers = new int [100];		// 메인 메서드 안에 변수를 선언(a.k.a. 지역변수)하면 <- Code19,21
		int n = 0;							// 함수 호출할 때 구구절절 길어진다는 단점이 있음.
		
		try {
			String fileName = "input.txt";				  // Code19~21 동안 sc를 3가지 방법으로 선언했다.
			Scanner sc = new Scanner(new File(fileName)); // 셋 중 본인이 편한 형식으로 코딩하면 된다.
			
			while(sc.hasNext()) {
				names[n] = sc.next();
				numbers[n] = sc.nextInt();
				n++;
			}
			sc.close();
			
		} catch (FileNotFoundException e) { // 예외 처리.
			System.out.println("No data file exists!");
			System.exit(9);
		}
		
		bubbleSort(n, names, numbers); // 지역변수라 구구절절. 전역 변수로 쓰는 게 낫다(Code20 참고).
		
		for(int i=0; i<n; i++) {
			System.out.println("Name: " + names[i] + " / Numbers: " + numbers[i]);
		}

	}
	
	// 버블 정렬, 값으로 호출(call-by-value)
	static public void bubbleSort(int n, String [] names, int [] numbers) { // 지역변수라 구구절절 2.
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(names[j].compareTo(names[j+1]) > 0) {

					String tmps = names[j];			   
					names[j] = names[j+1];
					names[j+1] = tmps;
					
					int tmpi = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = tmpi;
				}
			}
		}
	}

}
