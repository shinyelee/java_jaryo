package Chapter1_Section2;

public class Code17 {
	
	// 1~100 사이의 모든 소수를 출력하시오(Code10 응용).

	public static void main(String[] args) { // 메인 함수(Code10과 비슷함)
		
		for(int n=0; n<=100; n++) { // n을 -100 뭐 이런 수로 해도 문제 X.
			if(isPrime(n))
				System.out.print(n + " ");
		}
	}
	
	static boolean isPrime(int k) { // n이 소수인지 아닌지 검사해 true/false 리턴하는 함수.
		
		if(k<2)
			return false;
		for(int i=2; i*i<=k; i++) // i가 루트k보다 작음
			if(k%i == 0)		  // k를 i로 나눴을 때 나머지가 0이면
				return false;	  // 소수가 아님.
		return true;			  // 나누어 떨어지지 않으면 소수 맞음.
	}
}
