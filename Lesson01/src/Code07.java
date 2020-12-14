
public class Code07 {

	public static void main(String[] args) {
		
		int [] grades = new int[5];
		
		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
		
		int i = 0;
		// 이번엔 while문을 썼다.
		while(i < grades.length) { // 여기 선언한 변수 i는 for문 안에서만 적용.
			System.out.println("Grade " + (i+1) + ": " + grades[i]);
			i++;
		}

	}

}
