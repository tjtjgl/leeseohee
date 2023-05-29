package event_package;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CalcMain extends JFrame implements ActionListener {

	JPanel inputPan = new JPanel();
	JPanel calcPan = new JPanel();
	JPanel resPan = new JPanel();

	JTextField text1 = new JTextField(10);
	JTextField text2 = new JTextField(10);
	JTextArea area1 = new JTextArea(3, 20);

	JButton btn1 = new JButton("  더하기  ");
	JButton btn2 = new JButton("     빼기     ");

	CalcMain() {

		setTitle("서희의 계산기");
		setBounds(100, 100, 500, 400);

		setLayout(new GridLayout(3, 0));

		// ======================숫자입력 판넬
		text1.addActionListener(this);
		text2.addActionListener(this);
		inputPan.add(text1);
		inputPan.add(text2);

		// ======================계산기 버튼 판넬
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		calcPan.add(btn1);
		calcPan.add(btn2);

		// ======================결과화면 판넬
		area1.setText("결과값이 출력됩니다.");
		area1.setEditable(false);
		resPan.add(area1);

		add(inputPan);
		add(calcPan);
		add(resPan);

		setVisible(true);

		// X 눌렀을 때 메인프레임과 자바프로그램 자체를 종료하려면
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		String s1 = text1.getText();
		int x = Integer.parseInt(s1);

		String s2 = text2.getText();
		int y = Integer.parseInt(s2);

		int result = 0;

		if (!text1.getText().isEmpty() && !text2.getText().isEmpty()) {
			if (obj == btn1) {
				result = x + y;
				area1.setText(x + " + " + y + " = " + result);
			} else if (obj == btn2) {
				result = x - y;
				area1.setText(x + " - " + y + " = " + result);
			}
		} else if (text1.getText().isEmpty() || text1.getText().isEmpty()) {
			area1.setText("값을 입력하세요");
		}
	}

	public static void main(String[] args) {
		new CalcMain();
	}
}
