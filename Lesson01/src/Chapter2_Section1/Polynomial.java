package Chapter2_Section1;

public class Polynomial { // �ϳ��� ���׽��� ǥ���ϱ� ���� Ŭ����.

	public char name; // ���׽��� �̸�.
	public Term [] terms; // ���׽��� �����ϴ� ���� ����.
	public int nTerms = 0; // ���׽��� �����ϴ� �׵��� ������ �迭.
}

// ���α׷� ���� ��
// $ create f	// �����Լ� f= 0�� �����Ѵ�.
// $ add f 2 3	// f(x) = 2x��
// $ add f -1 1	// f(x) = 2x��-x
// $ add f 5 0	// f(x) = 2x��-x+5
// $ add f 2 1	// f(x) = 2x��-x+5+2x
// $ calc f 2	// f(2)�� �� ���� ����� ���.
// 23			// f(2) = 23
// $ print f	// ���� ������������ ������ ���.
// 2x^3+x+5		// -x+2x�� +x�� �˾Ƽ� �����.
// $ exit		// ����.