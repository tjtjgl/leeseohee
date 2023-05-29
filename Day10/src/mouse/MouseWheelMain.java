package mouse;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseWheelMain extends JFrame implements MouseWheelListener{
	
	Random r = new Random();
	
	JPanel pan;
	JLabel label;
	
	int size= 30;

	MouseWheelMain(){
		
		setTitle("마우스 이벤트");
		setBounds(50, 50, 400, 200);

		pan = new JPanel();
		label = new JLabel("움직이는 글자");

		label.setFont(new Font("돋움",Font.BOLD,size));
	
		label.addMouseWheelListener(this);

		pan.add(label);
		add(pan,BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MouseWheelMain();
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		//마우스 휠이 움직였을때 이벤트
		int res = e.getWheelRotation();
		
		int red = r.nextInt(256);
		int green = r.nextInt(256);
		int blue = r.nextInt(256);
		
		pan.setBackground(new Color(red,green,blue));

		if(res == -1) {
			size--;
			
		} else if(res == 1){
			size++;
		}
		
		label.setFont(new Font("돋움",Font.BOLD,size));
	}

}
