package Menu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main extends JFrame {
	
	Main() {
		setTitle("메뉴 만들기");
		setBounds(30, 50, 500, 400);

		initMenubar();// 메뉴들에 관한 명령문 저장하는 메소드
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	void initMenubar() {
		//1. 메뉴바 만들기
		JMenuBar mb = new JMenuBar();

		//2. 메뉴 만들기
		JMenu m1 = new JMenu("File");
		JMenu m2 = new JMenu("Edit");
		JMenu m3 = new JMenu("Help");
		
		//3. 각 메뉴 항목 만들기
		JMenuItem m1_i1 = new JMenuItem("New");
		JMenuItem m1_i2 = new JMenuItem("Open File");
		JMenuItem m1_i3 = new JMenuItem("Save");
		
		JMenuItem m2_i1 = new JMenuItem("Copy");
		JMenuItem m2_i2 = new JMenuItem("Paste");
		JMenuItem m2_i3 = new JMenuItem("Cut");
		JMenuItem m2_i4 = new JMenuItem("Delete");
		
		JMenuItem m3_i1 = new JMenuItem("Help Contents");
		JMenuItem m3_i2 = new JMenuItem("About");
		
		//메뉴에 메뉴아이팀 
		m1.add(m1_i1); m1.add(m1_i2); m1.add(m1_i3);
		m2.add(m2_i1); m2.add(m2_i2); m2.add(m2_i3); m2.add(m2_i4);
		m3.add(m3_i1); m3.add(m3_i2);
		
		// 메뉴바에 메뉴
		mb.add(m1);mb.add(m2);mb.add(m3);
		
		//프레임에 메뉴바 설정
		setJMenuBar(mb);		
		
	}

	public static void main(String[] args) {
		new Main();
	}
}
