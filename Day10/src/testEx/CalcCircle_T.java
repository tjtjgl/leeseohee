package testEx;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CalcCircle_T extends JFrame implements ActionListener,ItemListener,MouseMotionListener,KeyListener {
	
	//=====변수 공유를 위해 전역변수로 선언
	JTextField text1;
	JTextField text2;
	JTextArea area3;
	
	JButton calc;
	JButton reset;

	JComboBox cb;
	
	CalcCircle_T(){
		setTitle("원 넓이 구하기");
		setBounds(30, 50, 400, 300);
		setLayout(new BorderLayout(10, 10));
		//setLayout(new GridLayout(4,1));

		showNorth();
		showCenter();
		showSouth();
		
		//-----------이벤트 추가(는 생성자에)------------
		calc.addActionListener(this);
		text1.addKeyListener(this);
		cb.addItemListener(this);
		cb.addMouseMotionListener(this);
		reset.addActionListener(this);

		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	void showNorth() {
		//==========맨위 North에 컴포넌트 생성
		JPanel pan1 = new JPanel(); //반지름 필드
		JPanel pan2 = new JPanel();	//원의 넓이 필드
		JPanel pan = new JPanel(new GridLayout(2,0)); // 두 판넬을 그리드레이아웃으로 합칠거야 
	
		JLabel la1 = new JLabel("원의 반지름");	
		JLabel la2 = new JLabel("원의 넓이    ");
		
		text1 = new JTextField(10);
		text2 = new JTextField(10);
		
		text2.setEnabled(false);//텍스트필드 보여지긴 하지만 비활성화
		
		pan1.add(la1); pan1.add(text1);
		pan2.add(la2); pan2.add(text2);
		pan.add(pan1);pan.add(pan2);
		add(pan,BorderLayout.NORTH);
	}
	
	void showCenter() {
		//=========Center에 컴포넌트 생성
		JPanel pan = new JPanel();
		area3 = new JTextArea(10,30);
		area3.setText("이 영역에 원의 넓이를 \n계산하는 과정이 출력됩니다.");
		area3.setForeground(Color.darkGray);
		area3.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		area3.setEditable(false);
		
		pan.add(area3);
		add(pan, BorderLayout.CENTER);
	}
	
	void showSouth() {
		//=========맨밑에 컴포넌트 생성
		JPanel pan = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		String[] color = {"색 선택","red","blue","pink"};
		
		calc = new JButton("계산");
		cb = new JComboBox(color);
		reset = new JButton("리셋");

		pan.add(calc);pan.add(cb);pan.add(reset);
		add(pan, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) { //버튼, 텍스트필드 용
		
		//자료타입을 모르기 때문에 최상위 클래스인 Object 타입으로 저장(다형성)
		Object obj = e.getSource();
		
		if( obj == calc ) {
			
			//만약 TextField가 비어 있으면 아무것도 안해!
			boolean res = text1.getText().isEmpty();
			
			
			if(!res) {
				//1. 텍스트 필드에서 값 가져오기
				String s = text1.getText();	
				//2. 가져온 값을 실수로 저장 
				double radius = Double.parseDouble(s);//문자를 실수로 변경
				double result = radius * radius * 3.14;
				//3. 계산된 결과를 text2랑 area에 넣기
				text2.setText(""+result);
				area3.setText(radius +" * "+radius+" * 3.14 = "+result);
				} else {
				area3.setText("반지름을 입력하세요.");
				}
	
		} else if (obj == reset) {
			boolean res = text2.getText().isEmpty();
			
			if (!res) {
				text1.setText(""); //null 넣어도 됨
				text2.setText("");
				area3.setText("");
				area3.setForeground(getForeground());
			}
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) { //콤보박스용
		//아이템을 배열로 저장했기 때문에 꺼내올 때 index 번호로 가져올 수 있다
		//getSelectedIndex() : 선택된 인덱스 번호를 가져온다
		int idx = cb.getSelectedIndex();
		
		if(idx == 1) {
			area3.setForeground(Color.red);
		} else if (idx == 2) {
			area3.setForeground(Color.blue);
		} else if( idx == 3) {
			area3.setForeground(Color.pink);
		} else {
			area3.setForeground(getForeground());
		}
	}
	
	@Override
	public void mouseMoved(MouseEvent e) { //컴포넌트용(여기선 콤보박스)
		
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {}
	
	@Override
	public void keyTyped(KeyEvent e) {
		//System.out.println("아직 안땠다....");
		}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == 10) {
			boolean res = text1.getText().isEmpty();
			if(!res) {
				String s = text1.getText();	
				double radius = Double.parseDouble(s);//문자를 실수로 변경
				double result = radius * radius * 3.14;
				text2.setText(""+result);
				area3.setText(radius +" * "+radius+" * 3.14 = "+result);
			} else {
				area3.setText("반지름을 입력하세요.");
				}
			}
		}
	
	@Override
	public void keyReleased(KeyEvent e) {
		//System.out.println("뗐다!");
		}
	
	public static void main(String[] args) {
		new CalcCircle_T();
		}
}
