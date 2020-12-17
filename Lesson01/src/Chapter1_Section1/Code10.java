
public class Code10 {

	public static void main(String[] args) {
		
		// 1~1000 사이의 모든 소수를 출력하시오.
		
		for(int n=2; n<=1000; n++) {
			boolean isPrime = true;				   // 변수 초기화. 일단 소수라고 가정.
			for(int i=2; i*i<=n && isPrime; i++) { // 정수 n이 소수인지 아닌지 검사.
				if(n%i==0)						   // i로 나누어 떨어지면
					isPrime = false;			   // 소수 아님.
			// 각각의 정수 n에 대해서 이 for문을 돌리면서 2보다 크거나 같은 약수가 있는지 검사한다.
			// 하나라도 약수가 있다면 이미 소수가 아니므로 더이상 검사할 필요가 없다.
			}
			if(isPrime)
				System.out.println(n);
		}

	}

}
