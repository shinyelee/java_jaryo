package projectOOP;

class Print {
	
	public static String delimiter = "";
	
	public static void A() {
		System.out.print(delimiter);
		System.out.print("A");
		System.out.println("A");
	}
	
	public static void B() {
		System.out.print(delimiter);
		System.out.print("B");
		System.out.println("B");
	}
}

public class MyOOP {
	
	public static void main(String[] args) {
		Print.delimiter = "---";
		Print.A();
		Print.B();
		
		Print.delimiter = "***";
		Print.A();
		Print.B();
	}

}
