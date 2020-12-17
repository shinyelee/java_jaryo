
public class Code05 {
	
	public static void main(String[] args) {
		
		// 크기 5인 정수형 배열.
		int [] grades;		 // 배열 선언(declare the array)
		grades = new int[5]; // 배열 생성(allocate memory for 5 indices)
		
		// 크기 100인 실수형 배열.
		double [] array;
		array = new double[100];
		
		// 크기 20인 문자형 배열.
		char [] word;
		word = new char[20];
		
		// 아래처럼 표기해도 됨.
//		int [] grades = new int [5];
//		double [] array = new double [100];
//		char [] word = new char [20];
		
		// 배열의 각칸에 데이터 저장(assign some values to the array)
		grades[0] = 100; // 배열의 인덱스는 1이 아닌 0부터 시작한다.
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
		
		// 값 출력(print out each value)
		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		System.out.println(grades[3]);
		System.out.println(grades[4]);
	}

}
