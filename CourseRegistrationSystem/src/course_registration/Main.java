package course_registration;

import java.io.Serializable;
import java.util.Scanner;

public class Main{

	Scanner sc = new Scanner(System.in);
	Controller c = new Controller();

	void mainMenu() throws Exception {
		c.initSubList();

		while (true) {
			System.out.println("************학사 관리 프로그램************");
			System.out.println("1) 로그인");
			System.out.println("2) 회원가입");
			System.out.println("3) ID/PW 찾기");
			System.out.println("0) 프로그램 종료");
			System.out.print("메뉴 선택> ");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				login();
				break;
			case 2:
				join();
				break;
			case 3:

				break;

			case 0:
				return;
			}
		}
	}

	// 로그인
	void login() throws Exception {

		sc.nextLine();

		System.out.println("\t========회원 로그인========");
		System.out.print("\t아이디 : ");
		String id = sc.nextLine();
		System.out.print("\t패스워드 : ");
		String pw = sc.nextLine();

		if (id.equals("admin")) {
			Admin a = new Admin(id, pw);
			if (c.adminLogin(a) != null) {
				System.out.println("\t관리자 로그인에 성공하였습니다.");
				adminMenu(c.adminLogin(a));
			} else
				System.out.println("\t로그인에 실패하였습니다. 다시 시도하세요.");

		} else {
			Student s = new Student();
			s.setId(id);
			s.setPw(pw);

			if (c.login(s) != null) {
				System.out.println("\t로그인에 성공하였습니다.");
				stuMenu(c.login(s));
			} else
				System.out.println("\t로그인에 실패하였습니다. 다시 시도하세요.");
		}
	}// 로그인 끝

	// 회원가입
	void join() throws Exception {
		System.out.println("************학사 관리 프로그램************");
		System.out.println("\t========회원가입========");

		boolean run = true;
		String id = null;
		sc.nextLine();
		while (run) {
			System.out.print("\t아이디 : ");
			id = sc.nextLine();

			if (c.idCheck(id)) {
				System.out.println("\t이미 존재하는 ID 입니다. 다시 입력해주세요");
			} else {
				System.out.println("\t가입 가능한 ID 입니다.");
				run = false;
			}
		}

		System.out.print("\t이름 : ");
		String name = sc.nextLine();
		System.out.print("\t패스워드 : ");
		String pw = sc.nextLine();
		System.out.print("\t연락처 : ");
		String phone = sc.nextLine();

		Student s = new Student(name, id, pw, phone);
		c.join(s);
	} // 회원가입 끝

	void stuMenu(Student s) throws Exception {
		while (true) {
			System.out.println("========학사 관리========");
			System.out.println(s.getName() + "님 반갑습니다.");
			System.out.println("1) 수강 과목 조회");
			System.out.println("2) 수강 신청/철회");
			System.out.println("0) 로그아웃");
			System.out.println("메뉴 선택> ");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				subView(s);
				break;

			case 2:
				subRegister(s);
				break;

			case 0:
				return;

			}
		}
	}

	void subView(Student s) throws Exception {

		if (c.subView(s) == 0) {
			System.out.println(s.getName() + "님의 수강신청 내역이 없습니다");
		}

	}

	void subRegister(Student s) throws Exception {
		c.subListView();

		System.out.println("신청/철회 할 과목의 ID를 선택하세요> ");
		int id = sc.nextInt();

		if (c.subRegister(s, id) != null) {
			System.out.println("완료!");
		}

	}

	// =========================관리자

	void adminMenu(Admin a) throws Exception {
		while (true) {
			System.out.println("========관리자 메뉴========");
			System.out.println(a.getName() + "님 반갑습니다.");
			System.out.println("1) 수강 과목 관리");
			System.out.println("2) 전체 학생 조회");
			System.out.println("0) 로그아웃");
			System.out.println("메뉴 선택> ");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				subMGMT();

				break;

			case 2:
				allView();
				break;

			case 0:
				return;

			}
		}
	}

	void subMGMT() {
		c.subListView();

		Subject sub;

		System.out.println("1) 추가 / 2) 삭제 / 3) 뒤로가기");
		int sel = sc.nextInt();

		if (sel == 1) {
			sc.nextLine();
			System.out.println("추가 할 수강 과목명> ");
			String subName = sc.nextLine();
			System.out.println("추가 할 수강 시간표> ");
			String date = sc.nextLine();

			sub = new Subject(subName, date);
			c.addMGMT(sub);
		} else if (sel == 2) {
			sc.nextLine();
			System.out.println("삭제 할 수강 ID> ");
			int id = sc.nextInt();

			c.removeMGMT(id);

		} else
			return;

	}

	void allView() throws Exception {
		c.allView();

	}

}
