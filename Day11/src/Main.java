
//데몬스레드
class Music extends Thread {

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("음악 연주 중");
		}
	}
}

public class Main {

	public static void main(String[] args) {

		Music m = new Music();

		m.setDaemon(true);// 무조건 스타트 되기 전에 설정
		m.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("신나게 게임중");
			if (i == 9) {
				System.out.println("게임 종료");
				break;
			}
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
