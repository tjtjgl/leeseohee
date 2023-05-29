package course_registration;

import java.io.Serializable;
import java.util.Scanner;

public class Main{

	Scanner sc = new Scanner(System.in);
	Controller c = new Controller();

	void mainMenu() throws Exception {
		c.initSubList();

		while (true) {
			System.out.println("************�л� ���� ���α׷�************");
			System.out.println("1) �α���");
			System.out.println("2) ȸ������");
			System.out.println("3) ID/PW ã��");
			System.out.println("0) ���α׷� ����");
			System.out.print("�޴� ����> ");
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

	// �α���
	void login() throws Exception {

		sc.nextLine();

		System.out.println("\t========ȸ�� �α���========");
		System.out.print("\t���̵� : ");
		String id = sc.nextLine();
		System.out.print("\t�н����� : ");
		String pw = sc.nextLine();

		if (id.equals("admin")) {
			Admin a = new Admin(id, pw);
			if (c.adminLogin(a) != null) {
				System.out.println("\t������ �α��ο� �����Ͽ����ϴ�.");
				adminMenu(c.adminLogin(a));
			} else
				System.out.println("\t�α��ο� �����Ͽ����ϴ�. �ٽ� �õ��ϼ���.");

		} else {
			Student s = new Student();
			s.setId(id);
			s.setPw(pw);

			if (c.login(s) != null) {
				System.out.println("\t�α��ο� �����Ͽ����ϴ�.");
				stuMenu(c.login(s));
			} else
				System.out.println("\t�α��ο� �����Ͽ����ϴ�. �ٽ� �õ��ϼ���.");
		}
	}// �α��� ��

	// ȸ������
	void join() throws Exception {
		System.out.println("************�л� ���� ���α׷�************");
		System.out.println("\t========ȸ������========");

		boolean run = true;
		String id = null;
		sc.nextLine();
		while (run) {
			System.out.print("\t���̵� : ");
			id = sc.nextLine();

			if (c.idCheck(id)) {
				System.out.println("\t�̹� �����ϴ� ID �Դϴ�. �ٽ� �Է����ּ���");
			} else {
				System.out.println("\t���� ������ ID �Դϴ�.");
				run = false;
			}
		}

		System.out.print("\t�̸� : ");
		String name = sc.nextLine();
		System.out.print("\t�н����� : ");
		String pw = sc.nextLine();
		System.out.print("\t����ó : ");
		String phone = sc.nextLine();

		Student s = new Student(name, id, pw, phone);
		c.join(s);
	} // ȸ������ ��

	void stuMenu(Student s) throws Exception {
		while (true) {
			System.out.println("========�л� ����========");
			System.out.println(s.getName() + "�� �ݰ����ϴ�.");
			System.out.println("1) ���� ���� ��ȸ");
			System.out.println("2) ���� ��û/öȸ");
			System.out.println("0) �α׾ƿ�");
			System.out.println("�޴� ����> ");
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
			System.out.println(s.getName() + "���� ������û ������ �����ϴ�");
		}

	}

	void subRegister(Student s) throws Exception {
		c.subListView();

		System.out.println("��û/öȸ �� ������ ID�� �����ϼ���> ");
		int id = sc.nextInt();

		if (c.subRegister(s, id) != null) {
			System.out.println("�Ϸ�!");
		}

	}

	// =========================������

	void adminMenu(Admin a) throws Exception {
		while (true) {
			System.out.println("========������ �޴�========");
			System.out.println(a.getName() + "�� �ݰ����ϴ�.");
			System.out.println("1) ���� ���� ����");
			System.out.println("2) ��ü �л� ��ȸ");
			System.out.println("0) �α׾ƿ�");
			System.out.println("�޴� ����> ");
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

		System.out.println("1) �߰� / 2) ���� / 3) �ڷΰ���");
		int sel = sc.nextInt();

		if (sel == 1) {
			sc.nextLine();
			System.out.println("�߰� �� ���� �����> ");
			String subName = sc.nextLine();
			System.out.println("�߰� �� ���� �ð�ǥ> ");
			String date = sc.nextLine();

			sub = new Subject(subName, date);
			c.addMGMT(sub);
		} else if (sel == 2) {
			sc.nextLine();
			System.out.println("���� �� ���� ID> ");
			int id = sc.nextInt();

			c.removeMGMT(id);

		} else
			return;

	}

	void allView() throws Exception {
		c.allView();

	}

}
