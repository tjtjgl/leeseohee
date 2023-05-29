package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyFrame extends JFrame implements Runnable {

	Dimension dimen; // 너비랑 높이를 저장하고 있는 클래스
	int x = 0, y = 0;
	

	public MyFrame() {
		setTitle("제목 없는 윈도우");

		setBounds(x, y, 400, 300);

		// 화면의 해상도를 얻어와 자동으로 Dimension 객체에 저장
		dimen = Toolkit.getDefaultToolkit().getScreenSize();

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void run() {
		boolean right = true; //오른쪽에서 왼쪽 왼쪽에서 오른쪽
						//false 위에서 아래 아래에서 위
		
		// 해상도 구하기
		while (true) {
			//========================================
			if (right) {
				if (x <= dimen.width - 400) {
					x += 10;

					try {Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					setLocation(x, y);
					
				} else if (y <= dimen.height - 300) {
					y += 10;

					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					setLocation(x, y);
					
				} else {
					right = false;
				}
			} 
			//========================================
			else if (!right) {
	
				if (x >= 0) {
					x -= 10;

					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					setLocation(x, y);
					
				} else if (y >= 0) {
					y -= 10;

					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					setLocation(x, y);
				} else if (x == 0 && y == 0) {
					right = false;
				}
			}
		} //while 무한반복
	}

}
