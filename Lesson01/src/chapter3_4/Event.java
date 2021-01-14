package chapter3_4;

//추상 클래스 : 이름만 있고 실제 내용이 없는 클래스.
public abstract class Event implements Comparable {
	public String title;
	
	public Event(String title) {
		this.title = title;
	}
	
	// 추상 메서드.
	public abstract boolean isRelevant(MyDate date);
	public abstract MyDate getRepresentativeDate(MyDate date);
	
	public int compareTo(Object other) {
		MyDate mydate = getRepresentativeDate();
		MyDate yours = ((Event)other).getRepresentativeDate();
		return mine.compareTo(yours);
	}
}
