package chapter3_4;

import java.util.Arrays;
import java.util.Scanner;

public class Scheduler {
	private int capacity = 10;
	public Event [] events = new Event [capacity];
	public int n = 0;
	private Scanner kb;
	
	public void processCommand() {
		kb = new Scanner(System.in);
		while(true) {
			System.out.print("$ ");
			String command = kb.next();
			if(command.equals("addEvent")) {
				String type = kb.next();
				if(type.equalsIgnoreCase("oneday"))
					handleAddOneDayEvent();
				else if(type.equalsIgnoreCase("duration"))
					handleAddDurationEvent();
				else if(type.equalsIgnoreCase("deadline"))
					handleAddDeadlinedEvent();
			}
			else if(command.equals("list")) {
				handleList();
			}
			else if(command.equals("show")) {
				handleShow();
			}
			else if(command.equals("sort")) {
				Arrays.sort(events, 0, n);
			}
			else if(command.equals("exit"))
				break;
		}
		kb.close();
	}
	
	private void handleShow() {
		String dateString = kb.next();
		MyDate theDate = parseDateString(dateString);
		for(int i=0; i<n; i++) {
			// test if events[i] is relevant to the date,
			// -> then print it;
			if(events[i].isRelevant(theDate))
				System.out.println(events[i].toString());
		}
	}

	private void handleList() {
		for(int i=0; i<n; i++)
			System.out.println("  " + events[i].toString()); // dynamic binding	
	}

	private void handleAddDeadlinedEvent() {
		System.out.print("  deadline: ");
		String dateString = kb.next();
		System.out.print("  title: ");
		String title = kb.next();
		
		MyDate date = parseDateString(dateString);
		DeadlinedEvent ev = new DeadlinedEvent(title, date);
		addEvent(ev);
	}

	private void handleAddDurationEvent() {
		System.out.print("  begin: ");
		String beginString = kb.next();
		System.out.print("  end: ");
		String endString = kb.next();
		System.out.print("  title: ");
		String title = kb.next();
		
		MyDate begin = parseDateString(beginString);
		MyDate end = parseDateString(endString);
		
		DurationEvent ev = new DurationEvent(title, begin, end);
		addEvent(ev);
	}

	private void handleAddOneDayEvent() {
		System.out.print(" when: ");
		String dateString = kb.next(); // dateString = "2020/01/20"
		System.out.print(" title: ");
		String title = kb.next();
		
		MyDate date = parseDateString(dateString);
		OneDayEvent ev = new OneDayEvent(title, date);
//		System.out.println(ev.toString());
		addEvent(ev);
	}

	private void addEvent(Event ev) {
		if(n>= capacity)
			reallocate();
		events[n++] = ev;
	}

	private void reallocate() {
		Event [] tmp = new Event [capacity*2];
		for(int i=0; i<n; i++)
			tmp[i] = events[i];
		events = tmp;
		capacity *= 2;
	}

	private MyDate parseDateString(String dateString) { // dateString = "2020/01/20"
		String [] tokens = dateString.split("/");
		// tokens[0] = "2020";
		
		int year = Integer.parseInt(tokens[0]); // ���� <-> ���� ��ȯ.
		int month = Integer.parseInt(tokens[1]);
		int day = Integer.parseInt(tokens[2]);
		
		MyDate d = new MyDate(year, month, day);
		return d;
	}

	public static void main(String[] args) {
		Scheduler app = new Scheduler();
		app.processCommand();
// 		Event test = new Event("test");
		// Event�� �߻� Ŭ���� -> ��ü ����� �Ұ���.
	}
}
