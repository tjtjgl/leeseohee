package testEx;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CalcCircle extends JFrame {
	
	JPanel pan1 = new JPanel();
	JPanel pan2 = new JPanel();
	JPanel pan3 = new JPanel();
	JPanel pan4 = new JPanel();
	
	JLabel la1 = new JLabel("원의 반지름");
	JLabel la2 = new JLabel("원의 넓이");
	JLabel la3 = new JLabel();
	
	JTextField text1 = new JTextField(10);
	JTextField text2 = new JTextField(10);
	JTextArea text3 = new JTextArea(3,30);
	
	JButton b1= new JButton("계산");
	JButton b2= new JButton("리셋");

	//JComboBox cb;
	
	CalcCircle(){
		
		setTitle("원 넓이 구하기");
		setBounds(30, 50, 400, 300);
		setLayout(new BorderLayout(10, 10));
		//setLayout(new GridLayout(4,1));
		
		
		
		init();
		initCalc();// 메뉴들에 관한 명령문 저장하는 메소드

		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		
	}
	
	
	void init() {
		
		//=================패널1
		//pan1.setLayout(new java.awt.FlowLayout());
		pan1.setBackground(Color.pink);
		
		pan1.add(la1,BorderLayout.CENTER); pan1.add(text1,BorderLayout.CENTER);
		add(pan1);
		//=================패널2
		pan2.setLayout(new java.awt.FlowLayout());
		pan2.setBackground(Color.LIGHT_GRAY);
		pan2.add(la2); pan2.add(text2);
		add(pan2);
		
		//=================패널3
		pan3.setLayout(new java.awt.FlowLayout());

		pan3.add(text3);
		add(pan3);
		
		
		//=================패널4
		pan4.setLayout(new java.awt.FlowLayout());
		//pan4.setBounds(160, 160, 300, 50);
		pan4.setBackground(Color.black);

		pan4.add(b1); pan4.add(b2);
		add(pan4);

	}
	
	
	
	void initCalc(){
		
		
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		new CalcCircle();
	}

}
