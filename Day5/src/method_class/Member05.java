package method_class;

import java.util.ArrayList;
import java.util.Arrays;

class Objection3 {

	String obj;
	int pay;

	public Objection3() {}

	public Objection3(String obj, int pay) {
		this.obj = obj;
		this.pay = pay;
	}

}

public class Member05 {

	public static void trainPrint(Objection3 list) {
		
		new Objection3(); 


	}

	public static void main(String[] args) {

		// 경주,
		Objection3 o1 = new Objection3("경주", 30000);

		// 포항
		Objection3 o2 = new Objection3("포항", 28000);

		// 거제도
		Objection3 o3 = new Objection3("거제도", 40000);

		//배열
		Objection3[] list = new Objection3[3];
		
		//어레이리스트		
		
			
		ArrayList<Objection3> list1 = new ArrayList<>();
		list1.add(o1);
		list1.add(o2);
		list1.add(o3);

		for (Objection3 val : list1) {
			System.out.println(val.obj);
			//System.out.println(val.pay);
		}
		
		System.out.println(o1.obj);
		System.out.println(list1.get(0).obj);
		
		System.out.println(o2.obj);
		System.out.println(list1.get(1).obj);
		
		System.out.println(o3.obj);
		System.out.println(list1.get(2).obj);
		
	}

}

//		list[0]=o1;
//		list[1]=o2;
//		list[2]=o3;
//		
//		System.out.println(o1.obj);
//		System.out.println(list[0].obj);
//		
//		System.out.println(o2.obj);
//		System.out.println(list[1].obj);
//		
//		System.out.println(o3.obj);
//		System.out.println(list[2].obj);
//		