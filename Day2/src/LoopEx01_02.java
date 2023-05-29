
public class LoopEx01_02 {

	public static void main(String[] args) {
		
		// 1~10 거꾸로 반복, 6,5,4,3 출력
		
		int x = 10;

		while (x != 0) {
			// System.out.println(x);
			x--;
			if (x < 7 && x > 2) {
				System.out.print(x + "\t");
			}
		}
	}

}
