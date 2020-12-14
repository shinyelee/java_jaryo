import java.util.Scanner;

public class Code04 {

	public static void main(String[] args) {
		
		String name = null;
		int age;
		String gender;
		
		Scanner kb = new Scanner(System.in); // ""로 둘러싼 문자열을 string literal이라고 부른다.
		System.out.println("Please type your name and your age and your gender: ");
		
		name = kb.next();	// 키보드로부터 문자(단어) 입력받음.
		age = kb.nextInt();	// 키보드로부터 정수 입력받음.
		gender = kb.next(); // 키보드로부터 문자(단어) 입력받음.
		
		if(gender.equals("male")) // if문 중괄호 생략 가능.
			System.out.println(name + ", you're " + age + "years old man.");
		else if(gender.equals("female"))
			System.out.println(name + ", you're " + age + "years old woman.");
		else
			System.out.println("Hmm... interesting."); // if ~ else if ~ else로 연속 비교 가능.
		
		kb.close();
	}

}