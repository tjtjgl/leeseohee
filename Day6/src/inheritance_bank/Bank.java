package inheritance_bank;

public class Bank {

	String accNum;
	String accName;
	int money;
	int pw;

}

class CheckCard extends Bank {
	String cardNum;
	String cardName;
	int cardPw;

	void pay() {
	}

}
