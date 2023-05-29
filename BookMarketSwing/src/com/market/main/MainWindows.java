package com.market.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainWindows extends JFrame {

	JPanel mMenuPanel = null;

	ArrayList<JButton> btns = new ArrayList<>();
	ArrayList<JLabel> labels = new ArrayList<>();

	MainWindows(String title, int x, int y, int width, int height) {

		initContainer(title, x, y, width, height);

		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void initContainer(String title, int x, int y, int width, int height) {

		setTitle(title);
		setBounds(x, y, width, height);
		setLayout(null);

		Font ft = new Font("맑은 고딕", Font.BOLD, 16);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		setLocation((screenSize.width - 1800) / 2, (screenSize.height - 900) / 2);

		// 메뉴 버튼 표시를 위한 보조프레임 설정 및 출력
		mMenuPanel = new JPanel(new FlowLayout());

		// setSize(x, y)는 컴포넌트 위치 변경
		// setLocation(weight, height)은 창의 너비, 높이
		// mMenuPanel.setSize(100,100);
		mMenuPanel.setBounds(0, 300, 800, 100);

		add(mMenuPanel);

		for (int i = 0; i < 9; i++) {
			btns.add(new JButton());
		}

		labels.add(new JLabel("고객정보 확인하기", new ImageIcon("./images/1.png"), JLabel.LEFT));
		labels.add(new JLabel("장바구니 상품 목록보기", new ImageIcon("./images/2.png"), JLabel.LEFT));
		labels.add(new JLabel("장바구니 비우기", new ImageIcon("./images/3.png"), JLabel.LEFT));
		labels.add(new JLabel("장바구니에 항목 추가하기", new ImageIcon("./images/4.png"), JLabel.LEFT));
		labels.add(new JLabel("장바구니의 항목 수량 줄이기", new ImageIcon("./images/5.png"), JLabel.LEFT));
		labels.add(new JLabel("장바구니의 항목 삭제하기", new ImageIcon("./images/6.png"), JLabel.LEFT));
		labels.add(new JLabel("주문하기", new ImageIcon("./images/7.png"), JLabel.LEFT));
		labels.add(new JLabel("종료", new ImageIcon("./images/8.png"), JLabel.LEFT));
		labels.add(new JLabel("관리자", new ImageIcon("./images/9.png"), JLabel.LEFT));

		for (int i = 0; i < btns.size(); i++) {
				btns.get(i).add(labels.get(i));
				mMenuPanel.add(btns.get(i));
		}
	}

	public static void main(String[] args) {
		new MainWindows("도서 쇼핑몰", 0, 0, 1500, 750);

	}

}
