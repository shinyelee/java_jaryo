package Chapter1_Section3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Code23 {
	
	// Code22 ������
	// 1. �Ҽ���, ��ǥ ���� Ư����ȣ�� �ܾ ���Ե�.
	// 2. ���� ���� �ܾ�� ��޵�.
	// 3. �빮�ڿ� �ҹ��ڰ� �ٸ� �ܾ�� ��޵�.
	// 4. �ܾ���� ���ĺ� ������ ���ĵ��� ����.
	// -> trimming�̶�� �޼��带 �߰��� ��������!
	
	static String [] words = new String [5000];
	static int [] count = new int [5000];
	static int n = 0;

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		while(true) {
			
			System.out.print("$ ");
			String command = kb.next();
			
			if(command.equals("read")) {
				String fileName = kb.next();
				makeIndex(fileName);
			}
			else if(command.equals("find")) {
				String str = kb.next();
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

	static void makeIndex(String fileName) { // 1, 2 �ذ�.
		try {
			Scanner inFile = new Scanner(new File(fileName));
			while(inFile.hasNext()) {
				String str = inFile.next();
				String trimmed = trimming(str); // �߰��� �޼���.
				if(trimmed != null) {
					String t = trimmed.toLowerCase(); // 3 �ذ�(��ҹ��� -> �ҹ��ڷ� ��ȯ).
					addWord(t);
				}
			}
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file exists!");
			return;
		}
	}
	
	static String trimming(String str) { // �߰��� �޼���.
		int i = 0, j = str.length()-1;
		
		while(i<str.length() && !Character.isLetter(str.charAt(i))) // while i-th character is not letter
			i++;
		while(j>=0 && !Character.isLetter(str.charAt(j)))
			j--;
		
		if(i>j)
			return null;
		return str.substring(i, j+1);
	}
	
	static void addWord(String str) {
		int index = findWord(str);
		if(index != -1) { // exist
			count[index]++;
		} else {		  // not exist
			words[n] = str;
			count[n] = 1;
			n++;
		}
	}
	
	static int findWord(String str) {
		for(int i=0; i<n; i++)
			if(words[i].equalsIgnoreCase(str)) // 3 �ذ�(.equalsIgnoreCase�� ��ҹ��� ����X).
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
