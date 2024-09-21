package org.test;

import java.util.LinkedHashMap;

public class CharachterCoutTest {

	public static void main(String[] args) {

		String s1 = "Hello Welcome to JAVA";

		// count of each characters in defiend string

		// h=1,e=2,l=3,...

		// Key-Chara, Value-Integer

		LinkedHashMap<Character, Integer> lMap = new LinkedHashMap();

		char[] charArray = s1.toCharArray();

		for (char eachCh : charArray) {

			if (lMap.containsKey(eachCh)) {

				Integer value = lMap.get(eachCh);

				lMap.put(eachCh, value + 1);

			} else {
				lMap.put(eachCh, 1);
			}

		}
System.out.println(lMap);
	}
}