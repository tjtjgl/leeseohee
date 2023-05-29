package InnerClass;

class Outer { // 외부 클래스
	private static int num = 0;

	static class Nested1 { // 내부클래스1
		void add(int n) {
			num += n;
			System.out.println(num);
		}
	}

	static class Nested2 { // 내부클래스2
		int get() { return num; }
	}

}

public class Static_Inner2 {

	public static void main(String[] args) {

		Outer.Nested1 obj1 = new Outer.Nested1();
		obj1.add(80);

		Outer.Nested2 obj2 = new Outer.Nested2();
		System.out.println(obj2.get());

	}

}
