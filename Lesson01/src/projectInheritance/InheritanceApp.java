package projectInheritance;

class Cal {
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
}

class Cal3 extends Cal { // Cal 클래스를 확장한다는 의미.
	// 변수와 메소드를 상속해 다른 클래스가 갖게 함.
	// -> 재사용성↑ 유지보수↑ 가독성↑ 코드양↓
}

public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println("c : " + c.sum(2, 1));
		
		Cal c3 = new Cal3(); // Cal 클래스 상속됨.
		System.out.println("c3 : " + c3.sum(2, 1));
	}

}

class Cal2 {
	public int sum(int v1, int v2) { // Cal 클래스와 중복인 코드.
		return v1 + v2;
	}
	
	public int minus(int v1, int v2) {
		return v1 - v2;
	}
}