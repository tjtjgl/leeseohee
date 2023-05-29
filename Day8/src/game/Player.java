package game;

import java.util.Random;
import java.util.Scanner;

public abstract class Player {
	
	int hand;
	
	abstract int nextHand();

}


class HumanPlayer extends Player{

	Scanner sc = new Scanner(System.in);
	
	//손 결정 함수
	@Override
	int nextHand() {
		System.out.println("가위(0) 바위(1) 보(2)");
		hand = sc.nextInt();
		return hand;
	}
}

class ComPlayer extends Player{

	Random r = new Random();
	
	@Override
	int nextHand() {
		return r.nextInt(3);
	}
}