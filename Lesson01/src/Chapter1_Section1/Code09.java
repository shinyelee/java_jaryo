import java.util.Scanner;

public class Code09 {

	public static void main(String[] args) {
		
		// ����ڷκ��� n���� ������ �Է¹޾� ������� �迭�� ������ ��, ���������� �� ĭ �̵�(shift)��Ű�ÿ�.
		// ��) ����ڰ� [1 2 3 4 5]�� �Է��ߴٸ� ��� ����� [5 1 2 3 4]�� �ȴ�.
		
		System.out.println("�Է��ϰ� ���� ���ڴ� �� �� ���ΰ���?");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println("���� " + n + "���� �������� �Է��ϼ���.");
		int [] data = new int[n]; // �迭 ������.
		
		for(int i=0; i<n; i++)	  // ������� ����.
			data [i] = kb.nextInt();
		kb.close();

		int tmp = data[n-1];		// ������ ��(���� ���� [5])�� �ӽ÷� ŵ�صδ� ��ȸ�� ����.
		for(int i=n-2; i>=0; i--) { // ������ ��(���� ���� [1 2 3 4])
			data[i+1] = data [i];	// �� ĭ�� shift.
		}
		data[0] = tmp;
		
		// �̷��Ե� ����.
//		int tmp = data[n-1];
//		for(int i=n-1; i>=1; i--) {
//			data[i] = data [i-1];
//		}
//		data[0] = tmp;
		
		for(int i=0; i<n; i++) // ����.
			System.out.println(data[i]);
	}

}
