import java.util.Scanner;

public class Code12 {

	public static void main(String[] args) {
		
		// ����ڷκ��� n���� ������ �Է¹޾� �迭�� ������ ��, ���ӵ� ������ ���� �� �� �ִ밪�� ����Ͻÿ�.
		// ��) �Է��� ������ [1 -2 5 0 3 -4]�� ��� ��°��� [5 0 3]�� ���� 8�� �ȴ�.
		
		System.out.println("�Է��ϰ� ���� ���ڴ� �� �� ���ΰ���?");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println("���� " + n + "���� �������� �Է��ϼ���.");
		int [] data = new int[n];
		
		for(int i=0; i<n; i++)
			data[i] = kb.nextInt();
		kb.close();
		
		int max = 0; // �ִ밪 �ʱ�ȭ
		for(int i=0; i<n; i++) {	  // ���� ������
			for (int j=i; j<n; j++) { // ���� ����
				
				int sum = 0;
				for(int k=i; k<=j; k++) // ���� ��
					sum += data[k];
				
				if(sum>max) // ���� �� �� �ִ밪
					max=sum;	
			}
		}
		
		// �ڵ� ����ȭ ver.		
//		int max = 0;
//		for(int i=0; i<n; i++) {
//			int sum = 0;
//			for (int j=i; j<n; j++) {
//					sum += data[j];
//				if(sum>max) // ���� �� �� �ִ밪
//					max=sum;	
//			}			
//		}
		
		System.out.println("���ӵ� ������ ���� �� �� �ִ밪�� " + max + "�Դϴ�.");
	}

}
