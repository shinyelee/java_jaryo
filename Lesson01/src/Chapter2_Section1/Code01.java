package Chapter2_Section1;

public class Code01 { // Chapter01 Code20 ����.
	
	// ���� ��ȭ��ȣ���� ������

	// �̸�(name)�� ��ȭ��ȣ(number)�� �� ���ε�, �̵��� ���� ������ ������ �����ϸ�
	// -> �̸� �����͸� �ű� ������ ��ȭ��ȣ �����͵� ���� �Ű���� ��.
	// -> ���⿡ �ּ�, �̸��� �� �ٸ� �������� �߰��Ǹ� ��¥ ����������.
	// -> ���� �����ִ� �����͵��� �ϳ��� ������ ����θ�(Person1) ��������.
	// ���⼭ ���ϴ� '�ϳ��� ������ ����' ���� �ٷ� Ŭ����(class)��.

	public static void main(String[] args) {
		
		// Ŭ������ int, double �� ó�� �ϳ��� Ÿ���̴�.
		// java�� �̸� ���س���(������Ƽ��) Ÿ���� �ƴ� -> '����� ���� Ÿ��'�̶�� �θ��⵵ �Ѵ�.
		
		int x;
		x = 100;
		
		double y = 3.14;
		
		// int, double �� �ٸ� ������ ���������� Person1�� ������ ����, ����� �� �ִ�.
		
		Person1 first;		   // ���� ����
		first = new Person1(); // �ϳ��� Person1 Ÿ���� ��ü�� �����ϰ� �װ��� first�� �Ѵ�.
		
		first.name = "John";		  // first ��ü�� name �ʵ�� number �ʵ忡
		first.number = "01022223333"; // ���� �̸��� ��ȭ��ȣ�� �����Ѵ�.
		
		System.out.println("Name: " + first.name + ", Number: " + first.number);
		// first.number�� first�� ����Ű�� Person1 ��ü�� number �ʵ带 �ǹ��Ѵ�.
		
		Person1 [] members = new Person1 [10]; // Person1 Ÿ���� �迭 ����� �͵� �����ϴ�.
		members[0] = first;
		members[1] = new Person1();
		members[1].name = "David";
		members[1].number = "01045456767";
		
		System.out.println("Name: " + members[1].name + ", Number: " + members[1].number);
		
		// ������Ƽ�� Ÿ�԰� Ŭ������ ���̰� �ִ�.		
//		int count = 0;				   // count��� �̸��� ���� �ȿ� ������ 0 ����.
//		Person1 first = new Person1(); // first��� �̸��� ������ ����.
									   // -> �̸��� ��ȭ��ȣ�� ������ ��ü�� new ������� ���� ������ �ϰ�
									   //    ���� first���� �� ��ü�� �ּ�(����)�� ������ �� �ִ�.
	}

}
