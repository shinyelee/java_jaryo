package projectInheritance;

class Cal{
	int v1, v2;
	Cal(int v1, int v2) {
		System.out.println("Cal init!!");
		this.v1 = v1; this.v2 = v2;
	}
	public int sum() { // 생성자
		return this.v1+v2;
	}
}

class Cal3 extends Cal{
	Cal3(int v1, int v2) {
		super(v1, v2);
		// 생성자가 있는 부모 클래스를 상속받으려면
		// -> 생성자도 함께 상속 받아야 한다.
		System.out.println("Cal3 init!!");
	}
	public int minus() { // 생성자
		return this.v1-v2;
	}
}

public class InheritanceApp {
	public static void main(String[] args) {
    	Cal c = new Cal(2, 1);
    	Cal3 c3 = new Cal3(2, 1);
    	System.out.println(c3.sum()); // 3
    		System.out.println(c3.minus()); // 1
	}
}