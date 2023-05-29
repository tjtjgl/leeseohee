package variable;

class Player {
	String name;
	int[] points;

	public Player(String name, int[] points) {
		this.name = name;
		this.points = points;

	}

	void printTotalPoints() {
		System.out.println(this.name + " -> " + totalPoints() + "점");
	}

	int totalPoints() {
		int sum = 0;
		for (int val : points) {
			sum += val;
		}
		return sum;
	}
}

public class PlayerTest {

	public static void main(String[] args) {
		int[] points0 = { 10, 9, 9, 8 };
		int[] points1 = { 9, 10, 9, 9 };
		int[] points2 = { 10, 9, 10, 10 };

		Player[] lst = new Player[3];
		lst[0] = new Player("Kim", points0);
		lst[1] = new Player("Lee", points1);
		lst[2] = new Player("Park", points2);

		for (Player val : lst) {
			val.printTotalPoints();
		}
	}
}
