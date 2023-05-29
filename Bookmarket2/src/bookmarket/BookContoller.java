package bookmarket;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import chat.ChatClient;
import chat.ChatServer;
import chat.ClientThread;
import chat.ServerThread;

public class BookContoller {

	private ArrayList<Book> initList = new ArrayList<>();
	private ArrayList<BookCart> cartList = new ArrayList<>();
	BookDAO bdao = new BookDAO();
	Person p;

	void initBook() throws Exception {
		// System.out.println("[장바구니 목록]");

		initList.add(
				new Book("쉽게 배우는 JSP 웹 프로그래밍", 27000, "송미영", "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍", "IT전문서", "2018/10/08"));
		initList.add(new Book("안드로이드 프로그래밍", 33000, "우재남", "실습 단계별 명쾌한 멘토링!", "IT전문서", "2022/01/22"));
		initList.add(new Book("스크래치", 22000, "고광일", "컴퓨팅 사고력을 키우는 블록 코딩", "컴퓨터입문", "2019/06/10"));

		bdao.fileSave(initList);

	}

	void initList() {
		for (Book val : initList) {
			System.out.println(val);
		}
	}

	void cartListView() throws Exception {
		System.out.println("----------------------------------------------");
		System.out.println(" 도서ID\t\t|\t수량\t|\t합계");
		for (BookCart val : menuCartItemList()) {
			System.out.println(" " + val.getIdFull() + "\t|\t" + val.getAmount() + "\t|\t" + val.getPrice());
		}
		System.out.println("----------------------------------------------");
	}

	// 1 고객정보
	Person menuGeustInfo(String name, String phone) {
		System.out.println("======현재 접속중인 사용자 정보======");
		System.out.println("이름: " + name);
		System.out.println("연락처: " + phone);
		p = new Person(name, phone);
		return p;
	}

	// 2 장바구니 목록 보기
	ArrayList<BookCart> menuCartItemList() {
		if (cartList.size() != 0) {
			for (int i = 0; i < cartList.size(); i++) {
				cartList.get(i);
			}
			return cartList;
		}
		return null;
	}

	// 3번 장바구니 비우기
	int menuCartClear() {
		if (cartList.size() == 0) {
			return 0;
		}
		cartList.clear();
		return 1;
	}

	// 4 장바구니 추가
	ArrayList<BookCart> menuCartItem(int id) throws Exception {

		for (Book val : initList) {
			if (val.getId() == id) {
				for (BookCart val2 : cartList) {
					if (val2.getId() == id) {
						val2.setPrice(val.getPrice());
						return cartList;
					}
				}
				BookCart boca = new BookCart(id, val.getPrice());
				cartList.add(boca);
				return cartList;
			}
		}
		return null;
	}

	// 5 장바구니 물량 줄이기
	ArrayList<BookCart> menuCartRemoveItemCount(int id) throws Exception {
		cartListView();
		for (Book val : initList) {
			if (val.getId() == id) {
				for (BookCart val2 : cartList) {
					if (val2.getId() == id) {
						val2.removePrice(val.getPrice());
						if (val2.getAmount() == 0) {
							cartList.remove(val2);
							return cartList;
						}
						return cartList;
					}
				}
			}
		}
		return null;
	} // 5 메소드 끝

	// 6 항목 삭제
	ArrayList<BookCart> menuCartRemoveItem(int id) throws Exception {
		cartListView();
		for (BookCart val : cartList) {
			if (val.getId() == id) {
				cartList.remove(val);
				return cartList;
			}
		}
		return null;
	}

	// 7 영수증
	void menuCartBill(Delivery d) throws Exception {

		if (d.getName() == null) {
			d.setName(p.getName());
			d.setPhone(p.getPhone());
			d.setAddress(d.getAddress());
		}

		System.out.println("---------배송 받을 고객 정보---------");
		System.out.println("고객명: " + d.getName() + "\t연락처: " + d.getPhone());
		System.out.println("배송지: " + d.getAddress() + "\t발송일: " + d.getDate());
		System.out.println("장바구니 상품 목록: ");
		cartListView();

		int sum = 0;
		for (BookCart val : cartList) {
			sum += val.getPrice();
		}
		System.out.println("\t\t\t주문 총 금액: " + sum);
	} // 7 끝

	int adminLogin(String id, String pw) {
		Admin a1 = new Admin("admin", "1234");

		if (a1.getId().equals(id) && a1.getPw().equals(pw)) {
			System.out.println("관리자 로그인에 성공하였습니다.");

			System.out.println("==========관리자 정보==========");
			System.out.println("ID: " + id + "\tPW: " + pw);
			System.out.println("이름: " + p.getName() + "\t\t연락처: " + p.getPhone());
			System.out.println("============================");
			return 1;
		}

		return 0;
	}

	ArrayList<Book> addBook(Book b) throws Exception {
		String path = "D:\\";
		String fileName = "book.txt";

		File file = new File(path + fileName);

		// 지정 위치에 파일이 존재하면 false, 존재하지 않으면 true
		// 파일 없으면 생성까지 해줌
		boolean res = file.createNewFile();

		if (res) {
			System.out.println(fileName + "파일 생성 완료");
		} else {
			System.out.println("기존 파일 있음");
		}

		initList.add(b);
		bdao.fileSave(initList);
		return initList;
	}

	void readBook() throws Exception {
		for (Book val : bdao.fileRead()) {
			System.out.print(val);
		}
	}

	public void serverMain() throws Exception {

		final int cs_port = 2777;
		final int cs_maxclient = 10;

		ServerSocket ss_socket = new ServerSocket(cs_port);
		while (true) {
			Socket sock = null;
			ServerThread client = null; // 클라이언트와 통신할 서버소켓
			try {
				sock = ss_socket.accept(); // 클라이언트의 접속을 기다린다.
				client = new ServerThread(sock);
				client.start();
			} catch (IOException e) {
				System.out.println(e);
				try {
					if (sock != null)
						sock.close();
				} catch (IOException e1) {
					System.out.println(e);
				} finally {
					sock = null;
				}
			}
		}
	}

	public void clientMain() throws Exception {

		ChatClient cc1 = new ChatClient();

		cc1.client = new ChatClient("대화방 개설 및 입장");
		cc1.client.setSize(350, 400);
		cc1.client.setVisible(true);
		cc1.client.pack();

		cc1.cc_thread = new ClientThread(cc1.client); // 로컬 호스트용 생성자
		cc1.cc_thread.start(); // 클라이언트의 스레드를 시작한다.

	}
}
