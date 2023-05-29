import javax.swing.JOptionPane;

class Time {
	
	int i;
	
	void run() {
		for(i = 0; i < 10; i++) {
			// 프로그램을 지연시키는 함수
			try {Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + "초");
		}
	}
}

public class ThreadMain {

	public static void main(String[] args) {
		
		Time t1 = new Time();
		t1.run();
		
		String msg = JOptionPane.showInputDialog("입력: ");
		System.out.println(msg);
		

	}

}
