package chapter1_1;

public class Code07 {

	public static void main(String[] args) {
		
		int [] grades = new int[5];
		
		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
		
		int i = 0;
		
		// while은 for과 함께 대표적인 반복문의 하나다.
		while(i<grades.length) { // 여기 선언한 변수 i는 for문 안에서만 적용.
			System.out.println("Grade " + (i+1) + ": " + grades[i]);
			i++;
		}

		// 모든 for문은 while문으로 바꿀 수 있고, 그 역도 마찬가지다.
		// 일반적으로 반복의 횟수가 정해져 있을 경우 for문을, 그렇지 않을 경우 while문을 선호한다.
	}

}
