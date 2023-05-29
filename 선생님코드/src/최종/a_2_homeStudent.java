package 최종;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class a_2_homeStudent extends JPanel implements ActionListener{

	JButton mainimg;
	JLabel sidemenuMaintxt;
	JButton side_subjectManagement;
	JButton side_showAllSubject;
	JButton logout;
	
	JLabel maintxt;
	JLabel subtxt;
	
	a_2_homeStudent(){
		setLayout(null);
		setBackground(Color.white);
		
		
		mainimg = new JButton(new ImageIcon("./src/����/��������_.jpg"));
		mainimg.setBounds(0, 50, 1200, 200 );
		add(mainimg);
		
		
		Font font = new Font("���� ���", Font.BOLD, 25);
		
		sidemenuMaintxt = new JLabel("�л����");
		sidemenuMaintxt.setFont(font);
		sidemenuMaintxt.setBounds(30, 280, 300, 50);
		add(sidemenuMaintxt);
		
		font = new Font("", Font.PLAIN, 17);
		
		side_showAllSubject = new JButton("����������ȸ");
		side_showAllSubject.setFont(font);
		side_showAllSubject.setBounds(0, 340, 300, 40);
		side_showAllSubject.setBackground(new Color(135,0,58));
		side_showAllSubject.setForeground(Color.WHITE);
		side_showAllSubject.addActionListener(this);
		add(side_showAllSubject);
		
		
		side_subjectManagement = new JButton("������û/öȸ");
		side_subjectManagement.setFont(font);
		side_subjectManagement.setBounds(0, 380, 300, 40);
		side_subjectManagement.setBackground(new Color(135,0,58));
		side_subjectManagement.setForeground(Color.WHITE);
		side_subjectManagement.addActionListener(this);
		add(side_subjectManagement);
		
		
		logout = new JButton(new ImageIcon("./src/����/�α׾ƿ�.jpg"));
		logout.setBounds(0, 0, 50, 50);
		logout.setBorder(null);
		logout.addActionListener(this);
		add(logout);
		
		font = new Font("���� ���", Font.PLAIN, 30);
		
		maintxt = new JLabel("" + z_0_FileManager.instance.userManager.get(a_0_Main.log).name + "�� �ݰ����ϴ�.");
		maintxt.setBounds(350, 300, 500, 30);
		maintxt.setFont(font);
		add(maintxt);
		
		
		font = new Font("���� ���", Font.PLAIN, 27);
		subtxt = new JLabel("�������� �����Ͻ� �۾��� �������ּ���.");
		subtxt.setBounds(350, 350, 500, 30);
		subtxt.setFont(font);
		add(subtxt);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==logout) {
			a_0_Main.log=-1;
			a_0_Main.frame.setContentPane(new b_0_loginPanel());
			a_0_Main.frame.revalidate();
		}else if(e.getSource()==side_subjectManagement) {
			a_0_Main.frame.setContentPane(new d_1_subjectManagement());
			a_0_Main.frame.revalidate();
		}else if(e.getSource()==side_showAllSubject) {
			a_0_Main.frame.setContentPane(new d_0_studentPanel());
			a_0_Main.frame.revalidate();
		}
	}

}
