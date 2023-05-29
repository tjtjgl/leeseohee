package method_class;

class Calc {

}

public class OverroadingEx {

	// 더하는 기능
	public static void add(int a, int b) {
		System.out.println("정수 합: " + (a + b));
	}

	public static void add(double a, double b) {
		System.out.println("실수 합: " + (a + b));
	}

	public static void add(double a, int b) {
		System.out.println("실수와 정수의 합: " + (a + b));
	}

	public static void main(String[] args) {

		add(1, 1);
		add(1.1, 2.1);
		add(1.6, 7);

	}

}
