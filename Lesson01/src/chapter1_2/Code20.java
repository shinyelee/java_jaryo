package chapter1_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {

	// input.txt��� ���Ϸκ��� ������� �̸��� ��ȭ��ȣ ���� �Է¹޾� �迭�� ������ �� ���ĺ� ������ ������ ����Ͻÿ�.
	
	static String [] name = new String [100];   // �̸��� ��ȭ��ȣ�� �迭�� ����.
	static String [] number = new String [100]; // �迭 ũ��� ������ �޶� �����̶� �˳��ϰ� ����. 
	static int n = 0;
	// �Է¹��� �̸��� ��ȭ��ȣ���� ������ �迭 name�� number, �׸��� ���� count
	// -> main �޼��常�� �ƴ϶� bubbleSort �޼��忡�� ���ǹǷ� main �޼��� �ܺο� ������.
	// �̷��� �ϳ��� �޼��尡 �ƴ϶� Ŭ���� ��ü���� ���� �����ʹ� Ŭ������ ����� ����� ���� ����.
	
	public static void main(String[] args) {
		
		Scanner sc;
		try {
			sc = new Scanner(new File("input.txt")); // ������Ʈ ���� �� ������ �о�´�.
			
			while(sc.hasNext()) { // hasNext()�� ���� �� ���� ������ �� �ִ��� Ȯ��(detect End of File).
				name[n] = sc.next();
				number[n] = sc.next();
				n++;
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file exists!"); // e.printStackTrace();�� ����ص� ��.
			System.exit(1); // 0�� ���α׷��� ������  ����, 1�� ���������� ���Ḧ �ǹ��Ѵ�.
		}
		
		bubbleSort(); // ���� ���� �޼��� ȣ��. name, number, n�� Ŭ���� ����̹Ƿ� ���⼭ �Ű������� �Ѱ��� �ʿ� X.
		
		for(int i=0; i<n; i++)
			System.out.println(name[i] +  ": " + number[i]); // �迭 ���.
	}
	
	static void bubbleSort() { // ���� ������ Code14 ����.
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(name[j].compareTo(name[j+1]) > 0) { // ���ڴ� ���ڰ� �ƴϴ� �ܼ� �ε�ȣ������ ���� �� ����
													   //  -> .compareTo ���(��ȣ ��� .equal ���� �Ŷ� ����).
					String tmp = name[j];			   // ��ҹ��� ���о��� �����Ϸ��� .compareToIgnoreCase ���.
					name[j] = name[j+1];
					name[j+1] = tmp;
					
					tmp = number[j];
					number[j] = number[j+1];
					number[j+1] = tmp;
				}
			}
		}	
	}

}
