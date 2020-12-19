package Chapter1_Section2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {

	// input.txt라는 파일로부터 사람들의 이름과 전화번호 쌍을 입력받아 배열에 저장한 후 알파벳 순으로 정렬해 출력하시오.
	
	static String [] name = new String [100];   // 이름과 전화번호를 배열로 만듦.
	static String [] number = new String [100]; // 배열 크기는 실제와 달라도 노상관이라 넉넉하게 줬음. 
	static int n = 0;
	// 입력받은 이름과 전화번호들을 저장할 배열 name과 number, 그리고 개수 count
	// -> main 메서드만이 아니라 bubbleSort 메서드에서 사용되므로 main 메서드 외부에 선언함.
	// 이렇게 하나의 메서드가 아니라 클래스 전체에서 사용될 데이터는 클래스의 멤버로 만드는 것이 좋다.
	
	public static void main(String[] args) {
		
		Scanner sc;
		try {
			sc = new Scanner(new File("input.txt")); // 프로젝트 폴더 내 파일을 읽어온다.
			
			while(sc.hasNext()) { // hasNext()는 파일 내 읽을 내용이 더 있는지 확인(detect End of File).
				name[n] = sc.next();
				number[n] = sc.next();
				n++;
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file exists!"); // e.printStackTrace();를 사용해도 됨.
			System.exit(1); // 0은 프로그램의 정상적  종료, 1은 비정상적인 종료를 의미한다.
		}
		
		bubbleSort(); // 버블 정렬 메서드 호출. name, number, n이 클래스 멤버이므로 여기서 매개변수로 넘겨줄 필요 X.
		
		for(int i=0; i<n; i++)
			System.out.println(name[i] +  ": " + number[i]); // 배열 출력.
	}
	
	static void bubbleSort() { // 버블 정렬은 Code14 참고.
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(name[j].compareTo(name[j+1]) > 0) { // 문자는 숫자가 아니니 단순 부등호만으로 비교할 수 없다
													   //  -> .compareTo 사용(등호 대신 .equal 쓰는 거랑 같음).
					String tmp = name[j];			   // 대소문자 구분없이 구분하려면 .compareToIgnoreCase 사용.
					name[j] = name[j+1];
					name[j+1] = tmp;
					
					tmp = number[j];
					number[j] = number[j+1];
					number[j+1] = tmp;
				}
			}
		}	
	}

}
