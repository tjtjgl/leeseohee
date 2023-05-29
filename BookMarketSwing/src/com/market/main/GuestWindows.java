package com.market.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuestWindows extends JFrame {

	// 프레임창 기본 설정은 기본 생성자 안
	public GuestWindows(String title, int x, int y, int width, int height) {
		
		
		initContainer(title, x, y, width, height);
		
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	// 컴포먼트들을 함수로 생성
	public void initContainer(String title, int x, int y, int width, int height) {
		setTitle(title);
		setBounds(x, y, width, height); // 프레임의 크기 설정
		setLayout(null); // 프레임 배치 미설정

		Font ft = new Font("맑은 고딕", Font.BOLD, 16);

		// setLocation 너비와 높이를 필드로 저장하는 클래스
		// 툴킷 클래스로 모니터 해상도 사이즈를 가져와 그 중앙에 위치
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width-1800) / 2, (screenSize.height-900) / 2);
		

		// 여러 컴포넌트 올릴 수 있는 보조프레임 생성
		JPanel userPanel = new JPanel();
		userPanel.setBounds(0, 100, 1000, 260);

		// 아이콘
		String path = "./images/";
	
		ImageIcon imageIcon = new ImageIcon(path+"user.png");

		// 이미지 아이콘 크기,스타일 setImage()
		imageIcon.setImage(imageIcon.getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH));

		// 위 이미지를 라벨에 위치
		JLabel userLabel = new JLabel(imageIcon);

		// 그 라벨을 패널에 추가
		userPanel.add(userLabel);
		
		// 보조 프레임을 메인프레임에 올리기
		add(userPanel);

		// ======고객 정보표시======
		JPanel titlePanel = new JPanel();

		titlePanel.setBounds(0, 350, 1000, 50);
		add(titlePanel);

		JLabel titleLabel = new JLabel("===고객 정보를 입력하세요===");
		titleLabel.setFont(ft);
		titleLabel.setForeground(Color.black); // 글꼴 색상
		titlePanel.add(titleLabel);
		
		
		// =========이름 패널=========
		JPanel namePanel = new JPanel();

		namePanel.setBounds(0, 400, 1000, 50);
		add(namePanel);

		// 이름 라벨
		//namePanel.setLayout(new java.awt.FlowLayout());
		JLabel nameLabel = new JLabel("이   름 : ");
		nameLabel.setFont(ft);
		nameLabel.setForeground(Color.DARK_GRAY); // 글꼴 색상
		
		// 이름 입력받는 text 필드
		JTextField nameText = new JTextField(10);

		namePanel.add(nameLabel);
		namePanel.add(nameText);

		// =========폰 패널=========
		JPanel phonePanel = new JPanel();
		phonePanel.setBounds(0, 450, 1000, 50);
		
		add(phonePanel);

		// 연락처 라벨
		//phonePanel.setLayout(new java.awt.FlowLayout());
		JLabel phoneLabel = new JLabel("연락처 : ");
		phoneLabel.setFont(ft);
		phoneLabel.setForeground(Color.DARK_GRAY); // 글꼴 색상

		// 연락처 입력받는 text 필드
		JTextField phoneText = new JTextField(10);

		phonePanel.add(phoneLabel);
		phonePanel.add(phoneText);

		//마지막 버튼
		JPanel buttonPanal = new JPanel();
		buttonPanal.setBounds(0, 500, 1000, 50);
		add(buttonPanal);
	
		ImageIcon imageIconB = new ImageIcon(path+"shop.png");
		JButton btn = new JButton("쇼핑하기",imageIconB);
		btn.setFont(ft);
		
		buttonPanal.add(btn);

	}

	public static void main(String[] args) {
		new GuestWindows("온라인 서점",0,0,1000,750);

	}

}
