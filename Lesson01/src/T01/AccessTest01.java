package T01;

public class AccessTest01 {

	public static void main(String[] args) {
		
		Access01 ac = new Access01();
		System.out.println(ac.a);
		System.out.println(ac.b);

	}

}

class Access01 {
	
	int a = 200;
	int b = 100;
	
//	private int b = 100;
	// private�� ���� Ŭ����(Access01) �������� ��� ����.
	// -> Access01 �� Ŭ�������� ����ϸ� ���� �߻�.
	
}