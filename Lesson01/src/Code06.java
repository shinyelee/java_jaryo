
public class Code06 {

	public static void main(String[] args) {
		
		int [] grades;
		grades = new int[5];
		
		grades[0] = 100;
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
		// length�� �迭�� ũ������ �迭�� ����� �������� ������ �ƴϴ�(����α⵵ �ϴϱ�).
		
		// for �ݺ����� ����ϸ� ������ ���� �ݺ��ϴ� ���� ȿ�������� ǥ���� �� �ִ�.
		for(int i = 0; i < grades.length; i++) { // ���� ������ ���� i�� for�� �ȿ����� ����.
			System.out.println("Grade " + (i+1) + ": " + grades[i]);
		}

	}

}
