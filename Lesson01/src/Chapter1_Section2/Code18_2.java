package Chapter1_Section2;

import java.util.Scanner;

public class Code18_2 {

	public static void main(String[] args) {
		
		System.out.println("�Է��ϰ� ���� ���ڴ� �� �� ���ΰ���?");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println("���� " + n + "���� �������� �Է��ϼ���.");
		int [] data = new int[n];
		
		for(int i=0; i<n; i++)
			data[i] = kb.nextInt();
		kb.close();
		
		bubbleSort(n, data);
		
		System.out.println("Sorted data: ");
		for(int i=0; i<n; i++)
			System.out.print(data[i] + " ");
	}

	static void bubbleSort(int n, int [] data) {
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(data[j]>data[j+1]) {
					swap(data[j], data[j+1]);
					// �� ���� data[j]�� data[j+1]�� swap�ϱ� ���� �޼��� swap�� ȣ���ߴ�.
				}
			}
		}
	}

	public static void swap(int a, int b) {
	
		int tmp = a;
		a = b;
		b = tmp;
		// �Ű������� �ǳ׹��� �� ������ swap�ߴ�.
	}
	
	// Code18�� �޸� Code18_2�� �����غ��� ����� �������� �ʴ´�(�߸��� �ڵ��� ����).
	
}
