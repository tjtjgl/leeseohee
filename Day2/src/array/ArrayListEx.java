package array;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {

		// 공간을 자동으로 추가/삭제/조회

		// 정수 베열 생성
		ArrayList<Integer> list1 = new ArrayList<>();

		// 추가 add(값)
		list1.add(10);
		list1.add(20);
		list1.add(30);

		// 출력
		System.out.println(list1);

		// 길이
		System.out.println(list1.size());

		// 조회 indexOf(값)
		System.out.println("20이 있는 인덱스 번호: " + list1.indexOf(20));
		int find1 = list1.indexOf(20);

		// 삭제 remove(인덱스번호)
		list1.remove(find1);

		// 출력
		System.out.println(list1);

		System.out.println("====================================");

		// 실수 배열 생성
		ArrayList<Double> list2 = new ArrayList<>();

		// 추가 add(값)
		list2.add(10.1);
		list2.add(20.2);
		list2.add(30.3);
		list2.add(200.2);

		// 출력
		System.out.println(list2);

		// 조회 indexOf(값)
		int find2 = list2.indexOf(200.2);
		System.out.println("200.2이 있는 인덱스 번호: " + find2);
		
		// 삭제 remove(인덱스번호)
		list2.remove(find2);
		
		// 출력
		System.out.println(list2);

		System.out.println("====================================");

		// 문자 배열 생성
		ArrayList<String> list3 = new ArrayList<>();

		// 추가 add(값)
		list3.add("나는");
		list3.add("문자열");
		list3.add("이다");

		// 출력
		System.out.println(list3);
		
		
		// 조회 indexOf(값)
		int find3 = list3.indexOf("이다");
		System.out.println("'이다'가 있는 인덱스 번호: " + find3);
		
		// 삭제 remove(인덱스번호)
		list3.remove(find3);
		
		// 출력
		System.out.println(list3);
		
		System.out.println("====================================");
		
		//전부 삭제 clear()
		list3.clear();
		System.out.println(list3);
		
	}

}
