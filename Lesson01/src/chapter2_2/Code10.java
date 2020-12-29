package chapter2_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code10 {

	public static void main(String[] args) {
		
		try {
			Scanner in = new Scanner(new File("data.txt"));
			int n = in.nextInt();
			OrthoPolygon thePolygon = new OrthoPolygon(n);
			// �������� ������ ���� �Է¹޾� �ٰ����� �����Ѵ�.
			
			for(int i=0; i<n; i++)
				thePolygon.addVertex(in.nextInt(), in.nextInt());
				// �������� ��ǥ�� �ð���� ������ �Է¹޾� �ٰ����� �߰��Ѵ�.
			MyPoint2 p = new MyPoint2(in.nextInt(), in.nextInt());
			// �׽�Ʈ�� ���� ��ǥ�� �Է¹޾� �� p�� �����Ѵ�.
			in.close();
			if(thePolygon.contains(p)) // �������� �ܺ����� �˻��Ѵ�.
				System.out.println("Yes");
			else
				System.out.println("No");
		} catch (FileNotFoundException e) {
			System.out.println("No data file exists!");
			System.exit(1);
		}
	}
}
