
class Parent {

	int money; // 상속금액
	private int amount; // 비상금

	Parent() {
		money = 1000000000;
		amount = 10000000;
	}
	
	int getMoney(String s) {
		if(s.equals("허락")) {
			this.amount -= 1000000; 
			System.out.println(this.amount);
			return 1000000;
		}else {
			System.out.println("미안하다");
			return 0;
		}
	}
	
	void setMoney(int amount) {
		this.amount += amount;
	}
	
}

class Children extends Parent {

}

public class Main {

	public static void main(String[] args) {

		Parent p1 = new Parent();
		System.out.println(p1.money);
		
		Children c1 = new Children();
		
		Parent p2 = c1;
		
		p1.getMoney("허락");
		
		
	}

}
