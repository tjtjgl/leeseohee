package accout;

class Wallet{
	private int money;
	
//	Wallet(int money){
//		this.money = money;
//	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	

}

public class MainTest {

	public static void main(String[] args) {
		
		Wallet seohee = new Wallet();
		
		seohee.setMoney(50000);
		System.out.println(seohee.getMoney());

	}

}
