import java.util.Scanner;

public class LoopEx01_05_02 {

	public static void main(String[] args) {
		// 정수를 무한적으로 입력 받다가 -100을 입력하면 프로그램 종료!

		Scanner sc = new Scanner(System.in);
		 
		while (true) { // 무한 반복, =for(;;)
			int num = sc.nextInt();
			System.out.println(num);
			if(num == -100) 
				break;
		}
		
		/*또는 do 문으로 
		 * 
		 * do {
		 * int my_x = nextInt(); 
		 * } * while ....
		 *
		*/
		
		/* 내 답
		 * 
		 * int x = -100;
		 * 
		 * int my_x = 0; 
		 * 
		 * while (my_x != x) { System.out.println("숫자 입력> "); my_x = sc.nextInt();
		 * System.out.println("입력한 숫자: " + my_x); }
		 */
	}

}
