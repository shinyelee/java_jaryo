package chapter1_1;

public class Code06 {

	public static void main(String[] args) {
		
		int [] grades;
		grades = new int[5];
		
		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
		// length는 배열의 크기이지 배열에 저장된 데이터의 개수가 아니다(비워두기도 하니까).
		
		// for 반복문을 사용하면 동일한 일을 반복하는 것을 효과적으로 표현할 수 있다.
		for(int i=0; i<grades.length; i++) { // 여기 선언한 변수 i는 for문 안에서만 적용.
			System.out.println("Grade " + (i+1) + ": " + grades[i]);
		}

	}

}
