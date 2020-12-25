package Chapter2_Section1;

// Java에서 각각의 클래스는 별개의 파일에 저장되어야하고 파일의 이름은 클래스의 이름과 일치해야 한다.
// 즉 클래스 Person1은 Person1.java라는 이름의 파일로 저장해야 한다.

public class Person1 { // 클래스의 이름은 항상 대문자로 시작하는 것이 국룰.
	
	// 이 클래스의 주 목적은 한 사람의 이름(name)과 그 사람의 전화번호(number)를 하나의 단위로 묶는 것.
	// 여기서 name과 number를 클래스 Person1의 필드(field)라고 부른다.
	// 즉 클래스 Person1은 name과 number라는 두 개의 필드를 가지고 있다.
	
	public String name; // field, data member
	public String number;
	
}