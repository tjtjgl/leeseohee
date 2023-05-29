
public class SortEx01 {

	public static void main(String[] args) {

		// 버블정렬 1,2 비교 2,3 비교 3,4 비교 ... 반복

		// step1) 값 교체 식
		int a = 10;
		int b = 20;
		int tmp = 0;// 임시저장공간

		tmp = a;
		a = b;
		b = tmp;

		System.out.println(a);
		System.out.println(b);

		// step2) 배열에 적용
		int[] arr = { 3, 6, 1, 5, 2 };

		for (int i = 0; i < arr.length; i++) {

			// 비교해서 바꿔주는 for문
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp1 = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp1;
				}
			}
		}

		// 순서가 있는 자료형 출력하는 for문 for(자료형 변수명 : 여러개를 저장하는 자료형){}
		for (int value : arr) {
			System.out.println(value);
		}

	}
}

