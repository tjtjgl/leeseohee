package 최종;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class b_2_findPanel extends JPanel implements ActionListener{
	JLabel maintxt;
	
	JLabel findid;
	JLabel findpw;
	
	
	JTextField nametf;
	JTextField phonetf;
	
	JTextField idtf;
	JTextField phonetf2;
	
	JButton findidbtn;
	JButton findpwbtn;
	JButton goback;
	
	
	
	JButton mainimg;
	JLabel sidemenuMaintxt;
	JButton sidemenubtn;
	
	
	
	
	b_2_findPanel(){
		setLayout(null);
		setBackground(Color.WHITE);
		///////////////////////////////////////////////
		mainimg = new JButton(new ImageIcon("./src/����/��������_.jpg"));
		mainimg.setBounds(0, 50, 1200, 200 );
		add(mainimg);
		
		
		Font font = new Font("���� ���", Font.BOLD, 25);
        
        sidemenuMaintxt = new JLabel("ȸ������");
        sidemenuMaintxt.setFont(font);
        sidemenuMaintxt.setBounds(30, 280, 300, 50);
        add(sidemenuMaintxt);
        
        font = new Font("", Font.PLAIN, 17);
        sidemenubtn = new JButton("ID/PWã��");
        sidemenubtn.setFont(font);
        sidemenubtn.setBounds(0, 340, 300, 40);
        sidemenubtn.setBackground(new Color(135,0,58));
        sidemenubtn.setForeground(Color.WHITE);
        add(sidemenubtn);
		///////////////////////////////////////////////
        
        
        
		font = new Font("", Font.BOLD, 23);
		maintxt = new JLabel("ID/PW ã��");
		maintxt.setBounds(400, 300, 400, 50);
		maintxt.setFont(font);
		add(maintxt);
		
		
		font = new Font("", Font.BOLD, 20);
		findid = new JLabel("ID");
		findid.setFont(font);
		findid.setBounds(400, 380, 100, 30);
		add(findid);
		
		findpw = new JLabel("PW");
		findpw.setFont(font);
		findpw.setBounds(700, 380, 100, 30);
		add(findpw);
		
		
		nametf = new JTextField("�̸��� �Է��ϼ���");
		nametf.setBounds(400, 430, 200, 30);
		add(nametf);
		
		phonetf = new JTextField("��ȭ��ȣ�� �Է��ϼ���");
		phonetf.setBounds(400, 470, 200, 30);
		add(phonetf);
		
		idtf = new JTextField("���̵� �Է��ϼ���");
		idtf.setBounds(700, 430, 200, 30);
		add(idtf);
		
		phonetf2 = new JTextField("��ȭ��ȣ�� �Է��ϼ���");
		phonetf2.setBounds(700, 470, 200, 30);
		add(phonetf2);
		
		
		font = new Font("", Font.PLAIN, 17);
		
		findidbtn = new JButton("IDã��");
		findidbtn.setFont(font);
		findidbtn.setBackground(new Color(135,0,58));
		findidbtn.setForeground(Color.WHITE);
		findidbtn.setBounds(400, 520, 200, 40);
		findidbtn.addActionListener(this);
		add(findidbtn);
		
		findpwbtn = new JButton("PWã��");
		findpwbtn.setFont(font);
		findpwbtn.setBackground(new Color(135,0,58));
		findpwbtn.setForeground(Color.WHITE);
		findpwbtn.setBounds(700, 520, 200, 40);
		findpwbtn.addActionListener(this);
		add(findpwbtn);
		
		
		goback = new JButton(new ImageIcon("./src/����/Ȩ.jpg"));
		goback.setBounds(0,0, 50, 50);
		goback.setBorder(null);
		goback.addActionListener(this);
		add(goback);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==findidbtn) {
			String userid = z_0_FileManager.instance.findID(nametf.getText(), phonetf.getText());
			if(userid=="") {
				JOptionPane.showMessageDialog(null, "�ش� ���̵�� �������� �ʽ��ϴ�.","����",JOptionPane.WARNING_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "���̵�� " + userid + "�Դϴ�.","Ȯ��",JOptionPane.WARNING_MESSAGE);
			}
		}else if(e.getSource()==findpwbtn) {
			String userpw = z_0_FileManager.instance.findPW(idtf.getText(), phonetf2.getText());
			if(userpw=="") {
				JOptionPane.showMessageDialog(null, "���̵�� ��ȭ��ȣ�� Ȯ�����ּ���.","����",JOptionPane.WARNING_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "�н������ " + userpw + "�Դϴ�.","Ȯ��",JOptionPane.WARNING_MESSAGE);
			}
		}else if(e.getSource()==goback) {
			a_0_Main.frame.setContentPane(new b_0_loginPanel());
			a_0_Main.frame.revalidate();
		}
	}

}