package event_package;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DialogMain extends JFrame implements ActionListener {

	JPanel panel = new JPanel();

	JButton btn1 = new JButton("에러");
	JButton btn2 = new JButton("정보");
	JButton btn3 = new JButton("경고");
	JButton btn4 = new JButton("질문");

	DialogMain() {

		setTitle("창 만들어보기");
		setBounds(100, 100, 500, 400);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);

		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);

		add(panel);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 어떤 버튼이 눌렸는지 확인하는 함수 e.getSouce();
		Object obj = e.getSource();
		// System.out.println(obj);
		// System.out.println(btn1);
		if (obj == btn1) { // 객체의 주소값 끼리 비교
			// 팝업창 JOptionPane 클래스 static으로 선언되어 있음
			JOptionPane.showMessageDialog(this, "에러가 발생했습니다!!", "에러 발생", JOptionPane.ERROR_MESSAGE);
			btn1.setBackground(Color.RED);
		} else if (obj == btn2) {
			JOptionPane.showMessageDialog(this, "정보창입니다.", "정보창", JOptionPane.INFORMATION_MESSAGE);
			btn2.setBackground(Color.CYAN);
		} else if (obj == btn3) {
			JOptionPane.showMessageDialog(this, "경고가 발생했습니다!!", "경고 발생", JOptionPane.WARNING_MESSAGE);
			btn3.setBackground(Color.LIGHT_GRAY);
		} else {
			JOptionPane.showMessageDialog(this, "질문이 무엇입니까", "질문창", JOptionPane.QUESTION_MESSAGE);
			btn4.setBackground(Color.pink);
		}
	}

	public static void main(String[] args) {
		new DialogMain();

	}

}
