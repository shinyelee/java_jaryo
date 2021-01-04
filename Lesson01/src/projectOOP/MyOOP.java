package projectOOP;

public class MyOOP {
	
	public static void main(String[] args) {
		delimiter = "---";
		printA();
		printB();
		
		delimiter = "***";
		printA();
		printB();
	}

	public static String delimiter = "";
	
	public static void printA() {
		System.out.print(delimiter);
		System.out.print("A");
		System.out.println("A");
	}
	
	public static void printB() {
		System.out.print(delimiter);
		System.out.print("B");
		System.out.println("B");
	}

}
