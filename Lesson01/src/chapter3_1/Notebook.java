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
		// 다형성(Polymorphism) :
		// Computer 타입의 참조변수 test가 Notebook 타입의 객체를 참조.
		Computer test = new Notebook("Dell", "i5", 4, 1000, 3.2, 15.6, 1.2);
		
		// 반대의 경우는 성립하지 않음.
//		Notebook test = new Computer("Dell", "i5", 4, 1000, 3.2);
		
		System.out.println(test.computePower());
		System.out.println(test.toString());
		// test는 Computer 타입의 변수면서 실제로는 Notebook 개체를 참조하고 있다.
		// 그리고 두 클래스는 각자의 toString()을 가지고 있다.
		// 여기서 둘 중 어떤 toString() 메서드가 실행될까?
		// -> Notebook 클래스의 toString() 메서드가 실행된다.
		// 즉 동적 바인딩(dynamic binding)이 일어난다.
	}
}