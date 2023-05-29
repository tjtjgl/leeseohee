package override;

public class CoffeeStore {

	Drink[] orderList = new Drink[3];

	public static void main(String[] args) {
//		Coffee c1 = new Coffee("커피");
//
//		Tea t1 = new Tea("티");
//
//		Juice j1 = new Juice("주스");

//		Drink d1 = c1;
//		Drink d2 = t1;
//		Drink d3 = j1;

		CoffeeStore store = new CoffeeStore();
		
		store.orderList[0] = new Coffee("커피");
		store.orderList[1] = new Tea("티");
		store.orderList[2] = new Juice("주스");
		
		for (Drink d : store.orderList) {
			d.ordered();
		}

//		for (int i=0 ; i<orderList.length ; i++) {
//			cs.orderList[i].ordered();
//		}
//		
	}
}

class Drink {
	String name;
	int price;

	Drink(){}
	Drink(String name) {
		this.name = name;
	}

	void ordered() {
		System.out.println(this.name + "이(가) 주문되었습니다.");
	}
}

class Coffee extends Drink {

	Coffee(String name) {
		super(name);
	}
}

class Tea extends Drink {

	Tea(String name) {
		super(name);
	}
}

class Juice extends Drink {

	Juice(String name) {
		super(name);
	}
}
