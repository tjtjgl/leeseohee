package MVC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class FarmController {

	private HashMap<Farm, Integer> h = new HashMap<>();
	private ArrayList<Farm> list = new ArrayList<>();

	// 함수시작
	boolean addNewKind(Farm f, int amount) {

		h.put(f, amount);
		if (h.containsKey(f)) {
			return true;
		}
		return false;
	}

	boolean removeKind(Farm f) {
		for (Farm val : h.keySet()) {
			if (f.equals(val)) {
				h.remove(val);
			} else {
				return false;
			}
		}
		return true;
	}

	boolean changeAmount(Farm f, int amount) {
		for (Farm val : h.keySet()) {
			if (f.equals(val)) {
				h.replace(f, amount);
				return true;
			}
		}
		return false;
	}

	HashMap<Farm, Integer> printFarm() {
		for (Farm val : h.keySet()) {
			System.out.println(val + "(" + h.get(val) + ")");
		}
		return h;
	}

	boolean buyFarm(Farm f) {

		if (h.containsKey(f)) {
			// int amount = h.get(f) - 1);
			h.replace(f, h.get(f) - 1);
			list.add(f);
			return true;
		}

		return false;
	}

	boolean removeFarm(Farm f) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == f) {
				list.remove(f);
				// int amount = h.get(f) + 1;
				h.replace(f, h.get(f) + 1);
				return true;

			}
		}
		return false;
	}

	ArrayList<Farm> printBuyFarm() {
		Iterator<Farm> iter = list.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		return list;
	}

}
