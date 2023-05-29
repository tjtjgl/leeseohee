package exception_stock;

import java.util.Scanner;

public class StockManager {

	int stockNum;

	Scanner sc = new Scanner(System.in);

	public StockManager(int stockNum) {
		this.stockNum = stockNum;
	}

	// =====내가 못푼 부분=====수량 업데이트 함수=====
	void updateStock() throws MyException {
		System.out.println("수량 입력: ");
		int num = sc.nextInt();
		subStock(num);
	}

	void subStock(int amount) throws MyException {
		if (amount > this.stockNum) {
			throw new MyException("재고가 부족합니다.");
		} else {
			this.stockNum -= amount;
			System.out.println("남은 수량은 " + amount + "개 입니다.");
		}
	}

	public static void main(String[] args) {
		StockManager st = new StockManager(500);
		try {
			st.updateStock();
		} catch (MyException e) {
			System.out.println("에러 발생");
			System.out.println(e);
		}
	}
}
