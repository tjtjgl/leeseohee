package event_package;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DialogMain_String extends JFrame implements ActionListener {

	JPanel panel = new JPanel();

	ArrayList<JButton> btns = new ArrayList<>();
	String[] msg = { "에러", "정보", "경고", "질문" };

	DialogMain_String() {

		setTitle("창 만들어보기");
		setBounds(100, 100, 500, 400);

		for (int i = 0; i < msg.length; i++) {
			btns.add(new JButton(msg[i]));
			btns.get(i).addActionListener(this);
			panel.add(btns.get(i));
		}

		add(panel);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 어떤 버튼이 눌렸는지 확인하는 함수 e.getSouce();
		Object obj = e.getSource();

		if (obj == btns.get(0)) { // 객체의 주소값 끼리 비교
			// 팝업창 JOptionPane 클래스 static으로 선언되어 있음
			btns.get(0).setBackground(Color.RED);
			JOptionPane.showMessageDialog(this, "에러가 발생했습니다!!", "에러 발생", JOptionPane.ERROR_MESSAGE);
		} else if (obj == btns.get(1)) {
			btns.get(1).setBackground(Color.CYAN);
			JOptionPane.showMessageDialog(this, "정보창입니다.", "정보창", JOptionPane.INFORMATION_MESSAGE);
		} else if (obj == btns.get(2)) {
			btns.get(2).setBackground(Color.LIGHT_GRAY);
			JOptionPane.showMessageDialog(this, "경고가 발생했습니다!!", "경고 발생", JOptionPane.WARNING_MESSAGE);
		} else if (obj == btns.get(3)) {
			btns.get(3).setBackground(Color.pink);
			JOptionPane.showInputDialog(this, "질문이 무엇입니까? ", "질문창", JOptionPane.QUESTION_MESSAGE);
			//JOptionPane.showMessageDialog(this, "질문이 무엇입니까", "질문창", JOptionPane.QUESTION_MESSAGE);
		}
	}

	public static void main(String[] args) {
		new DialogMain_String();

	}

}
