package Chapter1_Section3; // [Java�� ���� �ڷᱸ��] ��1-2��: �޼��� ȣ��� ���α׷��� ����� ���� (4/4)�� pass��.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code21 {

	// input.txt��� ���Ϸκ��� ������� �̸��� ������ȣ ���� �Է¹޾� �迭�� ������ �� ���ĺ� ������ ������ ����Ͻÿ�.

	public static void main(String[] args) {
		
		String [] names = new String [100]; // Ŭ�������� ����(a.k.a. ��������)���� �ʰ� <- Code20
		int [] numbers = new int [100];		// ���� �޼��� �ȿ� ������ ����(a.k.a. ��������)�ϸ� <- Code19,21
		int n = 0;							// �Լ� ȣ���� �� �������� ������ٴ� ������ ����.
		
		try {
			String fileName = "input.txt";				  // Code19~21 ���� sc�� 3���� ������� �����ߴ�.
			Scanner sc = new Scanner(new File(fileName)); // �� �� ������ ���� �������� �ڵ��ϸ� �ȴ�.
			
			while(sc.hasNext()) {
				names[n] = sc.next();
				numbers[n] = sc.nextInt();
				n++;
			}
			sc.close();
			
		} catch (FileNotFoundException e) { // ���� ó��.
			System.out.println("No data file exists!");
			System.exit(9);
		}
		
		bubbleSort(n, names, numbers); // ���������� ��������. ���� ������ ���� �� ����(Code20 ����).
		
		for(int i=0; i<n; i++) {
			System.out.println("Name: " + names[i] + " / Numbers: " + numbers[i]);
		}

	}
	
	// ���� ����, ������ ȣ��(call-by-value)
	static public void bubbleSort(int n, String [] names, int [] numbers) { // ���������� �������� 2.
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(names[j].compareTo(names[j+1]) > 0) {

					String tmps = names[j];			   
					names[j] = names[j+1];
					names[j+1] = tmps;
					
					int tmpi = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = tmpi;
				}
			}
		}
	}

}
