package method;

import java.util.Scanner;

public class Reservation {

	public static int objection(String dst1) {

		String dsts[] = { "수원", "춘천", "대전", "광주", "대구", "부산" };
		int pays[] = { 3000, 5000, 25000, 35000, 35000, 40000 };

		int size = dsts.length;
		int index = 0;

		for (int i = 0; i < size; i++) {
			if (dst1.compareTo(dsts[i]) == 0) {
				index = i;
			}
		}
		int pay = pays[index];

		return pay;

	}

	public static int train(String train_name) {

		String trains[] = { "ktx", "srt", "무궁화호", "새마을호"};
		int pays[] = { 10000,5000,1000,2000 };

		int size = trains.length;
		int index = 0;

		for (int i = 0; i < size; i++) {
			if (train_name.compareTo(trains[i]) == 0) {
				index = i;
			}
		}
		int pay = pays[index];

		return pay;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("목적지를 입력하세요>");
		String dst = sc.nextLine();

		System.out.println("열차 종류를 입력하세요>");
		String train = sc.nextLine();

		int pay = objection(dst);
		int train_pay = train(train);

		System.out.println(dst + "까지의 운임료는 " + pay + "원 입니다.");
		System.out.println(train + " 열차를 타면 총 운임료는 " + (pay + train_pay) + "원 입니다.");
	}
}
