package music;

import java.util.Scanner;

public class MusicView {

	Scanner sc = new Scanner(System.in);

	MusicController mc = new MusicController();

	public void mainMenu() {

		while (true) {
			System.out.println("******메인 메뉴******");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오른차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");

			System.out.println("메뉴번호 선택> ");
			int sel = sc.nextInt();
			sc.nextLine();

			switch (sel) {
			case 1:
				this.addList();
				break;
			case 2:
				this.addAtZero();
				break;
			case 3:
				this.printAll();
				break;
			case 4:
				this.searchMusic();
				break;
			case 5:
				this.removeMusic();
				break;
			case 6:
				this.setMusic();
				break;
			case 7:
				ascTitle();
				break;
			case 8:
				descSinger();
				break;
			case 9:
				System.out.println("종료");
				return;

			}
		}
	}// mainMenu 끝

	public void addList() {

		System.out.println("추가할 가수명을 입력하세요> ");
		String singer = sc.nextLine();
		System.out.println("추가할 곡명을 입력하세요> ");
		String title = sc.nextLine();

		Music m = new Music(title, singer);

		if (mc.addList(m) == 1) {
			System.out.println("추가 완료");
		} else {
			System.out.println("추가 실패");
		}
	}

	public void addAtZero() {
		System.out.println("추가할 가수명을 입력하세요> ");
		String singer = sc.next();
		System.out.println("추가할 곡명을 입력하세요> ");
		String title = sc.next();

		Music m = new Music(title, singer);

		if (mc.addAtZero(m) == 1) {
			System.out.println("추가 완료");
		} else {
			System.out.println("추가 실패");
		}
	}

	public void printAll() {
		mc.printAll();
	}

	public void searchMusic() {
		System.out.println("검색할 곡명을 입력하세요> ");
		String title = sc.next();

		Music m = mc.searchMusic(title);

		if (m != null) {
			System.out.println(m);
			System.out.println("검새한 곡명 \"" + m.getTitle() + "\"의 가수는" + m.getSinger() + " 입니다.");
		} else {
			System.out.println("검색하신 곡이 존재하지 않습니다.");
		}

	}

	public void removeMusic() {
		System.out.println("삭제할 곡명을 입력하세요> ");
		String title = sc.next();

		Music m = mc.removeMusic(title);

		if (m != null) {
			System.out.println(m.getSinger() + "의 " + m.getTitle() + "을(를) 삭제하였습니다.");
		} else {
			System.out.println("검색하신 곡이 존재하지 않습니다.");
		}
	}

	public void setMusic() {
		System.out.println("수정할 곡명을 입력하세요> ");
		String settitle = sc.next();

		System.out.println("수정할 가수명을 입력하세요> ");
		String singer = sc.next();
		System.out.println("수정할 곡명을 입력하세요> ");
		String title = sc.next();

		Music m = new Music(title, singer);

		m = mc.setMusic(settitle, m);

		if (m != null) {
			System.out.println(settitle + " 곡을 " + m.getSinger() + "의 " + m.getTitle() + "로 수정하였습니다.");
		} else {
			System.out.println("수정하실 곡이 존재하지 않습니다.");
		}
	}

	public void ascTitle() {
		mc.ascTitle();

	}

	public void descSinger() {
		mc.descSinger();
	}

}
