package chapter3_3;

public class Test { // subclass of Object
	public int a = 10;
	public double x = 1.23;
	
//	public String toString() {
//		return a + " " + x;
//	}

	public boolean equals(Object other) { // overriding
		Test other2 = (Test)other; // type casting
		return a==other2.a && x==other2.x;
	}
	
	public static void main(String[] args) {
//		Test test1 = new Test();
//		Test test2 = new Test();
//		test2.a = 5;
//		test2.x = 9.8765;
		
//		System.out.println(test1.toString());
//		
//		if(test2.equals(test1))
//			System.out.println("yes");
//		else
//			System.out.println("no");
		
	Object [] array = new Object[100];
	int a = 20;
//	Integer age = new Integer(a); // wrapping
	array[0] = a; // autoboxing
	
	int b = (Integer)array[0]; // auto unboxing, unwrapping
	
	System.out.println(b);
	
	String str = "1234";
	int c = Integer.parseInt(str);
	System.out.println(c);
	}
}
