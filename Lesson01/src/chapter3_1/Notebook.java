package chapter3_1;

// Computer 클래스 상속 받아서 새 클래스인 Notebook 재정의.
public class Notebook extends Computer {
	
	public double screenSize;
	public double weight;
	
	// 모든 서브 클래스의 생성자는 먼저 수퍼 클래스의 생성자를 호출한다.
	// 1. super(...)를 통해 명시적으로 호출.
	// 2. 1이 아니면 자동으로 no-parameter 생성자가 호출된다.
	public Notebook(String man, String proc, int ram, int disk, double speed, double screen, double weight) {
		
		// 흔한 오류 발생 원인 :
		// 수퍼 클래스에 no-parameter 생성자가 없는데
		// 서브 클래스의 생성자에서 super(...) 호출을 안 해주는 경우
		// -> 아래와 같이 수퍼 클래스의 생성자 호출해서 해결.
		
		super(man, proc, ram, disk, speed);
		// super(arguments) : 
		// 수퍼 클래스의 생성자 중에서 매개변수 리스트가 일치하는 생성자를 호출한다.
		// super()를 호출할 경우 반드시 생성자 내에서 첫 문장이어야 한다.
		
		screenSize = screen;
		this.weight = weight;
	}
	public static void main(String[] args) {
		Notebook test = new Notebook("Dell", "i5", 4, 1000, 3.2, 15.6, 1.2);
		
		System.out.println(test.computePower());
	}
}
// 상속 :
// Computer는 super/base/parent 클래스.
// Notebook은 sub/extended/child 클래스.