package chapter3_4;

public abstract class Event {
	public String title;
	
	public Event(String title) {
		this.title = title;
	}
	
	// �߻� Ŭ���� : �̸��� �ְ� ���� ������ ���� Ŭ����.
	public abstract boolean isRelevant(MyDate date);
}
