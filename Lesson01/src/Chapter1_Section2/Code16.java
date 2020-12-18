package Chapter1_Section2;

import java.util.Scanner;

public class Code16 {

	public static void main(String[] args) {
		
		// ����ڷκ��� ���� a�� b�� �Է¹޾� a�� b���� ���·� ����Ͻÿ�.
		
		System.out.println("���� a�� b�� ���ʷ� �Է��ϸ� a�� b������ �� ���� ��µ˴ϴ�.");
		Scanner kb = new Scanner(System.in);
		int a = kb.nextInt(); // ���� a�� b��
		int b = kb.nextInt(); // Ű����κ��� �Է� ����.
		
		// 4. �޼��� power�� return������ �Ѱ��� ���� �޾� ���� result�� ����.
		int result = power(a, b); // 1. �޼��� power�� ȣ���ϸ鼭 �Ű������� ���� a�� b�� �� ����.
		System.out.println(a + "�� " + b + "������?");
		
		System.out.println(result);
		kb.close();
	}
	
	// ���� static�� ���� �� �ٷ�.
	static int power(int n, int m) { // 2. �޼��� power�� �Ű������� ���� m�� n�� ����(�� a, b�� �ʿ� X).
		int result = 1;				 // a�� b������ �Ƿ��� a�� b�� ���ϴ� �ݺ����� ������ �Ѵ�.
		for(int i=0; i<m; i++)		 // -> �⺻���� 1�� �ΰ� 1*a*a*a...�� ���°� �ȴ�.
			result *= n;			 // 3. �޼��� power�� �����(���� result ��)�� return���� ���� �ڽ��� ȣ���� �̿��� �Ѱ��ش�.
								
		return result;
	}

}
