package Chapter1_Section1;

import java.util.Scanner; // import���� ���̺귯���� ����� �� �ְ� ���ش�.

public class Code02 {

	public static void main(String[] args) {

		int number = 123;

		Scanner kb = new Scanner(System.in); // Ű����κ��� �Է��� �ޱ� ���� kb��� �̸��� ��ĳ�ʸ� �������.
											 // System.in�� Ű���带 �ǹ��Ѵ�.
		System.out.println("Please enter an integer: ");

		int input = kb.nextInt(); // Ű����κ��� �ϳ��� ������ �Է¹޾� ���� input�� �����Ѵ�.

		if(input == number) {						 		 // Ű����� �Է��� ���ڰ� int number ���� ������
			System.out.println("Numbers match! :-)");		 // "" �� ���ڿ� ���.
		} else {											 // �ٸ���
			System.out.println("Numbers do not match! :-("); // "" �� ���ڿ� ���.
		}

		kb.close(); // ��ĳ�� ����(�� �ڵ� ���Ծ ���α׷� ���࿡ ���� ������ ��ĳ�ʰ� �ʿ�������� �������� �ݴ� ���� ����).
	}

}

// import�� �ڵ����� : ctl+shift+o