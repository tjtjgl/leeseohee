package InnerClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousMain extends JFrame {
	
	public AnonymousMain() {
		setBounds(0,0,400,300);
		
		JButton btn1 = new JButton("눌렀니");
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn1.setText("눌렀넹");
			}
		});
		
		add(btn1);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		
		
		
		new AnonymousMain();

	}

}
