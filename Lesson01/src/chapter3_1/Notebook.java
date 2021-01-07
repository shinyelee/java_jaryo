package chapter3_1;

// Computer Ŭ���� ��� �޾Ƽ� �� Ŭ������ Notebook ������.
public class Notebook extends Computer {
	
	public double screenSize;
	public double weight;
	
	// ��� ���� Ŭ������ �����ڴ� ���� ���� Ŭ������ �����ڸ� ȣ���Ѵ�.
	// 1. super(...)�� ���� ��������� ȣ��.
	// 2. 1�� �ƴϸ� �ڵ����� no-parameter �����ڰ� ȣ��ȴ�.
	public Notebook(String man, String proc, int ram, int disk, double speed, double screen, double weight) {
		
		// ���� ���� �߻� ���� :
		// ���� Ŭ������ no-parameter �����ڰ� ���µ�
		// ���� Ŭ������ �����ڿ��� super(...) ȣ���� �� ���ִ� ���
		// -> �Ʒ��� ���� ���� Ŭ������ ������ ȣ���ؼ� �ذ�.
		
		super(man, proc, ram, disk, speed);
		// super(arguments) : 
		// ���� Ŭ������ ������ �߿��� �Ű����� ����Ʈ�� ��ġ�ϴ� �����ڸ� ȣ���Ѵ�.
		// super()�� ȣ���� ��� �ݵ�� ������ ������ ù �����̾�� �Ѵ�.
		
		screenSize = screen;
		this.weight = weight;
	}
	public static void main(String[] args) {
		Notebook test = new Notebook("Dell", "i5", 4, 1000, 3.2, 15.6, 1.2);
		
		System.out.println(test.computePower());
	}
}
// ��� :
// Computer�� super/base/parent Ŭ����.
// Notebook�� sub/extended/child Ŭ����.