package thread_synchronized;

public class Main {

	public static void main(String[] args) {
		
		Account ac1 = new Account();
		
		ATM seohee = new ATM("나",1234,ac1);
		ATM mother = new ATM("엄마",3456,ac1);
		ATM father = new ATM("아빠",7541,ac1);
		
		seohee.start();
		mother.start();
		father.start();
	
	}

}

//		Washroom wr = new Washroom();
//		
//		FamilyThread father = new FamilyThread("아빠", wr);
//		FamilyThread mother = new FamilyThread("엄마", wr);
//		FamilyThread brother = new FamilyThread("오빠", wr);
//		FamilyThread me = new FamilyThread("나", wr);
//		
//		father.start();
//		mother.start();
//		brother.start();
//		me.start();