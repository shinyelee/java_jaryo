package ProjectMethod;

public class WhyMethod {

	public static void printTwoTimesA() {
		// 여기서 1번만 수정하면
		System.out.println("-");
		System.out.println("A");
		System.out.println("A");
	}
	
	public static void main(String[] args) {
		// 오조오억번 수정할 필요 없음
		printTwoTimesA();
		printTwoTimesA();
		printTwoTimesA();

	}

}

// 코드 자동으로 메소드화하는 방법?
// 블럭선택 후 우클릭 -> Refactor -> Extract Method...
// -> Method name 설정 -> public 체크 -> OK -> OK
