package chapter1_2;

import java.util.Scanner;

public class Code18 {

	public static void main(String[] args) {
		
		System.out.println("�Է��ϰ� ���� ���ڴ� �� �� ���ΰ���?");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println("���� " + n + "���� �������� �Է��ϼ���.");
		int [] data = new int[n];
		
		for(int i=0; i<n; i++)
			data[i] = kb.nextInt();
		kb.close();
		
		bubbleSort(n, data); // 1. �޼��� bubbleSort�� ȣ���ϸ鼭
							 //    �Ű������� �迭 data�� n�� ���� �ǳٴ�.
		
		System.out.println("Sorted data: ");
		for(int i=0; i<n; i++)
			System.out.print(data[i] + " ");
	}

	// ��������(bubble sort) �˰���
	
	// 2. �޼��� bubbleSort�� �Ű������� �ϳ��� �迭�� �ϳ��� ������ �ǳ׹�����
	//    ������ data�� n�̶�� �̸� ���´�.
	static void bubbleSort(int n, int [] data) { // void�� ���ϰ� ���� �Լ� -> �� ����, t/f�˻� �Ұ���.
		for(int i=n-1; i>0; i--) {				 // ���ĸ� ����.
			for(int j=0; j<i; j++) {
				if(data[j]>data[j+1]) {
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
		}
		// (���⿡ return; ��־ ��.)
	}
	// 3. �޼��� bubbleSort�� �ƹ� �͵� return���� �ʴ´�.
	//    ������ �� �޼��尡 �� ���� �迭 data�� �̹� �ݿ��Ǿ� �ִ�.
}
