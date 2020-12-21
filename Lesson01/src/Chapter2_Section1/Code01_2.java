package Chapter2_Section1;

public class Code01_2 {

	public static void main(String[] args) {
		
		Person1 first = new Person1();
		
		first.name = "John";
		first.number = "01022223333";
		System.out.println("Name: " + first.name + ", Number: " + first.number);
		
		Person1 second = first;
		second.name = "Tom"; // second.name만 바꿨지만 first.name도 동일한 객체를 참조하기 때문에 둘 다 Tom 출력.
		System.out.println("First.Name: " + first.name);
		System.out.println("Second.Name: " + second.name);
		
		Person1 [] members = new Person1 [100];
		members[0] = first;
		members[1] = second;
		System.out.println("[0]Name: " + members[0].name + ", Number: " + members[1].number);
		System.out.println("[1]Name: " + members[1].name + ", Number: " + members[1].number);
		
		members[2] = new Person1();		   // 이 행 생략하면(객체 생성 안 하면) NullPointerException 발생.
		members[2].name = "Harry";		   // 배열의 각 칸은 Person1 타입 -> 프리미티브 타입이 아닌 참조 변수.
		members[2].number = "01009430943"; // 참조 변수는 객체 생성 없이 이름, 번호를 바로 저장할 수는 없다.
		System.out.println("[2]Name: " + members[2].name + ", Number: " + members[2].number);
	}

}
