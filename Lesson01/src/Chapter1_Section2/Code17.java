package Chapter1_Section2;

public class Code17 {
	
	// 1~100 ������ ��� �Ҽ��� ����Ͻÿ�(Code10 ����).

	public static void main(String[] args) { // ���� �Լ�(Code10�� �����)
		
		for(int n=0; n<=100; n++) { // n�� -100 �� �̷� ���� �ص� ���� X.
			if(isPrime(n))
				System.out.println(n);
		}
	}
	
	static boolean isPrime(int k) { // n�� �Ҽ����� �ƴ��� �˻��� true/false �����ϴ� �Լ�.
		
		if(k<2)
			return false;
		for(int i=2; i*i<=k; i++) // i�� ��Ʈk���� ����
			if(k%i == 0)		  // k�� i�� ������ �� �������� 0�̸�
				return false;	  // �Ҽ��� �ƴ�.
		return true;			  // ������ �������� ������ �Ҽ� ����.
	}
}
