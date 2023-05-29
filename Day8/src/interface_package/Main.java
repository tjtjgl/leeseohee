package interface_package;

public class Main {

	public static void main(String[] args) {
		
//		HyundaiCard h1 = new HyundaiCard();
//		h1.pay();
//		h1.gas();
//		h1.shop();
//		
//		SamsungCard s1 = new SamsungCard();
//		s1.pay();
//		s1.park();
//		
//		LotteCard l1 = new LotteCard();
//		l1.pay();
//		l1.shop();
//		l1.park();
//		l1.movie();
//		l1.gas();
		
		Hulk hulk = new Hulk();
		hulk.attack();
		hulk.jump();
		hulk.heal(300);
		
		
		CaptainAmerica capA = new CaptainAmerica();
		capA.attack();
		capA.muster();
		capA.heal(300);
		

	}

}
