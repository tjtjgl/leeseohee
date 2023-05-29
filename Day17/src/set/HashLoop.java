package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashLoop {

	public static void main(String[] args) {

		HashSet<String> hset1 = new HashSet<>();
		hset1.add("로봇");
		hset1.add("신발");
		hset1.add("농구공");

		System.out.println(hset1);

		HashSet<String> hset2 = new HashSet<>();
		hset2.add("야구공");
		hset2.add("축구공");
		hset2.addAll(hset1); // 순서는 마음대로~

		System.out.println(hset2);

		// 이젠 포이치문 있어서 필요없어
		// 컬렉션->순서가 없는 데이터를 뽑아서 반복시키는 반복자 = iterator(): 컬렉션에서 요소를 불러오는 방법
		// hasNExt(): 다음 데이터가 있으면 true, 없으면 false
		// next(): 데이터 반환
		// remove(): next로 불러온 데이터 삭제

		/**인터페이스로 구현되어 있어 iterator 메소드안에서 반복자에 대한 객체를 생성하여 iter 변수에 저장
		Iterator<String> iter = hset2.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		*/
		
		//개꿀
		for(String val : hset2) {
			System.out.println(val);
		}
		
		
	}

}
