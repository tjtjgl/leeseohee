package swing_layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyBorder extends JFrame {

	JButton btn1 = new JButton("1번버튼");
	JButton btn2 = new JButton("2번버튼");
	JButton btn3 = new JButton("3번버튼");
	JButton btn4 = new JButton("4번버튼");
	JButton btn5 = new JButton("5번버튼");

	JPanel panel = new JPanel();

	public MyBorder() {

		setTitle("서희의 GUI");
		setSize(600, 400);
		setLocation(100, 100);
		
		//BorderLayout은 동서남북(상하좌우) 또는 중앙
		//기본적으로 JFrame 화면 배치는 가운데로 설정
		//각 영역 당 하나의 Component컴포넌트(버튼,스크롤,체크박스 등)
		panel.setLayout(new BorderLayout());

		// 화면 배치
		panel.setLayout(new BorderLayout());
		panel.add(btn1,BorderLayout.NORTH);
		panel.add(btn2,BorderLayout.WEST);
		panel.add(btn3,BorderLayout.EAST);
		panel.add(btn4,BorderLayout.SOUTH);
		panel.add(btn5,BorderLayout.CENTER);

		add(panel);

		setVisible(true);
	}

}

public class BorderLayoutMain {

	public static void main(String[] args) {
		new MyBorder();

	}

}
