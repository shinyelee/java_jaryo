package Chapter2_Section1;

public class Code02 {

	public static void main(String[] args) {
		
		Person1 first = new Person1();
		
		first.name = "John";
		first.number = "01022223333";
		System.out.println("Name: " + first.name + ", Number: " + first.number);
		
		Person1 second = first;
		second.name = "Tom";
		System.out.println("First.Name: " + first.name);
		System.out.println("Second.Name: " + second.name);
		// second.name�� �ٲ����� first.name�� ������ ��ü�� "����"�ϱ� ������ �� �� Tom ���.
		// -> ȣ��� �޼��尡 ���� ���� �״�� �������� �� �ƴ϶� "�迭�� �ּ�"�� �����ϱ� ����.
		// -> ���� ���� ȣ��� �޼��忡�� �迭�� ���� �����ϸ� ���� �迭�� ���� �ٲ�� �ȴ�.
		
		Person1 [] members = new Person1 [100];
		members[0] = first;
		members[1] = second;
		System.out.println("[0]Name: " + members[0].name + ", Number: " + members[1].number);
		System.out.println("[1]Name: " + members[1].name + ", Number: " + members[1].number);
		
		members[2] = new Person1();		   // �� �� �����ϸ�(��ü ���� �� �ϸ�) NullPointerException �߻�.
		members[2].name = "Harry";		   // �迭�� �� ĭ�� Person1 Ÿ�� -> ������Ƽ�� Ÿ���� �ƴ� "���� ��"��.
		members[2].number = "01009430943"; // ���� ������ ��ü ���� ���� �̸�, ��ȣ�� �ٷ� ������ ���� ����.
		System.out.println("[2]Name: " + members[2].name + ", Number: " + members[2].number);
	}

}
