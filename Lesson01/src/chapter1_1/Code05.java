package chapter1_1;

public class Code05 {
	
	public static void main(String[] args) {
		
		// ?�기 5?? ?????? 배�??.
		int [] grades;		 // 배�?? ????(declare the array)
		grades = new int[5]; // 배�?? ????(allocate memory for 5 indices)
		
		// ?�기 100?? ?��???? 배�??.
		double [] array;
		array = new double[100];
		
		// ?�기 20?? 문�???? 배�??.
		char [] word;
		word = new char[20];
		
		// ????�??? ??기�?��?? ??.
//		int [] grades = new int [5];
//		double [] array = new double [100];
//		char [] word = new char [20];
		
		// 배�?��?? �?칸�?? ?��?��?? ????(assign some values to the array)
		grades[0] = 100; // 배�?��?? ?��?��?��?? 1?? ???? 0�??? ????????.
		grades[1] = 76;
		grades[2] = 92;
		grades[3] = 95;
		grades[4] = 14;
		
		// �? �???(print out each value)
		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		System.out.println(grades[3]);
		System.out.println(grades[4]);
	}

}
