package varable;

import java.util.ArrayList;

class Hotel {

	static String masterKey = "마스터키";

	// 투숙객마다 방 번호랑 예약한 사람 이름
	// HotelCounter[] list = new HotelCounter[10];
	static ArrayList<HotelCounter> list = new ArrayList<>();

	// 투숙객 정보 교환
	static void ch() {
	}

}

class HotelCounter {

	// 클래스 객체가 생성될 때마다 변수를 만든다
	// 인스턴스 변수
	String name; // 이름
	int roomNum; // 방번호
}
//변수의 크기가 유동적(크거나 작거나 변경이 많이 된다) -> 인스턴스 변수 -> 프로그램이 시작하고 나서 생성되는 heap 영역에 저장
//변수가 고정적 -> 중괄호 시작 중괄호 삭제 -> 프로그램 시작 전 저장하는 공간 stack에 저장
//프로그램이 끝날때까지 전역변수 데이터 유지 -> static 영역

public class Main {

	public static void main(String[] args) {

		//one1 은 참조변수, 인스턴스 변수
		HotelCounter one1 = new HotelCounter();
		one1.roomNum = 1001;

		HotelCounter one2 = new HotelCounter();
		one1.roomNum = 1002;
		
		//static 은 객체 생성 필요 없음, 접근 방법은 *클래스명*으로
		System.out.println( Hotel.masterKey);
		
		

	}

}





