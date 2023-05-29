
class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			// 프로그램을 지연시키는 함수
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + "초");
		}
	}
}

public class ThreadMulti {

	public static void main(String[] args) {
		
		Monster m1 = new Monster("오크", 2000);
		Monster m2 = new Monster("오크전사", 5000);
		
		m1.start();
		m2.start();		
		
		System.out.println("메인 스레드 끝");
	}
}

//		Thread m1 = new MyThread();
//		Car c1 = new Car("소나타", 1000);
//		Car c2 = new Car("그랜저", 3000);

//		//스레드 시작점
//		m1.start(); 
//		c1.start();
//		c2.start();
//		String msg = JOptionPane.showInputDialog("입력: ");
//		System.out.println(msg);