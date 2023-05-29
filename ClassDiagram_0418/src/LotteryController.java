import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class LotteryController {

	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet<Lottery> win;

	boolean insertObject(Lottery l) {
		if (lottery.contains(l)) {
			return false;
		}
		return lottery.add(l);
	}

	boolean deleteObject(Lottery l) {

		if (win.contains(l)) {
			win.remove(l);
		}

		return lottery.remove(l);
	}

	HashSet<Lottery> winObject() {
		if (lottery.size() < 4) {
			return null;
		}
		ArrayList<Lottery> list = new ArrayList<>();
		for (Lottery val : lottery) {
			list.add(val);
		}

		win = new HashSet<>();

		for (int i = 0; i < 4; i++) {
			Random r = new Random();
			int num = r.nextInt(list.size());
			
			if (!(win.contains(list.get(num)))) {
				win.add(list.get(num));
			} else {
				i--;
				}
		}
		
		return win;
	}

	TreeSet<Lottery> sortedObject() {
		TreeSet<Lottery> ts = new TreeSet<>();

		for (Lottery val : win) {
			ts.add(val);
		}

		return ts;
	}

	boolean searchWinner(Lottery l) {
		if (!(win.contains(l))) {
			return false;
		}

		return true;
	}

}
