
//  static int num;	// Ŭ���� �ۿ��� ���� ���� - �Ұ���

public class Code01 {
	
	static int num; // �޼��� �ۿ��� ���� ���� - ����
	
	public static void main(String[] args) { // public, static �� ��Ҵ� ���߿� ��� ����.
		
		int anotherNum = 5; // �޼��� �ȿ��� ���� ���� - ����
		
		num = 2;
		
		System.out.println(num + anotherNum);				// ���� + ���� => �� ���� ���� �� ���.
		System.out.println("Num: " + num);					// ""�� ���� => ���� + ���� => ���ڿ� ���ڸ� ������ ���.
		System.out.println("AnotherNum: " + anotherNum);	// ""�� ���� => ���� + ���� => ���ڿ� ���ڸ� ������ ���.
		System.out.println("Sum: " + num + anotherNum);		// ""�� ���� => ���� + ���� + ���� => ���ڿ� ���ڸ� ������ ���. 
		System.out.println("Sum: " + (num + anotherNum));	// ��ȣ���� ó�� => ���� + (���� + ����) => �� ���� ���� �� ���.
	}

}

