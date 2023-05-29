package method;

public class 엘레베이터 {
	// 올라가는 기능
	// 내려가는 기능
	// 누구나 타니까 static

	// 층수는 엘레베이터가 알고 있어야 하니까 엘베가 해당 객체를 갖는다
	static int 현재층 = 1;

	public static void 올라가요(Boolean 버튼, int 가고싶은층) {

		while (가고싶은층 >= 현재층) {
			System.out.println("현재 " + 현재층 + "층 입니다.");
			현재층++;
		}
		현재층 = 가고싶은층;
		System.out.println("도착했습니다.");
	}

	public static void 내려가요(Boolean 버튼, int 가고싶은층) {

		while (가고싶은층 <= 현재층) {
			System.out.println("현재 " + 현재층 + "층 입니다.");
			현재층--;
		}
		현재층 = 가고싶은층;
		System.out.println("도착했습니다.");
	}

	public static void main(String[] args) {

		// 나는 1층에 있고 4층으로 올라가고 싶다

		int 엘레베이터;
		int 가고싶은층;

		// 엘레베이터 이용
		new 엘레베이터();

		올라가요(true, 12);
		내려가요(true, 1);
		올라가요(true, 15);
	}
}
