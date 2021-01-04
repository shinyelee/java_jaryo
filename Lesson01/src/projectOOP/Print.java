package projectOOP;

class Print { // Print 클래스 파일로 따로 분리함.

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
