package inheritance_currency;

class KRW extends Currency {

	KRW(double amount, String notation) {
		super(amount, notation);
	}

	@Override
	public String toString() {
		// 객체 정보를 문자열로 반환
		return String.format("KRW: %.2f %s", amount, notation); // 포맷을 지정하기 위해선 String.format 사용
	}

}

class USD extends Currency {

	USD(double amount, String notation) {
		super(amount, notation);
	}

	@Override
	public String toString() {

		return String.format("USD: %.2f %s", amount, notation);
	}

}

class EUR extends Currency {

	EUR(double amount, String notation) {
		super(amount, notation);
	}

	@Override
	public String toString() {
		return String.format("EUR: %.2f %s", amount, notation);
	}

}

public class Currency {

	// 수량 amount
	// 표기법 (원,유로,엔)
	double amount;
	String notation;

	Currency(double amount, String notation) {
		this.amount = amount;
		this.notation = notation;
	}

	public static void main(String[] args) {

		KRW k = new KRW(5000.00, "원");
		System.out.println(k);

		USD u = new USD(5000.00, "달러");
		System.out.println(u);
		
		EUR e = new EUR(5000.00, "유로");
		System.out.println(e);


	}
}
