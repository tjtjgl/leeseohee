import java.util.ArrayList;
import java.util.Scanner;

public class Array05_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 2;
		ArrayList<Integer> list = new ArrayList<>();
		int x = sc.nextInt();

		//while (true) {
			for (int i=2; i <10; i++) {
		
				if (num % i != 0) {
					list.add(num);
				}
				num += 1;
			}
			
		System.out.println(1);
		
	}

}
