package chapter3_4;

public abstract class Event {
	public String title;
	
	public Event(String title) {
		this.title = title;
	}
	
	// 추상 클래스 : 이름만 있고 실제 내용이 없는 클래스.
	public abstract boolean isRelevant(MyDate date);
}
