package Chapter1_Section1;

import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		
		String str = "Hello"; // ���ڿ� ����.
		String input = null;  // String input;���� �ᵵ ����.
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please type a string: ");
		input = kb.next(); // next() �޼���� �ϳ��� ���ڿ�(�ܾ� 1��)�� �о��ش�.
						   // �Ǽ��� nextDouble(), �� ���� nextLine() ���� �ִ�.
		
//		if(str == input) {								 	 // ��Ʈ���� ������Ƽ�� Ÿ���� �ƴϹǷ�
//			System.out.println("Strings match! :-)");		 // if(str == input)�� �� �� ����.
//		}													 // -> ���ڿ� �񱳴� ==������(X)
//		else {												 // -> ���ڿ� �񱳴� equal�޼���(O)
//			System.out.println("Strings do not match! :-("); // ����� true �Ǵ� false.
//		}
		
		if(str.equals(input)) {								 // if(input.equals(str))�� �ᵵ ����.
			System.out.println("Strings match! :-)");		 // str�� input�� ��ġ�� �� ���.
		}
		else {
			System.out.println("Strings do not match! :-("); // str�� input�� ����ġ�� �� ���.
		}
		
		kb.close();
	}

}

// hello -> ��ҹ��� �����ϹǷ� ����ġ
