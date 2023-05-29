import java.util.Scanner;

public class LoopEx00_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("월 입력> ");
		int month = sc.nextInt();
		
		String season = "";
		
		//switch문,****jdk 12버전 부터는 , 사용 가능****
		switch (month) {
		case 3,4,5 : season = "봄";	//12버전 이상
		break;
		
		case 6 : case 7 : case 8 : season = "여름";	//11버전 이하
		break;
		
		case 9 : case 10 : case 11 : season = "가울";
		break;
		
		case 12 : case 1 : case 2 : season = "겨울";
		break;
		
		case 99 : season = "종료";
		break;
		
		default : season = "잘못 입력";
		break;
		}
		
		System.out.println(season);
		
		
		//14버전 부터는 어렵게 변해서 필기 안함, 그치만 14버전용 switch문이 있다는 건 알고 넘어가기

/*
		for (;;) {
			if (month >= 3 && month <= 5) {
				System.out.println("봄");
				break;
			} else if (month >= 6 && month <= 8) {
				System.out.println("여름");
				break;
			} else if (month >= 9 && month <= 11) {
				System.out.println("가을");
				break;
			} else if (month == 12 || month <= 2 && month > 0) {
				System.out.println("겨울");
				break;
			} else if (month == 99) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못 입력하였습니다.");
				break;
			}
		}
*/

	}
}
