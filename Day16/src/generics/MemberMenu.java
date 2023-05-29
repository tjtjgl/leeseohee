package generics;

import java.util.Scanner;
import java.util.TreeMap;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	void mainMenu() {
		mc.initAdd();
		while (true) {
			System.out.println("======KH 사이트======");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.println("메뉴 번호 선택 > ");
			int sel = sc.nextInt();

			switch (sel) {

			case 1:
				joinMembership();
				break;
			case 2:
				login();
				break;
			case 3:
				sameName();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			}
		}
	}

	void memberMenu() {

		while (true) {
			System.out.println("======회원 메뉴======");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.println("메뉴 번호 선택 > ");
			int sel = sc.nextInt();

			switch (sel) {

			case 1:
				changePassword();
				break;
			case 2:
				changeName();
				break;
			case 3:
				System.out.println("로그아웃 합니다.");
				return;

			}
		}
	}

	void joinMembership() {
		sc.nextLine(); // 메인 메뉴에서 nextInt로 인해 엔터가 버퍼에 저장되어 있음, 없애줘야 함
		System.out.println("ID와 PW를 입력하세요> *띄어쓰기로 구분하여 입력* ");
		String[] str = sc.nextLine().split(" ");

		Member m = new Member(str);
		boolean res = mc.joinMembership(str[0], m);

		if (res) {
			System.out.println("가입 완료");
		} else
			System.out.println("입력이 되지 않았습니다.");
	}

	void login() {
		
		
		sc.nextLine();
		System.out.println("ID와 PW를 입력하세요> *띄어쓰기로 구분하여 입력* ");
		String[] str = sc.nextLine().split(" ");

		Member m = new Member(str);
		if (mc.login(str[0], str[1])) {
			System.out.println("로그인 성공! "+str[0]+"님 환영합니다.");
			memberMenu();
		} else
			System.out.println("id/pw가 존재하지 않습니다.");

	}

	void changePassword() {
		boolean run = true;
		
		

		while (run) {
			sc.nextLine();
			System.out.println("ID와 PW를 입력하세요> *띄어쓰기로 구분하여 입력* ");
			String[] str = sc.nextLine().split(" ");
			System.out.println("바꿀 패스워드를 입력하세요> ");
			String newPw = sc.nextLine();

			if (mc.changePassword(str[0], str[1], newPw)) {
				System.out.println("변경 완료!");
				run = false;
			} else System.out.println("변경 실패! 재입력 > ");
		}
	}

	void changeName() {
		boolean run = true;

		while (run) {
			sc.nextLine();
			System.out.println("ID를 입력하세요> ");
			String id = sc.nextLine();
			System.out.println("변경할 이름을 입력하세요> ");
			String NewName = sc.nextLine();
			if (mc.changeName(id, NewName)) {
				System.out.println("변경 완료!");
				run = false;
			} else System.out.println("변경 실패! 재입력 > ");
		}
	}

	void sameName() {
		sc.nextLine();
		System.out.println("검색할 이름을 입력하세요> ");
		String name = sc.nextLine();
		mc.sameName(name);
	}
	
}
