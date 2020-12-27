package chapter2_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code05 {
	
	// ���� ��ǥ�࿡ ������ n���� ���簢���� ���� �����͸� �Է� ���� ��
	// ������ ���� �ͺ��� ū �� ������ �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	// �Է� ������ ����:
	// 0 1 2 4	����-���� �������� ��ǥ�� (0,1)�̰� �ʺ� 2, ���̰� 4
	// 1 4 7 8
	// 4 3 12 9
	// 8 18 11 30
	// 5 10 6 11

	// ������ ���Ϸκ��� �簢���� ���� ������ �о� �迭 rects�� �����Ѵ�.
	static MyRectangle1 [] rects = new MyRectangle1 [100];
	static int n = 0; // ���� �簢���� ����.
	
	public static void main(String[] args) {
		
		try {
			Scanner in = new Scanner(new File("data.txt"));
			while(in.hasNext()) {
				
				rects[n] = new MyRectangle1();
				rects[n].lu = new MyPoint1();
				rects[n].lu.x = in.nextInt();
				rects[n].lu.y = in.nextInt();
				rects[n].width = in.nextInt();
				rects[n].height = in.nextInt();
				n++;
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file!");
			System.exit(1);
		}
		
		bubbleSort();
		
		for(int i=0; i<n; i++)
			System.out.println(rects[i].lu.x + " " + rects[i].lu.y + " "
							 + rects[i].width + " " + rects[i].height);
	}

	private static void bubbleSort() { // Code04 ����.
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(calcArea(rects[j]) > calcArea(rects[j+1])) {
					MyRectangle1 tmp = rects[j];
					rects[j] = rects[j+1];
					rects[j+1] = tmp;
				}
			}
		}
	}
	
	public static int calcArea(MyRectangle1 r) {
		return r.width * r.height;
	}
}
