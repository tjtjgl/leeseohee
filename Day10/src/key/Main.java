package key;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//1. 생성자로 라벨,텍스트 필드 값 받아오기
//2. 내부클래스로 선언
//3. 계단 상속
class MyAdapter extends KeyAdapter{
	
	JLabel l;
	JTextField t;
	
	MyAdapter(JTextField text, JLabel label){
		l = label;
		t = text;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == 10) { // = KeyEvent.VK_ENTER
			l.setText("입력한 문자열 : " + t.getText());
		}
	}
}

public class Main extends JFrame implements KeyListener {

	JTextField text;
	
	Main() {
		//Adapter 클래스
		//인터페이스 오버라이딩 할 때 *사용하고 싶은 메소드만* 오버라이딩 할 수 있도록 만든 클래스
		//메소드가 하나인 인터페이스는 어댑터 클래스 없음
		setTitle("키 어댑터");
		setBounds(30, 30, 400, 200);
	
		JLabel label = new JLabel("키 어댑터",JLabel.CENTER);
		text = new JTextField(10);
			
		//보더레이아웃 add("앞글자는대문자문자열",컴포넌트);
		add("North",text);
		add("Center",label);
		
		text.addKeyListener(new MyAdapter(text,label));

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//System.out.println("아직 안땠다....");

	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//System.out.println("뗐다!");
		//System.out.println(e.getKeyCode());
	}

	public static void main(String[] args) {
		new Main();
	}

}
