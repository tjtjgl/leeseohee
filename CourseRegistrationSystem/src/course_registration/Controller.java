package course_registration;

import java.io.File;

import java.util.ArrayList;
import java.util.Iterator;

public class Controller {
	private ArrayList<Student> stuList = new ArrayList<>();
	private ArrayList<Subject> subList = new ArrayList<>();
	private ArrayList<Student> allList = new ArrayList<>();
	private UserDAO ud = new UserDAO();
	private AllDAO ad = new AllDAO();

	// 회원가입 시 id 중복 체크
	public boolean idCheck(String id) {

		for (Student val : stuList) {
			if (val.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	// 회원가입 시 파일 생성
	void userMakeFile() throws Exception {
		// String path = "D:\\";
		String fName = "User.txt";

		File file = new File(fName);
		file.createNewFile();
	}

	// 수강 신청 현황
	void allMakeFile() throws Exception {
		// String path = "D:\\";
		String fName = "All.txt";

		File file = new File(fName);
		file.createNewFile();
	}

	// 수강과목 초기 리스트
	void initSubList() {
		subList.add(new Subject("자바", "2023-4-25"));
		subList.add(new Subject("파이썬", "2023-4-25"));
		subList.add(new Subject("리액트", "2023-4-30"));
	}

	void subListView() {
		for (Subject val : subList) {
			System.out.println(val);
		}
	}

	// 유저 읽어오기
	ArrayList<Student> fileRead() throws Exception {
		return ud.fileRead();
	}

//	 수강신청 목록 읽어오기
	Student allRead() throws Exception {
		return ad.studentRead();
	}

	/**
	 * 아래부터 학생 기능 메소드
	 */

	// 회원가입
	void join(Student s) throws Exception {
		stuList.add(s);
		userMakeFile();

		if (ud.fileSave(stuList) == 1) {
			System.out.println("회원가입이 완료되었습니다.");
		} else
			System.out.println("회원가입에 실패하였습니다.");
	}

	// 로그인
	Student login(Student s) throws Exception {

		// fileRead();

		for (Student val : stuList) {
			if (val.getId().equals(s.getId()) && val.getPw().equals(s.getPw())) {
				return val;
			}
		}
		return null;
	}

	// 수강신청 목록 조회
	int subView(Student s) throws Exception {
		if (s.getRegister().size() != 0) {
			System.out.println(s.getName() + "님의 수강신청 목록입니다.");
			for (Subject val : s.getRegister()) {
				System.out.println(val);
			}
			return 1;
		}
		return 0;
	}

	/**수강신청하기(15명 넘으면 안되는거 추가해야 함)*/
	Student subRegister(Student s, int id) throws Exception {

		for (Subject val : subList) {
			if (val.getId() == id && !(s.getRegister().contains(val))) {
				s.addRegister(val);
				val.setUse(false);
				ad.fileSave(s);
				return s;
			} else if (val.getId() == id && s.getRegister().contains(val)) {
				s.removeRegister(val);
				val.setUse(true);
//				allList.remove(s);
			}
		}
		return null;
	}

	/**
	 * 아래부터 관리자 기능 메소드
	 */

	Admin adminLogin(Admin a) {
		Admin admin = new Admin("관리자", "admin", "admin", "02-123-4567");

		if (a.getId().equals(admin.getId()) && a.getPw().equals(admin.getPw())) {
			return admin;
		}

		return null;
	}

	ArrayList<Subject> addMGMT(Subject sub) {
		for (Subject val : subList) {
			if (val.getSubName().equals(sub.getSubName())) {
				System.out.println("이미 등록된 과목입니다.");
				return subList;
			}
		}

		subList.add(sub);

		return subList;
	}

	ArrayList<Subject> removeMGMT(int id) {
		for (Subject val : subList) {
			if (val.getId() == id) {
				subList.remove(val);
				// new Student().removeRegister(val);
				System.out.println("삭제 완료");

				return subList;
			}
		}
		System.out.println("해당 과목은 존재하지 않습니다.");
		return subList;
	}

	void allView() throws Exception {
		if(allRead() != null) {
		System.out.println(allRead());
		} else System.out.println("현재 수강 신청 내역이 없습니다.");

	}
}
