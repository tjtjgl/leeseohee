
package mouse;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MouseWheelGame_T extends JFrame implements MouseWheelListener {

	// Random r = new Random();

	JPanel colorPanel = new JPanel();

	JPanel controlPanel = new JPanel(new GridLayout(1, 3, 10, 10));

	JLabel redL = new JLabel("빨강");
	JLabel greenL = new JLabel("초록");
	JLabel blueL = new JLabel("파랑");

	int r = 128, g = 128, b = 128;

	MouseWheelGame_T() {

		setTitle("마우스 휠 게임");
		setBounds(50, 50, 400, 800);
		setLayout(new GridLayout(2,0,10,10));

		// 컬러패널 포기화
		colorPanel.setBackground(new Color(r, g, b));

		redL.setFont(new Font("맑은 고딕",Font.BOLD,15));
		redL.setForeground(Color.black);
		redL.setHorizontalAlignment(SwingConstants.CENTER);
		redL.setOpaque(true);
		redL.setBackground(Color.red);

		greenL.setFont(new Font("맑은 고딕",Font.BOLD,15));
		greenL.setForeground(Color.black);
		greenL.setHorizontalAlignment(SwingConstants.CENTER);
		greenL.setOpaque(true);
		greenL.setBackground(Color.green);
		
		blueL.setFont(new Font("맑은 고딕",Font.BOLD,15));
		blueL.setForeground(Color.white);
		blueL.setHorizontalAlignment(SwingConstants.CENTER);
		blueL.setOpaque(true);
		blueL.setBackground(Color.blue);

		redL.addMouseWheelListener(this);
		greenL.addMouseWheelListener(this);
		blueL.addMouseWheelListener(this);

		controlPanel.add(redL);
		controlPanel.add(greenL);
		controlPanel.add(blueL);
		add(controlPanel);
		add(colorPanel, BorderLayout.CENTER);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MouseWheelGame_T();
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// 마우스 휠이 움직였을때 이벤트
		// 어느 객체에서 이벤트가 발생했는지 확인 ==========내가 못 푼 부분=============
		JLabel obj = (JLabel) e.getSource();

		int wheel = e.getWheelRotation();

		if (obj == redL) {

			// if (color <= 255) {
			if (wheel == -1) {
				r = --r < 0 ? 0 : r;
			} else if (wheel == 1) {
				r = ++r > 255 ? 255 : r;
			}
			redL.setText("빨강: "+r);
		} else if (obj == greenL) {
			if (wheel == -1) {
				g = --g < 0 ? 0 : g; //g에 -1한 값을 넣는데 그게 0보다 크냐, true면 0, false면 g
			} else if (wheel == 1) {
				g = ++g > 255 ? 255 : g;
			}
			greenL.setText("초록: "+g);
		} else if (obj == blueL) {
			if (wheel == -1) {
				b = --b < 0 ? 0 : b;
			} else if (wheel == 1) {
				b = ++b > 255 ? 255 : b;
			}
			blueL.setText("파랑: "+b);
		}	
		colorPanel.setBackground(new Color(r, g, b));
	}
}
