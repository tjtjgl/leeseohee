package method;

public class Atm {

	//현재 잔고와 입금하고싶은 금액
	public static int 입금(int orgM, int addM) {
		orgM += addM;
		System.out.println("입금완료");
		return orgM;
		
	}
	
	
	public static void main(String[] args) {

		int orgM = 10000;
	
		//입금
		입금(orgM, 100000000);
		
		//입금하고난 총 잔액
		System.out.println(입금(orgM,10000000));
	}

}
