package swing_package;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {

	public MyFrame() {
		setTitle("서희의 GUI");
		setSize(600, 400);
		setLocation(100, 100);
	
		JButton btn1 = new JButton("누르는 버튼");	
		JButton btn2 = new JButton("안누르는 버튼");	
		//윈도우 창에 버튼 부착, 버튼 배치(레이아웃) 필요
		add(btn1);
		add(btn2);
		
		setVisible(true);
		
		
	}
}

public class Main {

	public static void main(String[] args) {
		MyFrame my = new MyFrame();
	}
}

//		//객체 생성
//		JFrame windows = new JFrame();
//		
//		//윈도우 창 보이게 하기 ( true=보임, false=안보임)
//		windows.setVisible(true);
//		
//		windows.setSize(600, 400); //창 크기 설정 (너비,높이)
//		windows.setLocation(100, 100); //최초 실행 시 위치
//		
//		//창 프로그램 타이틀
//		windows.setTitle("서희의 GUI");