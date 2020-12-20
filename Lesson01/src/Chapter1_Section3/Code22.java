package Chapter1_Section3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code22 {
	
	// �ε��� ����Ŀ
	// 1. �Է����� �ϳ��� �ؽ�Ʈ ������ �д´�.
	// 2. �ؽ�Ʈ ���Ͽ� �����ϴ� ��� �ܾ���� ����� �����, �� �ܾ �ؽ�Ʈ ���Ͽ� �����ϴ� Ƚ���� ����.
	//    ��, �ܾ� ������ 100,000�� ���϶�� �����Ѵ�.
	// 3. ����ڰ� ��û�ϸ� �ܾ� ����� �ϳ��� ���Ϸ� �����Ѵ�.
	// 4. ����ڰ� �ܾ �˻��ϸ� �� �ܾ �ؽ�Ʈ ���Ͽ� �� �� �����ϴ��� ����Ѵ�.
	
		// ���� ��
//		$ read sample.txt					// �ؽ�Ʈ���� sample.txt�� �а� �ε����� �����.
//		$ find heaven						// heaven�̶�� �ܾ ã��
//		The word "heaven" appears 13 times. // -> �� �� �������� ����Ѵ�.
//		$ saveAS index.txt					// �ε����� index.txt��� ���Ϸ� �����Ѵ�.
//		$ find java							// ���� �ܾ��� ���
//		The word "java" does not appear.	// -> �ش� ���� ���.
//		$ exit								// ���α׷� ����.
	
	static String [] words = new String [5000]; // �ܾ���� ����� ������ �迭.
	static int [] count = new int [5000];	    // �� �ܾ��� ���� Ƚ���� ����.
	static int n = 0;							// ����� �ܾ��� ����.

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		while(true) {					// while���� �ѹ� �� ������ ����ڷκ��� �ϳ��� ����� �޾� �����Ѵ�.
										// ���� while���� ���������� �̸� ������ ���� ���� ���
			System.out.print("$ ");		// �̷��� ���� ������ �����,
			String command = kb.next();	// ������ ������ ����(exit ��� �Է�)�Ǹ�
										// break������ ������ ���������� ���� �ϳ��� �������� ��Ÿ���̴�.
			if(command.equals("read")) {
				String fileName = kb.next();
				makeIndex(fileName);
			}
			else if(command.equals("find")) { // findWord�� �ܾ� keyword�� �迭 words���� �˻���
				String str = kb.next();		  // ã���� �迭 index��, �� ã���� -1�� ��ȯ�Ѵ�.
				int index = findWord(str);
				if(index > -1) {
					System.out.println("The word " + words[index] + " appears " + count[index] + "times.");
				}
				else
					System.out.println("The word " + str + " doesn't appear.");
			}
			else if(command.equals("saveAS")) {
				String fileName = kb.next();
				saveAS(fileName);
			}
			else if(command.equals("exit"))
				break;
		}
		kb.close();
	}

	static void makeIndex(String fileName) {
		try {
			Scanner inFile = new Scanner(new File(fileName));
			while(inFile.hasNext()) {
				String str = inFile.next();
				addWord(str);
			}
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file exists!"); // e.printStackTrace(); �ᵵ ��.
			return;
		}
	}
	
	static void addWord(String str) {
		int index = findWord(str); // returns -1 if not found
		if(index != -1) {		   // found words[index] == str
			count[index]++;
		} else {				   // not found
			words[n] = str;
			count[n] = 1;
			n++;
		}
	}
	
	static int findWord(String str) {
		for(int i=0; i<n; i++)
			if(words[i].equals(str))
				return i;
		return -1;
	}
	
	static void saveAS(String fileName) {
		PrintWriter outFile;
		try {
			outFile = new PrintWriter(new FileWriter(fileName));
			for(int i=0; i<n; i++)
				outFile.println(words[i] + " " + count[i]);
			outFile.close();
		} catch (IOException e) {
			System.out.println("Save failed!");
			return;
		}

	}
}
