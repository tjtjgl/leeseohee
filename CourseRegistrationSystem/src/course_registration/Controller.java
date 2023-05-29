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

	// ȸ������ �� id �ߺ� üũ
	public boolean idCheck(String id) {

		for (Student val : stuList) {
			if (val.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	// ȸ������ �� ���� ����
	void userMakeFile() throws Exception {
		// String path = "D:\\";
		String fName = "User.txt";

		File file = new File(fName);
		file.createNewFile();
	}

	// ���� ��û ��Ȳ
	void allMakeFile() throws Exception {
		// String path = "D:\\";
		String fName = "All.txt";

		File file = new File(fName);
		file.createNewFile();
	}

	// �������� �ʱ� ����Ʈ
	void initSubList() {
		subList.add(new Subject("�ڹ�", "2023-4-25"));
		subList.add(new Subject("���̽�", "2023-4-25"));
		subList.add(new Subject("����Ʈ", "2023-4-30"));
	}

	void subListView() {
		for (Subject val : subList) {
			System.out.println(val);
		}
	}

	// ���� �о����
	ArrayList<Student> fileRead() throws Exception {
		return ud.fileRead();
	}

//	 ������û ��� �о����
	Student allRead() throws Exception {
		return ad.studentRead();
	}

	/**
	 * �Ʒ����� �л� ��� �޼ҵ�
	 */

	// ȸ������
	void join(Student s) throws Exception {
		stuList.add(s);
		userMakeFile();

		if (ud.fileSave(stuList) == 1) {
			System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		} else
			System.out.println("ȸ�����Կ� �����Ͽ����ϴ�.");
	}

	// �α���
	Student login(Student s) throws Exception {

		// fileRead();

		for (Student val : stuList) {
			if (val.getId().equals(s.getId()) && val.getPw().equals(s.getPw())) {
				return val;
			}
		}
		return null;
	}

	// ������û ��� ��ȸ
	int subView(Student s) throws Exception {
		if (s.getRegister().size() != 0) {
			System.out.println(s.getName() + "���� ������û ����Դϴ�.");
			for (Subject val : s.getRegister()) {
				System.out.println(val);
			}
			return 1;
		}
		return 0;
	}

	/**������û�ϱ�(15�� ������ �ȵǴ°� �߰��ؾ� ��)*/
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
	 * �Ʒ����� ������ ��� �޼ҵ�
	 */

	Admin adminLogin(Admin a) {
		Admin admin = new Admin("������", "admin", "admin", "02-123-4567");

		if (a.getId().equals(admin.getId()) && a.getPw().equals(admin.getPw())) {
			return admin;
		}

		return null;
	}

	ArrayList<Subject> addMGMT(Subject sub) {
		for (Subject val : subList) {
			if (val.getSubName().equals(sub.getSubName())) {
				System.out.println("�̹� ��ϵ� �����Դϴ�.");
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
				System.out.println("���� �Ϸ�");

				return subList;
			}
		}
		System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
		return subList;
	}

	void allView() throws Exception {
		if(allRead() != null) {
		System.out.println(allRead());
		} else System.out.println("���� ���� ��û ������ �����ϴ�.");

	}
}
