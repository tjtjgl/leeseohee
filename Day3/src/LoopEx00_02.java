
public class LoopEx00_02 {

	public static void main(String[] args) {

		for (int i = 1; i < 11; i++) {
			if (i > 6 || i < 3) {
				System.out.println(i);
			}
		}

		int total1 = 0;
		int total2 = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				total1 += i;

			} else {
				total2 += i;
			}
		}
		System.out.println("짝수: " + total1);
		System.out.println("홀수: " + total2);

	}
}
