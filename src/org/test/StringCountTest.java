package org.test;

import java.util.LinkedHashMap;

public class StringCountTest {

	public static void main(String[] args) {

		String s2 = "Hey Hello Welocme to here, How are you buddy? Hey Hello Welocme to here, How are you buddy?";

		LinkedHashMap<String, Integer> lMap = new LinkedHashMap();

		String[] strArray = s2.split(" ");

		for (String eachString : strArray) {
			if (lMap.containsKey(eachString)) {
				Integer value = lMap.get(eachString);

				lMap.put(eachString, value + 1);
			}

			else {
				lMap.put(eachString, 1);
			}
		}
		System.out.println(lMap);

	}

}
