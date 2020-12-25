package Chapter2_Section1;

public class Code01 { // Chapter01 Code20 참고.
	
	// 기존 전화번호부의 문제점

	// 이름(name)과 전화번호(number)는 한 쌍인데, 이들을 각각 별개의 변수에 저장하면
	// -> 이름 데이터를 옮길 때마다 전화번호 데이터도 따로 옮겨줘야 함.
	// -> 여기에 주소, 이메일 등 다른 정보까지 추가되면 진짜 개귀찮아짐.
	// -> 서로 관련있는 데이터들을 하나의 단위로 묶어두면(Person1) 편해진다.
	// 여기서 말하는 '하나의 단위로 묶는' 것이 바로 클래스(class)다.

	public static void main(String[] args) {
		
		// 클래스도 int, double 등 처럼 하나의 타입이다.
		// java가 미리 정해놓은(프리미티브) 타입이 아님 -> '사용자 정의 타입'이라고 부르기도 한다.
		
		int x;
		x = 100;
		
		double y = 3.14;
		
		// int, double 등 다른 변수와 마찬가지로 Person1형 변수를 선언, 사용할 수 있다.
		
		Person1 first;		   // 변수 선언
		first = new Person1(); // 하나의 Person1 타입의 객체를 생성하고 그것을 first라 한다.
		
		first.name = "John";		  // first 객체의 name 필드와 number 필드에
		first.number = "01022223333"; // 각각 이름과 전화번호를 저장한다.
		
		System.out.println("Name: " + first.name + ", Number: " + first.number);
		// first.number는 first가 가리키는 Person1 객체의 number 필드를 의미한다.
		
		Person1 [] members = new Person1 [10]; // Person1 타입의 배열 만드는 것도 가능하다.
		members[0] = first;
		members[1] = new Person1();
		members[1].name = "David";
		members[1].number = "01045456767";
		
		System.out.println("Name: " + members[1].name + ", Number: " + members[1].number);
		
		// 프리미티브 타입과 클래스는 차이가 있다.		
//		int count = 0;				   // count라는 이름의 변수 안에 정수값 0 저장.
//		Person1 first = new Person1(); // first라는 이름의 변수만 만듦.
									   // -> 이름과 전화번호를 저장할 객체는 new 명령으로 따로 만들어야 하고
									   //    변수 first에는 그 객체의 주소(참조)를 저장할 수 있다.
	}

}
