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
		
		// while�� for�� �Բ� ��ǥ���� �ݺ����� �ϳ���.
		while(i<grades.length) { // ���� ������ ���� i�� for�� �ȿ����� ����.
			System.out.println("Grade " + (i+1) + ": " + grades[i]);
			i++;
		}

		// ��� for���� while������ �ٲ� �� �ְ�, �� ���� ����������.
		// �Ϲ������� �ݺ��� Ƚ���� ������ ���� ��� for����, �׷��� ���� ��� while���� ��ȣ�Ѵ�.
	}

}
