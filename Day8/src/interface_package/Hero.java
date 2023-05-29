package interface_package;

public interface Hero {

	//public static final 생략
	//체력
	int maxHP = 100;
	
	//공격력
	void attack();
	//치료
	void heal(int portion);
	
	
}
