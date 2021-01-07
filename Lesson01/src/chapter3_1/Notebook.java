package chapter3_1;

public class Notebook extends Computer {
	
	public double screenSize;
	public double weight;
	
	public Notebook(String man, String proc, int ram, int disk, double speed, double screen, double weight) {
		super(man, proc, ram, disk, speed);
		screenSize = screen;
		this.weight = weight;
	}
	
	// 부모로부터 받은  메서드를 그대로 쓰지 않고 바꾸고 싶으면
	// -> 똑같은 이름의 메서드를 만들어서 덮어쓰면 되는데
	// -> 이걸 Method Overriding이라고 함.
	public String toString() {
		String result = super.toString() +
						"\nScreen Size: " + screenSize + " inches" +
						"\nWeight: " + weight + " kg";
		return result;
	}
	
	public static void main(String[] args) {
		Notebook test = new Notebook("Dell", "i5", 4, 1000, 3.2, 15.6, 1.2);
		
		System.out.println(test.computePower());
		System.out.println(test.toString());
	}
}