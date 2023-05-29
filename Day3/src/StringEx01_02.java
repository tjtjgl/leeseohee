import java.util.Scanner;

public class StringEx01_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("사용하실 이메일을 입력하세요> ");
		String email = sc.next();

		String[] IDs = email.split("@");
		String[] domains = email.split("\\.");

		int len = IDs[0].length();

		if (len >= 9) {
			System.out.println("ID는 가입이 가능합니다.");
			String domain = domains[1];

			if (domain.compareTo("com") == 0 || domain.compareTo("net") == 0) {
				System.out.println("가입이 가능합니다.");
			} else {
				System.out.println("해당 도메인은 가입이 불가능합니다.");
			}

		} else {
			System.out.println("가입이 불가능합니다.");
		}

	}
}
