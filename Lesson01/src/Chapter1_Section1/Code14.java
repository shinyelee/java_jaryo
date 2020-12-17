import java.util.Scanner;

public class Code14 { // Code13은 pass.

	public static void main(String[] args) {
		
		// 버블정렬(bubble sort) 알고리즘
		
		System.out.println("입력하고 싶은 숫자는 총 몇 개인가요?");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println("정수 " + n + "개를 무작위로 입력하세요.");
		int [] data = new int[n];
		
		for(int i=0; i<n; i++)
			data[i] = kb.nextInt();
		kb.close();
		
		// 여기부터 버블 정렬
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(data[j]>data[j+1]) {
					int tmp = data[j];
					data[j] = data[j+1];
					data[j+1] = tmp;
				}
			}
		}
		
		System.out.println("Sorted data: ");
		for(int i=0; i<n; i++)
			System.out.println(data[i]);
		
	}

}
