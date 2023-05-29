package swing_package;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class MyText extends JFrame {

	// TextField는 텍스트창, 한줄 입력/수정/편집할 수 있는 텍스트 구성요소
	// 검색창,아이디,댓글창 등
	JTextField obj1 = new JTextField(10); // 글자칸 10만큼의 크기로 생성
	JTextField obj2 = new JTextField("고양이"); // 글자 초기화
	JTextField obj3 = new JTextField("강아지", 10); // 글자 초기화하고 10칸 크기로 생성

	// CheckBox는 선택하거나 선택을 해제할 수 있는 사용자한테 보여주는 것
	// 한꺼번에 여러 개의 답을 얻을 수 있다.
	JCheckBox obj4 = new JCheckBox();
	JCheckBox obj5 = new JCheckBox("강아지");
	JCheckBox obj6 = new JCheckBox("고양이", true); // 체크된 상태로 생성

	// RadioButton는 여러 옵션 중 하나를 선택할 수 있는 라디오 버튼
	// 한번에 하나의 결과만 얻을 수 있음
	JRadioButton obj7 = new JRadioButton();
	JRadioButton obj8 = new JRadioButton("고양이", true);
	JRadioButton obj9 = new JRadioButton("강아지");

	// ComboBox = DropDown
	String[] name = { "고양이", "강아지", "돼지" };
	JComboBox obj10 = new JComboBox(name);

	// Label은 고정된 텍스트 값을 한줄로 표현하는 것(읽기 전용)
	// 이미지 불러올 때 경로는 프로젝트 폴더까지만 자동으로 접근
	JLabel label1 = new JLabel("고양이");
	JLabel label2 = new JLabel(new ImageIcon("Image.png"));
	JLabel label3 = new JLabel("고양이", new ImageIcon("Image.png"), JLabel.RIGHT);
	
	// passwordField는 비밀번호 입력에 특화된 텍스트
	// 암호기능을 처리하고 한줄의 텍스트로 편집
	JPasswordField obj11 = new JPasswordField(10);
	JPasswordField obj12 = new JPasswordField("댕댕");
	JPasswordField obj13 = new JPasswordField("댕댕댕",10);
	
	JPanel panel = new JPanel();

	MyText() {
		setTitle("서희의 GUI");
		setSize(600, 400);
		setLocation(600, 100);

		//panel.setLayout(new GridLayout(6, 6));

		panel.add(obj1);
		panel.add(obj2);
		panel.add(obj3);

		panel.add(obj4);
		panel.add(obj5);
		panel.add(obj6);

		panel.add(obj7);
		panel.add(obj8);
		panel.add(obj9);

		panel.add(obj10);

		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		
		panel.add(obj11);
		panel.add(obj12);
		panel.add(obj13);

		add(panel);

		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}

public class TextFieldMain {

	public static void main(String[] args) {
		new MyText();
	}

}
