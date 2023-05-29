
package Menu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuColorMain extends JFrame implements MouseListener {
	
	JPanel mainPanel;
	
	JMenuItem m2_i1;
	JMenuItem m2_i2;
	JMenuItem m2_i3;
	JMenuItem m2_i4;

	MenuColorMain() {
		setTitle("메뉴 만들기");
		setBounds(30, 50, 500, 400);
		setLayout(new BorderLayout());
		
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.cyan);
		add(mainPanel, BorderLayout.CENTER);
		
		initMenubar();// 메뉴들에 관한 명령문 저장하는 메소드
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	void initMenubar() {
		
		//===================================	
		JMenuBar mb = new JMenuBar();

		JMenu m1 = new JMenu("File");
		JMenu m2 = new JMenu("Color");
		JMenu m3 = new JMenu("Help");
		
		//setMnemonic() : 니모닉키, 단축키로 메뉴 접근
		m1.setMnemonic(KeyEvent.VK_ALT);
		m2.setMnemonic(KeyEvent.VK_CONTROL);

		//===================================	
		JMenuItem m1_i1 = new JMenuItem("New");
		JMenuItem m1_i2 = new JMenuItem("Open File");
		JMenuItem m1_i3 = new JMenuItem("Save");
		
		m2_i1 = new JMenuItem("파랑");
		m2_i2 = new JMenuItem("분홍");
		m2_i3 = new JMenuItem("주황");
		m2_i4 = new JMenuItem("검정");
		
		JMenuItem m3_i1 = new JMenuItem("Help Contents");
		JMenuItem m3_i2 = new JMenuItem("About");
		
		//리스너
		m2_i1.addMouseListener(this);
		m2_i2.addMouseListener(this);
		m2_i3.addMouseListener(this);
		m2_i4.addMouseListener(this);
		
		//메뉴에 메뉴아이팀 
		m1.add(m1_i1); m1.add(m1_i2); m1.add(m1_i3);
		m2.add(m2_i1); m2.add(m2_i2); m2.add(m2_i3); m2.add(m2_i4);
		m3.add(m3_i1); m3.add(m3_i2);
		
		// 메뉴바에 메뉴
		mb.add(m1);mb.add(m2);mb.add(m3);
		
		//프레임에 메뉴바 설정
		setJMenuBar(mb);		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		JMenuItem obj = (JMenuItem) e.getSource();
		
		if (obj == m2_i1) {
			mainPanel.setBackground(Color.blue);
		} else if (obj == m2_i2) {
			mainPanel.setBackground(Color.pink);
		} else if (obj == m2_i3) {
			mainPanel.setBackground(Color.orange);
		} else {
			mainPanel.setBackground(Color.black);
		}
			
	}

	public static void main(String[] args) {
		new MenuColorMain();
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
	
	
	
}
