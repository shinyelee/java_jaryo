package chapter3_4;

//�߻� Ŭ���� : �̸��� �ְ� ���� ������ ���� Ŭ����.
public abstract class Event implements Comparable {
	public String title;
	
	public Event(String title) {
		this.title = title;
	}
	
	// �߻� �޼���.
	public abstract boolean isRelevant(MyDate date);
	public abstract MyDate getRepresentativeDate(MyDate date);
	
	public int compareTo(Object other) {
		MyDate mydate = getRepresentativeDate();
		MyDate yours = ((Event)other).getRepresentativeDate();
		return mine.compareTo(yours);
	}
}
