package generic;

public class Cup<T> {
	
	//컵은 여러개의 음료를 담을 수 있다.
	//안에 들어가는 내용물
	Object obj;
	T obj2;
	
}

class Coffee {}
class Americano extends Coffee {}
class CafeLatte extends Coffee {}
class CafeMoca extends Coffee {}


class Milk{}
class Water{}
class Juice{}