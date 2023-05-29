
public class LoopEx01 {

	public static void main(String[] args) {

		// 1~10 반복, 5~9 출력
		int x = 1;

		while (x <= 10) {
		//	System.out.println(x);
			x++;
			if (x >= 5 && x < 10) {
				System.out.print(x+"\t");
			}
		}

	}

}
