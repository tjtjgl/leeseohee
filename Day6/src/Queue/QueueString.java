package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueString {

	public static void main(String[] args) {

		Queue<String> qu = new LinkedList<>();

		qu.offer("뽀로로");
		qu.offer("크롱");
		qu.offer("루피");
		qu.offer("포비");

		while (!qu.isEmpty())
			System.out.println(qu.poll());

	}

}
