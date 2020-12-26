package Chapter2_Section1;

public class Term { // 다항식을 구성하는 하나의 항을 표현하기 위한 클래스.

	public int coef; // 계수.
	public int expo; // 차수.

}

// 다항함수(polynomial)는 항(term)들의 합이며,
// 항(term)은 계수(coefficient)와 지수(exponent)에 의해 정의된다.
// 계수는 0이 아닌 정수이고 지수는 음이 아닌 정수라고 가정한다.
// 예) f(x) = -x⁴+2x³-10x-3