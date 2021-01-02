package chapter2_3;

import java.util.Scanner;

public class Code11 { // �Ϻ� public -> private�� ����.

	private Polynomial3 [] polys = new Polynomial3 [100];
	private int n = 0;
	
	public void processCommand() {
		
		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.print("$ ");
			String command = kb.next();
			if(command.equals("create")) {
				char name = kb.next().charAt(0);
				polys[n] = new Polynomial3(name);
				n++;
			}
			else if(command.equals("add")) {
				char name = kb.next().charAt(0);
				int index = find(name);
				if(index == -1) {
					System.out.println("No such polynomial exists.");
				}
				else {
					int c = kb.nextInt();
					int e = kb.nextInt();
					polys[index].addTerm(c, e);
				}
			}
			else if(command.equals("calc")) {
				char name = kb.next().charAt(0);
				int index = find(name);
				if(index == -1) {
					System.out.println("No such polynomial exists.");
				}
				else {
					int x = kb.nextInt();
					int result = polys[index].calcPolynomial(x);
					System.out.println(result);
				}
			}
			else if(command.equals("print")) {
				char name = kb.next().charAt(0);
				int index = find(name);
				if(index == -1) {
					System.out.println("No such polynomial exists.");
				}
				else {
					polys[index].printPolynomial();
				}
			}
			else if(command.equals("exit"))
				break;
		}
		kb.close();
		
	}

	private int find(char name) {
		for(int i=0; i<n; i++)
			if (polys[i].getName() == name)
				return i;
		return -1;
	}

	public static void main(String[] args) {
		Code11 app = new Code11();
		app.processCommand();
	}
}
