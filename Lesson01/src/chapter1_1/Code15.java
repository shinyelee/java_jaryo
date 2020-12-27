package chapter1_1;

import java.util.Scanner;

public class Code15 {
	
	public static void main(String[] args) {
		
		// ��������(bubble sort) �˰��� ���빮��
		// ����ڷκ��� n���� ������ �Է¹޾� �迭�� ������ ��,
		// ������ �ϳ��� �Էµ� ������ ������� �Էµ� �������� ������������ ������ ����Ͻÿ�.
		
		System.out.println("�Է��ϰ� ���� ���ڴ� �� �� ���ΰ���?");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println("���� " + n + "���� �������� �Է��ϼ���.");
		int [] data = new int[n];
		
		for(int i=0; i<n; i++) {
			int tmp = kb.nextInt();
			
			int j = i-1;
			while(j>=0 && data[j]>tmp) {
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = tmp;
			
			System.out.println("Sorted data: ");
			for(int k=0; k<=i; k++)
				System.out.print(data[k] + " ");
			System.out.println();
		}
		kb.close();
	}	

}
