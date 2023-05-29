package swing_layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFlow extends JFrame {
	// 전역 변수로 선언
	JButton btn1 = new JButton("1번버튼");
	JButton btn2 = new JButton("2번버튼");
	JButton btn3 = new JButton("3번버튼");
	JButton btn4 = new JButton("4번버튼");

	// JFram은 하나의 버튼만 올라갈 수 있기 때문에
	// JPanel로 여러가지 버튼,게시물,스크롤 등을 구현(보조프레임)
	JPanel panel = new JPanel();

	MyFlow() { // 생성자 안에 버튼 만들면 사용할 수 없게 됨

		setTitle("서희의 GUI");
		setSize(600, 400);
		setLocation(100, 100);

		// 왼쪽에서 오른쪽으로 한줄에 차례대로 정렬하는 레이아웃
		// 왼쪽에서 실행할건지 오른쪽에서 실행할건지 결정
		panel.setLayout(new java.awt.FlowLayout());
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);

		add(panel);

		setVisible(true);
	}
}

public class FlowLayout {

	public static void main(String[] args) {

		new MyFlow();
	}
}
