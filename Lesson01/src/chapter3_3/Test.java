package chapter3_3;

public class Test { // subclass of Object
	public int a = 10;
	public double x = 1.23;
	
//	public String toString() {
//		return a + " " + x;
//	}

	public boolean equals(Test other) {
		return a==other.a && x==other.x;
	}
	
	public static void main(String[] args) {
		Test test1 = new Test();
		Test test2 = new Test();
//		test2.a = 5;
//		test2.x = 9.8765;
		
		System.out.println(test1.toString());
		
		if(test2.equals(test1))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
