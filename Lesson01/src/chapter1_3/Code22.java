package chapter1_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
	
	static String [] words = new String [5000]; // 단어들의 목록을 저장할 배열.
	static int [] count = new int [5000];	    // 각 단어의 등장 횟수를 저장.
	static int n = 0;							// 저장된 단어의 개수.

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		while(true) {					// while문을 한번 돌 때마다 사용자로부터 하나의 명령을 받아 수행한다.
										// 언제 while문을 종료할지가 미리 정해져 있지 않을 경우
			System.out.print("$ ");		// 이렇게 무한 루프를 만들고,
			String command = kb.next();	// 종료할 조건이 만족(exit 명령 입력)되면
										// break문으로 루프를 빠져나오는 것은 하나의 전형적인 스타일이다.
			if(command.equals("read")) {
				String fileName = kb.next();
				makeIndex(fileName);
			}
			else if(command.equals("find")) { // findWord는 단어 keyword를 배열 words에서 검색해
				String str = kb.next();		  // 찾으면 배열 index를, 못 찾으면 -1을 반환한다.
				int index = findWord(str);
				if(index > -1) {
					System.out.println("The word " + words[index] + " appears " + count[index] + "times.");
				}
				else
					System.out.println("The word " + str + " doesn't appear.");
			}
			else if(command.equals("saveAS")) {
				String fileName = kb.next();
				saveAS(fileName);
			}
			else if(command.equals("exit"))
				break;
		}
		kb.close();
	}

	static void makeIndex(String fileName) {
		try {
			Scanner inFile = new Scanner(new File(fileName));
			while(inFile.hasNext()) {
				String str = inFile.next();
				addWord(str);
			}
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file exists!"); // e.printStackTrace(); 써도 됨.
			return;
		}
	}
	
	static void addWord(String str) {
		int index = findWord(str); // returns -1 if not found
		if(index != -1) {		   // found words[index] == str
			count[index]++;
		} else {				   // not found
			words[n] = str;
			count[n] = 1;
			n++;
		}
	}
	
	static int findWord(String str) {
		for(int i=0; i<n; i++)
			if(words[i].equals(str))
				return i;
		return -1;
	}
	
	static void saveAS(String fileName) {
		PrintWriter outFile;
		try {
			outFile = new PrintWriter(new FileWriter(fileName));
			for(int i=0; i<n; i++)
				outFile.println(words[i] + " " + count[i]);
			outFile.close();
		} catch (IOException e) {
			System.out.println("Save failed!");
			return;
		}

	}
}
