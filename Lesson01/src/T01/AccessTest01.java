package T01;

public class AccessTest01 {

	public static void main(String[] args) {
		
		Access01 ac = new Access01();
		System.out.println(ac.a);
		System.out.println(ac.b);

	}

}

class Access01 {
	
	int a = 200;
	int b = 100;
	
//	private int b = 100;
	// private은 같은 클래스(Access01) 내에서만 사용 가능.
	// -> Access01 외 클래스에서 사용하면 에러 발생.
	
}