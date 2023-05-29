package mouse;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseMotionMain extends JFrame implements MouseMotionListener {
	
	JPanel pan;
	JLabel label;

	MouseMotionMain() {
		setTitle("마우스 이벤트");
		setBounds(50, 50, 400, 200);

		pan = new JPanel();
		label = new JLabel(new ImageIcon("F:/java_seohee/javasrc/BookMarketSwing/images/1.png"));
		label.setForeground(Color.GREEN);

		
		pan.addMouseMotionListener(this);
		
		pan.add(label); 
		add(pan); 
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}


	@Override
	public void mouseDragged(MouseEvent e) {
		//마우스 눌린 상태에서 드래그
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//마우스 안눌린 상태에서 움직일 때
		label.setLocation(e.getX(), e.getY() -30);
	}

	public static void main(String[] args) {
		new MouseMotionMain();
	}

}
