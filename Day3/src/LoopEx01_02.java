
public class LoopEx01_02 {

	public static void main(String[] args) {

		int num = 1;
		char alp = 'A';
		int x = 3;
		int y = 1;
		

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(num++);
			}
			x -= 1;
			for (int j = 0; j < y ; j++) {
				if (y == 4)
					break;
				System.out.print(alp++);
			}
			y += 1;
			System.out.println();
		}
	}

}
