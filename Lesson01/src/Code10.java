
public class Code10 {

	public static void main(String[] args) {
		
		// 1~1000 ������ ��� �Ҽ��� ����Ͻÿ�.
		
		for(int n=2; n<=1000; n++) {
			boolean isPrime = true;
			for(int i=2; i*i<=n && isPrime; i++) {
				if(n%i==0)
					isPrime = false;
			}
			if(isPrime)
				System.out.println(n);
		}

	}

}
