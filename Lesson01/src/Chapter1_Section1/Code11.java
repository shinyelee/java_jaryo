package Chapter1_Section1;

import java.util.Scanner;

public class Code11 {
	
	public static void main(String[] args) {
		
		// ����ڷκ��� n���� ������ �Է¹޾� �迭�� ������ ��, �ߺ��� �������� ������ ī��Ʈ�� ����Ͻÿ�.
		// ��) �Է��� ������ [1 3 4 5 5 3 5]�� ��� ��� ��������
		//    (1,3) (1,4) (1,5) (1,5) (1,3) (1,5)
		//	  (3,4) (3,5) (3,5) (3,3) (3,5)
		//	  (4,5) (4,5) (4,3) (4,5)
		//	  (5,5) (5,3) (5,5)
		//	  (5,3) (5,5)
		//	  (3,5)
		// ���⼭ �ߺ��� �������� (3,3) (5,5) (5,5) (5,5) -> �� 4���� �ȴ�.
		
		System.out.println("�Է��ϰ� ���� ���ڴ� �� �� ���ΰ���?");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println("���� " + n + "���� �������� �Է��ϼ���.");
		int [] data = new int [n];
		
		for(int i=0; i<n; i++)
			data[i] = kb.nextInt();
		kb.close();
		
		int count = 0;
		
		for(int i=0; i<n-1; i++) {	   // ������ ��
			for(int j=i+1; j<n; j++) { // ������ ����
				if(data[i] == data[j]) // i�� j�� ������ ��) (3,3)
					count++;		   // ī��Ʈ ��(1 ����)
			}
		}
		System.out.println("�ߺ��Ǵ� �������� " + count + "�� �Դϴ�.");
	}

}
