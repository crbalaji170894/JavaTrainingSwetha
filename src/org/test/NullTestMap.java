package org.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class NullTestMap {

	public static void main(String[] args) {

		HashMap hMap = new HashMap();

		hMap.put(null, "test");

		hMap.put(null, "test1");

		hMap.put(101, null);

		hMap.put(102, null);

		System.out.println(hMap);

		LinkedHashMap lMap = new LinkedHashMap();

		lMap.put(null, "test");

		lMap.put(null, "test1");

		lMap.put(101, null);

		lMap.put(102, null);

		System.out.println(lMap);

		TreeMap tMap = new TreeMap();

		tMap.put(103, "test");

		tMap.put(104, "test1");

		tMap.put(101, null);

		tMap.put(102, null);

		System.out.println(tMap);

		Hashtable htableMap = new Hashtable();

		htableMap.put(102, "test");

		htableMap.put(104, "test1");

		htableMap.put(101, 56);

		

		System.out.println(htableMap);
	}

}
