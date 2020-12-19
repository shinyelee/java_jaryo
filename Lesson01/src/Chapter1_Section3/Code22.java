package Chapter1_Section3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code22 {
	
	// 인덱스 메이커
	// 1. 입력으로 하나의 텍스트 파일을 읽는다.
	// 2. 텍스트 파일에 등장하는 모든 단어들의 목록을 만들고, 각 단어가 텍스트 파일에 등장하는 횟수를 센다.
	//    단, 단어 개수는 100,000개 이하라고 가정한다.
	// 3. 사용자가 요청하면 단어 목록을 하나의 파일로 저장한다.
	// 4. 사용자가 단어를 검색하면 그 단어가 텍스트 파일에 몇 번 등장하는지 출력한다.
	
		// 실행 예
//		$ read sample.txt					// 텍스트파일 sample.txt를 읽고 인덱스를 만든다.
//		$ find heaven						// heaven이라는 단어를 찾아
//		The word "heaven" appears 13 times. // -> 몇 번 나오는지 출력한다.
//		$ saveAS index.txt					// 인덱스를 index.txt라는 파일로 저장한다.
//		$ find java							// 없는 단어일 경우
//		The word "java" does not appear.	// -> 해당 문구 출력.
//		$ exit								// 프로그램 종료.
	
	static String [] words = new String [5000];
	static String [] count = new String [5000];
	static int n = 0;

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		while(true) {
			
			System.out.println("$ ");
			String command = kb.next();
			
			if(command.equals("read")) {
				String fileName = kb.next();
				makeIndex(fileName);
			} else if(command.equals("find")) {
				
			} else if(command.equals("saveAS")) {
				
			} else if(command.equals("exit"))
				break;
		}
		kb.close();
	}

	static void makeIndex(String fileName) {
		try {
			Scanner inFile = new Scanner(new File(fileName));
			// 강의 21분부터 계속.
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file exists!"); // e.printStackTrace(); 써도 됨.
			return;
		}
	}
}
