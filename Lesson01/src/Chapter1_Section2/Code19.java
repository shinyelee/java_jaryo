package Chapter1_Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {
	
	// input.txt라는 파일로부터 사람들의 이름과 전화번호 쌍을 입력받아 배열에 저장하고 출력하시오.

	public static void main(String[] args) {
		
		String [] name = new String [100];   // 이름과 전화번호를 배열로 만듦.
		String [] number = new String [100]; // 배열 크기는 실제와 달라도 노상관이라 넉넉하게 줬음. 
		int n = 0;
		
		try {
			Scanner inFile = new Scanner(new File("input.txt")); // 프로젝트 폴더 내 파일을 읽어온다.
			
			while(inFile.hasNext()) { // hasNext()는 파일 내 읽을 내용이 더 있는지 확인(detect End of File).
				name[n] = inFile.next();
				number[n] = inFile.next();
				n++;
			}
			
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file exists"); // e.printStackTrace();를 사용해도 됨.
			System.exit(1); // 0은 프로그램의 정상적  종료, 1은 비정상적인 종료를 의미한다.
		}
		
		for(int i=0; i<n; i++)
			System.out.println(name[i] +  ": " + number[i]); // 배열 출력.
	}

}
