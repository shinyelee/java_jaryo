import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		String str = "Hello, world";
		String input = null;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please type a string: ");
		input = kb.next(); // next() �޼���� �ϳ��� ���ڿ��� �о��ش�.
						   // �Ǽ��� nextDouble(), �� ���� nextLine() ���� �ִ�.
		if(str == input) {									 // �� String�� ���Ѵ�.
			System.out.println("Strings match! :-)");		 // ��ġ�� ��
		}
		else {
			System.out.println("Strings do not match! :-("); // ����ġ�� ��
		}
		
		kb.close();
	}

}
