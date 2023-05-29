package interface_package;

public abstract class Card {

	private String cardNum;
	String cardName;
	private String cardPw;
	private int cvc;

	abstract void pay();

	abstract void save();

	// setter, getter
	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getCardPw() {
		return cardPw;
	}

	public void setCardPw(String cardPw) {
		this.cardPw = cardPw;
	}

	public int getCvc() {
		return cvc;
	}

	public void setCvc(int cvc) {
		this.cvc = cvc;
	}
}

//쇼핑,주유,영화,놀이동산
interface Shopping {
	void shop();
}

interface Gas {
	void gas();
}

interface Movie {
	void movie();
}

interface Park {
	void park();
}

//쇼핑+주유
class HyundaiCard extends Card implements Shopping, Gas {

	@Override
	void pay() {
		System.out.println("현대카드 결제");
	}

	@Override
	void save() {
		System.out.println("현대카드 적립");
	}

	@Override
	public void gas() {
		System.out.println("현대카드로 주유 시 10% 할인");
	}

	@Override
	public void shop() {
		System.out.println("현대카드로 쇼핑 시 20% 할인");
	}
}

//삼성카드, 놀이동산
class SamsungCard extends Card implements Park {

	@Override
	public void park() {
		System.out.println("삼성카드로 놀이공원 방문 시 35% 할인");
	}

	@Override
	void pay() {
		System.out.println("삼성카드 결제");
	}

	@Override
	void save() {
		System.out.println("삼성카드 적립");
	}

}

//롯데카드, 모든기능
class LotteCard extends Card implements Shopping, Gas, Movie, Park {

	@Override
	public void park() {
		System.out.println("롯데카드로 놀이공원 방문 시 30% 할인");
	}

	@Override
	public void movie() {
		System.out.println("롯데카드로 영화 관람 시 50% 할인");
	}

	@Override
	public void gas() {
		System.out.println("롯데카드로 주유 시 3% 할인");
	}

	@Override
	public void shop() {
		System.out.println("롯데카드로 쇼핑 시 5% 할인");
	}

	@Override
	void pay() {
		System.out.println("롯데카드 결제");
	}

	@Override
	void save() {
		System.out.println("롯데카드 적립");
	}

}