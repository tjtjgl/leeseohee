package event_package;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//이벤트를 듣고 있는 리스너 클래스 생성
class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트 객체에서 getSource(): (버튼인지 목록인지) 이벤트 정보를 가지고 있음
		// 반환값이 Object면 모든 객체를 받아서 돌려줄 수 있다.
		JButton btn = (JButton) e.getSource();

		String text = btn.getText();
		boolean res = text.equals("버튼이 눌렸습니다");

		if (res) {
			btn.setText("버튼이 또 눌렸습니다");
		} else {
			btn.setText("버튼이 눌렸습니다");
		}
		// System.out.println(btn.getText());
		// btn.setText("버튼이 눌렸습니다");
	}
}

class MyFrame extends JFrame implements ActionListener{

	MyFrame() {

		setBounds(450, 450, 400, 300);

		JPanel panel = new JPanel();
		add(panel);

		// =========첫번째 버튼 생성=========
		JButton btn1 = new JButton("버튼을 누르세요");
		btn1.setFont(new Font("맑은 고딕", Font.BOLD, 20));

		// 버튼에 이벤트를 설정하는 것
		//btn1.addActionListener(new MyListener()); //클래스 별도로 만들었을 때에는 MyListener 참조해라 그 안에 메소드 있다! 
		btn1.addActionListener(this); //나 참조해라! 그럼 거기 메소드 있다!

		panel.add(btn1);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();

		String text = btn.getText();
		boolean res = text.equals("버튼이 눌렸습니다");

		if (res) {
			btn.setText("버튼이 또 눌렸습니다");
		} else {
			btn.setText("버튼이 눌렸습니다");
		}
		
	}

}

public class Main {

	public static void main(String[] args) {
		new MyFrame();

	}

}
