
package mouse;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseWheelGame extends JFrame implements MouseWheelListener {

	Random r = new Random();

	JPanel pan1;
	JPanel pan2;

	JLabel redL;
	JLabel greenL;
	JLabel blueL;

	int color =255;


	MouseWheelGame() {

		setTitle("마우스 휠 게임");
		setBounds(50, 50, 400, 800);
		setLayout(new GridLayout(2, 1));
		// =================판넬1
		pan1 = new JPanel(new GridLayout(1, 3, 10, 10));

		redL = new JLabel("뭔데");
		redL.setOpaque(true);
		redL.setBackground(new Color(color, 0, 0));

		greenL = new JLabel("안생기");
		greenL.setOpaque(true);
		greenL.setBackground(new Color(0, color, 0));

		blueL = new JLabel("냐고");
		blueL.setOpaque(true);
		blueL.setBackground(new Color(0, 0, color));

		redL.addMouseWheelListener(this);
		greenL.addMouseWheelListener(this);
		blueL.addMouseWheelListener(this);

		// =================판넬2
		pan2 = new JPanel();

		pan1.add(redL); pan1.add(greenL); pan1.add(blueL);
		add(pan1);
		add(pan2, BorderLayout.CENTER);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MouseWheelGame();
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// 마우스 휠이 움직였을때 이벤트
		int res = e.getWheelRotation();
		//if (color <= 255) {
			if (res == -1) {
				color--;

			} else if (res == 1) {
				color++;
			}
	//	} 

		redL.setOpaque(true);
		pan2.setBackground(new Color(color, 0, 0));
		
		
	}

}
