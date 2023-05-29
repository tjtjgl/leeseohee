package swing_layout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyGrid extends JFrame implements ActionListener {

	public MyGrid() {

		setTitle("서희의 GUI");
		setSize(600, 400);
		setLocation(100, 100);

		// GridLayout
		// 격자 형태, 바둑반, 엑셀처럼 행과 열로 이루어져 정렬하는 레이아웃
		// 모든 컴포넌트들이 동일한 크기를 가지고 프레임에 배치
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 4, 5,5)); //행,열,좌 여백, 우 여백 지정
		
		ArrayList<JButton> btns = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			String x = String.valueOf(i + 1);
			btns.get(i).addActionListener(this);
			btns.add(new JButton(x)); 
		}

		// 화면 배치
		int size = btns.size();
		for (int i = 0; i < size; i++) {
			panel.add(btns.get(i));
		}

		add(panel);

		setVisible(true);
		
		// X 눌렀을 때 메인프레임과 자바프로그램 자체를 종료하려면
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		System.out.println(btn.getText());
	}
}

public class GridLayoutMain {

	public static void main(String[] args) {
		new MyGrid();
	}
}
