package chapter2_2;

public class Polynomial2 {

	// 객체지향 프로그래밍에서 객체란 "데이터"+"메서드"다.
	// 데이터는 객체의 정적 속성을 표현하며, 메서드는 객체의 동적 속성을 표현한다.
	
	// 자전거는 "모양, 무게, 크기, 브랜드" 등의 정적 속성(데이터)과
	// "달린다, 정지한다, 뒤로 간다" 등의 동적 속성(기능)을 가진다.
	// -> 하나의 항(term)은 "계수"와 "차수"라는 정적 속성과
	// "x의 값을 주면 자신의 값을 계산해준다", "화면에 출력해준다" 등의 기능을 가진다.
	
	public char name;
	public Term2 [] terms;
	public int nTerms = 0; // 객체의 정적 속성(데이터)
	
	public void addTerm(int c, int e) { // 객체의 동적 속성(기능)
		int index = findTerm(e);
		if(index != -1) {
			terms[index].coef += c;
		}
		else {
			int i = nTerms-1;
			while(i>=0 && terms[i].expo<e) {
				terms[i+1] = terms[i];
				i--;
			}
			terms[i+1] = new Term2();
			terms[i+1].coef = c;
			terms[i+1].expo = e;
			nTerms++;
		}
	}
	
	public int findTerm(int e) {
		for(int i=0; i<nTerms && terms[i].expo>=e; i++)
			if(terms[i].expo == e)
				return i;
		return -1;
	}
	
	public int calcPolynomial(int x) {
		int result = 0;
		for(int i=0; i<nTerms; i++)
			result += terms[i].calcTerm(x);
		return result;
	}
	
	public void printPolynomial() {
		for(int i=0; i<nTerms; i++) {
			terms[i].printTerm();
		System.out.print("+");
		}
		System.out.println();
	}
}
