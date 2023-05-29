package bookmarket;

import java.util.ArrayList;

public class BookContoller {

	private ArrayList<Book> initList = new ArrayList<>();
	private ArrayList<BookCart> cartList = new ArrayList<>();
	
	private Person p;

	void initBook() {
		// System.out.println("[장바구니 목록]");

		initList.add(new Book(1234, "쉽게 배우는 JSP 웹 프로그래밍", 27000, "송미영", "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍", "IT전문서",
				"2018/10/08"));
		initList.add(new Book(1235, "안드로이드 프로그래밍", 33000, "우재남", "실습 단계별 명쾌한 멘토링!", "IT전문서", "2022/01/22"));
		initList.add(new Book(1236, "스크래치", 22000, "고광일", "컴퓨팅 사고력을 키우는 블록 코딩", "컴퓨터입문", "2019/06/10"));
	}

	void initList() {
		for (Book val : initList) {
			System.out.println(val);
		}
	}

	void cartListView() {
		System.out.println("----------------------------------------------");
		System.out.println(" 도서ID\t\t|\t수량\t|\t합계");
		for (BookCart val : menuCartItemList()) {
			System.out.println(" " + val.getIdFull() + "\t|\t" + val.getAmount() + "\t|\t" + val.getPrice());
		}
		System.out.println("----------------------------------------------");
	}

	// 1 고객정보
	Person menuGeustInfo(String name, String phone) {
		p = new Person(name, phone);
		return p;
	}

	// 2 장바구니 목록 보기
	ArrayList<BookCart> menuCartItemList() {
		if (cartList.size() != 0) {
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
	ArrayList<BookCart> menuCartItem(int id) {
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
	ArrayList<BookCart> menuCartRemoveItemCount(int id) {
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

	ArrayList<BookCart> menuCartRemoveItem(int id) {
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
	void menuCartBill(String add, Delivery d) {
	
		if (d.getName() == null) {
			d.setName(p.getName());
			d.setPhone(p.getPhone());
			d.setAddress(add);
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
	}

}
