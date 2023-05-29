package totalex;

public class Account implements kakao {
	
	String accNum;
	String name;
	static int id =1;
	int idNew;
	
	public Account(String accNum, String name) {
		this.accNum = accNum;
		this.name = name;
		this.idNew = Account.id++;
	}
	
	@Override
	public String toString() {
		return "ID: "+ idNew +"\n계좌번호: "+ accNum+"\n이름: "+name; 
	}
	
}
