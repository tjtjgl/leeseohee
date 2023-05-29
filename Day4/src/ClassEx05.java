import java.util.ArrayList;

class Account {

	// 정보
	String id, pw;

	// 기본 생성자
	public Account() {
	}

	// 생성자
	public Account(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

}

class Naver {

	// 고객들의 정보를 저장하는 배열이므로 자료형은 Account
	ArrayList<Account> acclist = new ArrayList<>();

}

public class ClassEx05 {

	public static void main(String[] args) {

		// 네이버 회사 생성
		Naver naver = new Naver();

		// ex.네이버에 회원가입
		Account acc1 = new Account("sh", "1234");
		Account acc2 = new Account("gw", "5678");

		// acc1을 네이버의 고객정보 변수에 저장
		naver.acclist.add(acc1);
		naver.acclist.add(acc2);

		System.out.println(naver.acclist.get(0).id);
		System.out.println(naver.acclist.get(0).pw);
		
		System.out.println(naver.acclist);

	}

}
