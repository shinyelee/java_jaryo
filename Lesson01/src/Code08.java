import java.util.Scanner;

public class Code08 {

	public static void main(String[] args) {
		
		// ����ڷκ��� n���� ������ �Է¹��� �� �հ� �ִ밪�� ���Ͽ� ����Ͻÿ�.
		
		System.out.println("�Է��ϰ���� ���ڴ� �� �� ���ΰ���?");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println("���� " + n + "���� �������� �Է��ϼ���.");
		int [] data = new int[n];
		
		for(int i = 0; i < n; i++)
			data[i] = kb.nextInt();
		kb.close();
		
//		int sum = 0;
//		for(int i=0; i<n; i++) {
//			sum += data[i];
//		}
//		System.out.println("The sum is " + sum);
		
		int sum = 0;
		int max = data[0]; // int sum = 0, max = data[0];�� ����.
		
		for(int i = 0; i < n; i++) {
			sum += data[i]; // sum = sum + data[i];�� ����.
			if(data[i] > max) max = data[i];
		}
		System.out.println("�Է��Ͻ� ���� �� ���� [" + sum + "]�̰�, ���� ū ���� [" + max + "]�Դϴ�.");
	}

}
