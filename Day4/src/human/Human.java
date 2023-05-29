package human;

class Human {
	private String name;
	private int height;
	private int weight;

	Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	// 값 불러오기
	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	// 살찌는함수
	void gainWeight(int w) {
		this.weight += w;
		System.out.println("살이 "+w+"kg 쪘습니다.");
	}
	
	// 살빠지는함수
	void reduceWeight(int w) {
		this.weight -= w;
		System.out.println("살이 "+w+"kg 빠졌습니다.");
	}
	
	void showInfo() {
		System.out.println("이름: "+name);
		System.out.println("키: "+height);
		System.out.println("몸무게: "+ weight);
	}
	
	

}


