package method;

public class MethodEx_Test01 {

	public static int loop(int num) {
		int res = 0;
		for (int i = 1; i <= num; i++) {
			res += i;
		}
		return res;
	}

	public static void main(String[] args) {

		// 함수명 loop
		// 매개변수 10
		// 기능 1부터 매개변수의 값까지 더한 후 결과 return

		int num = 3;
		System.out.println(loop(num));
	}

}
