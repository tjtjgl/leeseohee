package array;

public class ArrayEx04 {

	public static void main(String[] args) {

		
		String name1 = "이서희";
		String name2 = "이지희";
		String name3 = "이서희";
		
		//name1=name2?
	
		boolean res = name1.equals(name3);
		System.out.println(res);
		if(name1==name2)
			System.out.println(true);
		else 
			System.out.println(false);
		

		// name1=name3?
		if(name1==name3) {
			name1 = "강동원";
			System.out.println(name1);
		} else 
			System.out.println(false);
		
	
	}

}
