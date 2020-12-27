package chapter2_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IndexMaker {
	
	// Code23 인덱스 메이커 수정하기(클래스 아이템 사용)
	
//	static String [] words = new String [10000];
//	static int [] count = new int [10000];
	static Item [] items = new Item [10000];	
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
					System.out.println("The word " + items[index].word + " appears " + items[index].count + "times.");
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
				String trimmed = trimming(str);
				if(trimmed != null) {
					String t = trimmed.toLowerCase();
					addWord(t);
				}
			}
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file exists!");
			return;
		}
	}
	
	static String trimming(String str) {
		int i = 0, j = str.length()-1;
		
		while(i<str.length() && !Character.isLetter(str.charAt(i)))
			i++;
		while(j>=0 && !Character.isLetter(str.charAt(j)))
			j--;
		
		if(i>j)
			return null;
		return str.substring(i, j+1);
	}
	
	static void addWord(String str) {
		int index = findWord(str);
		if(index != -1) {
			items[index].count++;
		} else {
			int i = n-1;
			while(i>=0 && items[i].word.compareTo(str)>0) { 
				items[i+1] = items[i];
//				words[i+1] = words[i]; // items로 묶어놨으니
//				count[i+1] = count[i]; // -> words, count로 분리할 필요 X.
				i--;
			}
			items[i+1] = new Item(); // 객체 생성.
			items[i+1].word = str;
			items[i+1].count = 1;
			n++;
		}
	}
	
	static int findWord(String str) {
		for(int i=0; i<n; i++)
			if(items[i].word.equalsIgnoreCase(str)) // 3 해결(.equalsIgnoreCase는 대소문자 구분X).
				return i;
		return -1;
	}
	
	static void saveAS(String fileName) {
		PrintWriter outFile;
		try {
			outFile = new PrintWriter(new FileWriter(fileName));
			for(int i=0; i<n; i++)
				outFile.println(items[i].word + " " + items[i].count);
			outFile.close();
		} catch (IOException e) {
			System.out.println("Save failed!");
			return;
		}

	}
}
