package mouse;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame implements MouseListener {

	JPanel pan;

	Main(){
		setTitle("마우스 이벤트");
		setBounds(50, 50, 400, 200);

		pan = new JPanel();
		pan.addMouseListener(this);
		
		
		add(pan);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// 마우스 클릭할떄 
		pan.setBackground(Color.pink);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// 누를때
		pan.setBackground(Color.GREEN);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// 
		pan.setBackground(Color.LIGHT_GRAY);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// 마우스가 프레임 안쪽에 들어왔다
		pan.setBackground(Color.orange);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		pan.setBackground(Color.yellow);
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
