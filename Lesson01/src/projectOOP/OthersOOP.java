package projectOOP;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		
		System.out.println(Math.PI); // 3.14���޿�
		System.out.println(Math.floor(1.8)); // ����
		System.out.println(Math.ceil(1.8)); // �ø�
		
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello");
		f1.write(" Java");
		f1.close();
	}

}
