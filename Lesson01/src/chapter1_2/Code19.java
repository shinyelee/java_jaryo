package chapter1_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {
	
	// input.txt��� ���Ϸκ��� ������� �̸��� ��ȭ��ȣ ���� �Է¹޾� �迭�� �����ϰ� ����Ͻÿ�.

	public static void main(String[] args) {
		
		String [] name = new String [100];   // �̸��� ��ȭ��ȣ�� �迭�� ����.
		String [] number = new String [100]; // �迭 ũ��� ������ �޶� �����̶� �˳��ϰ� ����. 
		int n = 0;
		
		try {
			Scanner sc = new Scanner(new File("input.txt")); // ������Ʈ ���� �� ������ �о�´�.
			
			while(sc.hasNext()) { // hasNext()�� ���� �� ���� ������ �� �ִ��� Ȯ��(detect End of File).
				name[n] = sc.next();
				number[n] = sc.next();
				n++;
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file exists"); // e.printStackTrace();�� ����ص� ��.
			System.exit(1); // 0�� ���α׷��� ������  ����, 1�� ���������� ���Ḧ �ǹ��Ѵ�.
		}
		
		for(int i=0; i<n; i++)
			System.out.println(name[i] +  ": " + number[i]); // �迭 ���.
	}

}
