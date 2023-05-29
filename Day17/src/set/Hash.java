package set;

import java.util.LinkedList;

class HashTable {

	// key와 value를 저장하는 공간
	class Node {
		String key;
		String value;

		public Node(String key, String value) {
			super();
			this.key = key;
			this.value = value;
		}

		// set
		void value(String value) {
			this.value = value;
		}

		// get
		String value() {
			return this.value;
		}

	}

	// 충돌이 나서 데이터를 저장할 때 사용하는 리스트
	LinkedList<Node>[] data;

	// 해시 테이블에 데이터를 저장하는 개수(배열 길이) 정하기
	public HashTable(int size) {
		this.data = new LinkedList[size];

	}

	// 함수 목적: 문자열 key 받아오면 hashcode로 변환해서 배열의 길이만큼 나눈 나머지값을 인덱스 방 번호로 지정

	// 해시코드값 구하기
	int getHashCode(String key) {

		int hashcode = 0;
		for (char c : key.toCharArray()) { // 하나씩 아스키코드로 변환해서 c에 줌
			hashcode += c;
		}
		return hashcode;
	}

	// 더한 해시코드 값을 인덱스 방번호로 변환
	int convertToIndex(int hashcode) {
		return hashcode % data.length;
	}

	Node searchKey(LinkedList<Node> list, String key) {
		if (list == null)
			return null;

		for (Node node : list) {
			if (node.key.equals(key)) {
				return node;
			} else
				return null;
		}
		return null;
	}

	/**
	 * put() 메서드는 key와 value를 받아서 해시 테이블에 저장하는 역할을 합니다. key를 해시 함수로 변환하여 인덱스 방 번호를
	 * 구하고, 해당 인덱스 방에 리스트가 없으면 새로운 리스트를 생성하여 값을 저장합니다. 리스트가 이미 존재하면, 해당 리스트에서 key와
	 * 일치하는 노드를 검색하여 값을 업데이트하거나, 새로운 노드를 추가합니다.
	 */
	void put(String key, String value) {
		int hashcode = getHashCode(key);
		int index = convertToIndex(hashcode);
		LinkedList<Node> list = data[index];

		if (list == null) {
			list = new LinkedList<>();
			data[index] = list;
		} else {
			Node node = searchKey(list, key);
			if (node == null) {
				list.addLast(new Node(key, value));
			} else {
				node.value(value);
			}
		}
	}

	String get(String key) {
		int hashcode = getHashCode(key);
		int index = convertToIndex(hashcode);
		LinkedList<Node> list = data[index];
		Node node = searchKey(list, key);
		return node == null ? "Not found" : node.value();
	}

}// 클래스 끝

public class Hash {

	public static void main(String[] args) {

		// isEmpty(): 데이터가 있는지 없는지
		// contains(): 지정된 key가 있는지 검색
		// getOrDrfault(): key가 있으면 value 값 반환

	}

}
