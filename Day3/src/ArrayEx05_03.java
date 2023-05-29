
public class ArrayEx05_03 {

	public static void main(String[] args) {

		int[][] apt = { { 101, 102, 103 }, { 201, 202, 203 }, { 301, 302, 303 } };

		int[][] pay = { { 1000, 2100, 1300 }, { 4100, 2000, 1000 }, { 3000, 1600, 800 } };

		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400

		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		for (int i = 0; i < pay.length; i++) {
			if (i == 0) {
				for (int j = 0; j < 3; j++) {
					sum1 += pay[i][j];
				}
			}
			if (i == 1) {
				for (int j = 0; j < 3; j++) {
					sum2 += pay[i][j];
				}

			}
			if (i == 2) {
				for (int j = 0; j < 3; j++) {
					sum3 += pay[i][j];
				}
			}
		}
		System.out.println(sum1 + "," + sum2 + "," + sum3);

		// 문제 2) 호를 입력하면 관리비 출력
		// 예 2) 입력 : 202 관리비 출력 : 2000

		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)

		// 문제 4) 호 2개를 입력하면 관리비 교체

	}

}
