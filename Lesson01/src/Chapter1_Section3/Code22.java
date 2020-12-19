package Chapter1_Section3;

import java.io.File;
import java.io.FileNotFoundException;
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
	
	static String [] words = new String [5000];
	static String [] count = new String [5000];
	static int n = 0;

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		while(true) {
			
			System.out.println("$ ");
			String command = kb.next();
			
			if(command.equals("read")) {
				String fileName = kb.next();
				makeIndex(fileName);
			} else if(command.equals("find")) {
				
			} else if(command.equals("saveAS")) {
				
			} else if(command.equals("exit"))
				break;
		}
		kb.close();
	}

	static void makeIndex(String fileName) {
		try {
			Scanner inFile = new Scanner(new File(fileName));
			// ���� 21�к��� ���.
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file exists!"); // e.printStackTrace(); �ᵵ ��.
			return;
		}
	}
}
