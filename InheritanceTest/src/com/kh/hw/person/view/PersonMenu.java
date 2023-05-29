package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);

	PersonController pc = new PersonController();

	int x = pc.personCount()[0];
	int y = pc.personCount()[1];

	public void mainMenu() {

		boolean run = true;

		while (run) {

			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + x + "명 입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + y + "명 입니다.");
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호: ");

			int sel = sc.nextInt();

			switch (sel) {

			case 1:// 학생메뉴
				studentMenu();
				break;

			case 2: // 사원 메뉴
				employeeMenu();
				break;

			case 9:
				System.out.println("종료합니다.");
				run = false;
				break;

			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}

	public void studentMenu() {
		boolean run = true;

		if (x == 3) {
			System.out.println("학생을 담을 수 있는 공간이 초과되었습니다. 1번 메뉴는 비활성화됩니다.");
		}

		while (run) {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 뒤로가기");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:// 학생추가
				if (x == 3) {
					System.out.println("잘못 입력하였습니다.");
				} else
					insertStudent();
				break;
			case 2:// 학생 보기
				printStudent();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				run = false;
				break;
			}
		}
	}

	public void employeeMenu() {

		boolean run = true;

		if (y == 10) {
			System.out.println("사원을 담을 수 있는 공간이 초과되었습니다. 1번 메뉴는 비활성화됩니다.");
		}

		while (run) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 뒤로가기");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:// 사원추가
				if (y == 10) {
					System.out.println("잘못 입력하였습니다.");
				} else
					insertEmployee();
				break;
			case 2:// 사원보기
				printEmployee();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				run = false;
				break;
			}
		}

	}

	public void insertStudent() {
		boolean run = true;

		while (run) {
			System.out.println("학생 이름: ");
			String name = sc.next();
			System.out.println("학생 나이: ");
			int age = sc.nextInt();
			System.out.println("학생 키: ");
			double height = sc.nextDouble();
			System.out.println("학생 몸무게: ");
			double weight = sc.nextDouble();
			System.out.println("학생 학년: ");
			int grade = sc.nextInt();
			System.out.println("학생 전공: ");
			String major = sc.next();

			pc.insertStudent(name, age, height, weight, grade, major);

			System.out.println("입력 완료");

			System.out.println("그만하시려면 N(n), 계속하려면 아무 키나 눌러주세요 ");
			char cont = sc.next().charAt(0);

			if (cont == 'n' || cont == 'N') {
				run = false;
				break;
			} else {
				if (x == 3) {
					System.out.println("학생을 담을 수 있는 공간이 초과되었습니다.");
					run = false;
					break;
				}
			}
		}

	}

	public void printStudent() {
		pc.printStudent();
	}

	public void insertEmployee() {
		boolean run = true;

		while (run) {

			System.out.println("사원 이름: ");
			String name = sc.next();
			System.out.println("사원 나이: ");
			int age = sc.nextInt();
			System.out.println("사원 키: ");
			double height = sc.nextDouble();
			System.out.println("사원 몸무게: ");
			double weight = sc.nextDouble();
			System.out.println("사원 급여: ");
			int salary = sc.nextInt();
			System.out.println("사원 부서: ");
			String dept = sc.next();

			pc.insertEmployee(name, age, height, weight, salary, dept);

			System.out.println("그만하시려면 N(n), 계속하려면 아무 키나 눌러주세요 ");
			char cont = sc.next().charAt(0);

			if (cont == 'n' || cont == 'N') {
				run = false;
				break;
			} else {
				if (y == 10) {
					System.out.println("사원을 담을 수 있는 공간이 초과되었습니다.");
					run = false;
					break;
				}
			}
		}
	}

	public void printEmployee() {
		pc.printEmployee();
	}

}
