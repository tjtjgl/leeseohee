package interface_package_Mart;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Discount 족발 = new Food(19800);
		Discount 에어팟 = new Electronic(199000);
		Discount 셔츠 = new Clothes(49900);
		
		ArrayList<Discount> list = new ArrayList<>();
		
		list.add(족발);
		list.add(에어팟);
		list.add(셔츠);
		
		int size = list.size();
		int total =0;
		
		for(int i=0; i < size ; i++) {
			total += list.get(i).discount();
		}
		
		System.out.println(total + "원");
	}
}

class Mart {

	int price;
	int disPrice;
	
	Mart(int price){
		this.price = price;
	}

	
}

class Food extends Mart implements Discount {
	Food(int price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int discount() {
		disPrice = (int) ((this.price) - ((this.price) * 0.1));
		return disPrice;
	}
}

class Electronic extends Mart implements Discount {
	Electronic(int price) {
		super(price);
	}

	@Override
	public int discount() {
		disPrice = (int) ((this.price) - ((this.price) * 0.2));
		return disPrice;
	}
}

class Clothes extends Mart implements Discount {
	Clothes(int price) {
		super(price);
	}

	@Override
	public int discount() {
		disPrice = (int) ((this.price) - ((this.price) * 0.3));
		return disPrice;
	}
}
