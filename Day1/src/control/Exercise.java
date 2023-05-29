package control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class Exercise {

	public static void main(String[] args) {

		ArrayList<String> test = new ArrayList<>();
		test.add("아");
		test.add("A");
		test.add("바보");
		test.add("월급");
		test.add("시험");
		
		StringJoiner joiner = new StringJoiner(", ","시작: "," :끝");
		
        for (String str : test) {
           joiner.add(str);
        }

		System.out.println(joiner.toString());
	}

}
