import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		HashMap<String, Integer> map1 = new HashMap<>();
		// put()으로 저장
		map1.put("오십", 50);
		map1.put("십", 10);
		map1.put("삼십", 30);
		map1.put("사십", 40);
		map1.put("십", 1000);
		map1.put("육십", 10);

		// 이름, 폰번호
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("이서희", "01038593561");
		map2.put("강건우", "01073852208");
		map2.put("홍길동", "01012345678");

		System.out.println(map1);
		System.out.println("=============================");
		System.out.println(map2);

		// 부분출력: get(key값) key의 value가 출력
		System.out.println(map1.get("삼십"));
		System.out.println(map2.get("이서희"));

		// key 값만 출력: keySet(), set 계열로 데이터를 뽑아옴
		System.out.println(map1.keySet());

		//키를 기준으로 찾기
		for (String key : map1.keySet()) {
			System.out.println(key + "!!!" + map1.get(key));
		}

		// 키 검색
		String q = "육십";
		boolean res = false;

		for (String key : map1.keySet()) {
			if (q.equals(key)) {
				System.out.println("찾는 키가 있습니다.");
				res = true;
			}
		}

		if (res) {
			System.out.println("키 있음");
		} else
			System.out.println("키 없음");
	}
}
