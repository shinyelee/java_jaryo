package projectException;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {

	public static void main(String[] args) {
		// try with resource statements
		try (FileWriter f = new FileWriter("data.txt")){
			f.write("Hello");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
