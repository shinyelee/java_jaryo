package projectException;

public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println(1);
		int [] scores = {10, 20, 30};
		
		try {
			System.out.println(2);
			System.out.println(scores[3]); // �������
			System.out.println(3);
			System.out.println(2/0);
			System.out.println(4); // ������� ��� X.
		} catch (Exception e) {
			System.out.println("���� �߸��� �� ����."+e.getMessage());
		}	// e.getMessage(): ���� ���� �˷���.
		System.out.println(5);
	}

}