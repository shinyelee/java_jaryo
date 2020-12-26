package Chapter2_Section1;

public class Polynomial { // 하나의 다항식을 표현하기 위한 클래스.

	public char name; // 다항식의 이름.
	public Term [] terms; // 다항식을 구성하는 항의 개수.
	public int nTerms = 0; // 다항식을 구성하는 항들을 저장할 배열.
}

// 프로그램 실행 예
// $ create f	// 다항함수 f= 0을 정의한다.
// $ add f 2 3	// f(x) = 2x³
// $ add f -1 1	// f(x) = 2x³-x
// $ add f 5 0	// f(x) = 2x³-x+5
// $ add f 2 1	// f(x) = 2x³-x+5+2x
// $ calc f 2	// f(2)일 때 값을 계산해 출력.
// 23			// f(2) = 23
// $ print f	// 식을 내림차순으로 정렬해 출력.
// 2x^3+x+5		// -x+2x는 +x로 알아서 계산함.
// $ exit		// 종료.