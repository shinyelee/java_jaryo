package chapter1_1;

public class Code10 {

	public static void main(String[] args) {
		
		// 1~1000 ������ ��� �Ҽ��� ����Ͻÿ�.
		
		for(int n=2; n<=1000; n++) {
			boolean isPrime = true;				   // ���� �ʱ�ȭ. �ϴ� �Ҽ���� ����.
			for(int i=2; i*i<=n && isPrime; i++) { // ���� n�� �Ҽ����� �ƴ��� �˻�.
				if(n%i==0)						   // i�� ������ ��������
					isPrime = false;			   // �Ҽ� �ƴ�.
			// ������ ���� n�� ���ؼ� �� for���� �����鼭 2���� ũ�ų� ���� ����� �ִ��� �˻��Ѵ�.
			// �ϳ��� ����� �ִٸ� �̹� �Ҽ��� �ƴϹǷ� ���̻� �˻��� �ʿ䰡 ����.
			}
			if(isPrime)
				System.out.print(n + " ");
		}

	}

}
