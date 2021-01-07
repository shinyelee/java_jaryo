package chapter3_1;

public class Notebook extends Computer {
	
	public double screenSize;
	public double weight;
	
	public Notebook(String man, String proc, int ram, int disk, double speed, double screen, double weight) {
		super(man, proc, ram, disk, speed);
		screenSize = screen;
		this.weight = weight;
	}
	
	public String toString() {
		String result = super.toString() +
						"\nScreen Size: " + screenSize + " inches" +
						"\nWeight: " + weight + " kg";
		return result;
	}
	
	public static void main(String[] args) {
		// ������(Polymorphism) :
		// Computer Ÿ���� �������� test�� Notebook Ÿ���� ��ü�� ����.
		Computer test = new Notebook("Dell", "i5", 4, 1000, 3.2, 15.6, 1.2);
		
		// �ݴ��� ���� �������� ����.
//		Notebook test = new Computer("Dell", "i5", 4, 1000, 3.2);
		
		System.out.println(test.computePower());
		System.out.println(test.toString());
		// test�� Computer Ÿ���� �����鼭 �����δ� Notebook ��ü�� �����ϰ� �ִ�.
		// �׸��� �� Ŭ������ ������ toString()�� ������ �ִ�.
		// ���⼭ �� �� � toString() �޼��尡 ����ɱ�?
		// -> Notebook Ŭ������ toString() �޼��尡 ����ȴ�.
		// �� ���� ���ε�(dynamic binding)�� �Ͼ��.
	}
}