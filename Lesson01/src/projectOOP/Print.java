package projectOOP;

class Print { // Print Ŭ���� ���Ϸ� ���� �и���.

	public static String delimiter = "";
	
	public Print(String delimiter) {
		this.delimiter = delimiter;
	}
	
	public void A() {
		System.out.print(this.delimiter);
		System.out.print("A");
		System.out.println("A");
	}
	
	public void B() {
		System.out.print(this.delimiter);
		System.out.print("B");
		System.out.println("B");
	}

}
