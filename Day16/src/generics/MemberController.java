package generics;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MemberController {

	private HashMap<String, Member> map = new HashMap<>();
	
	void initAdd() {
		Member m1 = new Member("이서희","111");
		Member m2 = new Member("이서희","222");
		Member m3 = new Member("이서희","333");
		map.put("seohee", m1);
		map.put("gw", m2);
		map.put("sh", m3);
	}

	boolean joinMembership(String id, Member m) {

		map.put(id, m);
		boolean res = map.containsKey(id);

		return res;
	}

	boolean login(String id, String pass) {

		if (map.containsKey(id) && pass.equals(map.get(id).getPass())) {
			return true;
		}
		return false;
	}

	boolean changePassword(String id, String oldPw, String newPw) {
		if (map.containsKey(id) && oldPw.equals(map.get(id).getPass())) {
			map.get(id).setPass(newPw);
			return true;
		}
		return false;
	}

	boolean changeName(String id, String newName) {
		if (map.containsKey(id)) {
			map.get(id).setName(newName);
			return true;
		}
		return false;
	}

	TreeMap<String, Member> sameName(String name) {

		TreeMap<String, Member> list = new TreeMap<>();
		for (String s : map.keySet()) {
			Member m = map.get(s);
			if (m.getName().equals(name)) {
				list.put(s, m);
				System.out.println("ID "+ s+"-" +name);
			}
		}
		return list;
	}
}
