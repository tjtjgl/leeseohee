import java.util.Arrays;
import java.util.Collections;

public class SortEx02 {

	public static void main(String[] args) {

		int[] lst = { 1, 26, 17, 100, 8, 44, 20 };

		// 이미 Array 함수 존재
		// sort(배열명);, 무조건 오름차순
		Arrays.sort(lst);

		// 내림차순으로 정렬 reverseOrder()
		// 함수가 기본타입은 정렬하고 내림차순 하지 않는다.
		// 그래서 객체화 시키는 래퍼클래스를 이용한다.
		// Arraylist 타입을 정할때 기본타입이 들어가지 않는다.
		Integer[] lst2 = { 1, 26, 17, 100, 8, 44, 20 };
		Arrays.sort(lst2, Collections.reverseOrder());

		// 전체 출력 toString(배열명);
		Arrays.toString(lst);
		System.out.println(Arrays.toString(lst));

		// for문으로 출력해보기
		for (int num : lst) { // 행 한줄 전체 출력
			System.out.print(num + " ");
		}
		System.out.println();
	}

}
