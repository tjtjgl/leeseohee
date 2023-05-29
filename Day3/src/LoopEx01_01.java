
public class LoopEx01_01 {

	public static void main(String[] args) {

		int z = 9;
		int q = 1;
	
		for (int i = 0; i < 6; i++) {
			for (int x=0; x< q ; x++) {
			System.out.print("*");
			}
			for (int y = 0; y < z; y++) {
				System.out.print(" ");
			}
			
			for (int t=0; t< q ; t++) {
				if (i == 5 ) {
				q=5;
				System.out.print("*");
				} else 
				System.out.print("*");
				}
			z -= 2;
			q += 1;
			System.out.println();
		}

	}

}
