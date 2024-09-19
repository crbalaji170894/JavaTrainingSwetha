package org.test;

import java.util.HashSet;
import java.util.TreeSet;

public class SetInterfaceTest {

	public static void main(String[] args) {

		HashSet hset = new HashSet();
		
		HashSet<Boolean> hSet1 = new HashSet();
		
		hSet1.add(true);
		
		//LinkedHashSet hset = new LinkedHashSet();

		hset.add(10);

		hset.add("test");

		hset.add(true);

		hset.add(10.4f);

		hset.add("Chennai");
		
		hset.add(10);

		hset.add("test");

		hset.add(true);

		hset.add(10.4f);

		hset.add("Chennai");
		
		hset.remove("Chennai");
		
		System.out.println(hset);
		
		TreeSet tSet = new TreeSet();
		
		tSet.add(100);
		
		
		tSet.add(10);
		
		tSet.add(150);
		
		tSet.add(80);
		
		tSet.add(230);
		
		System.out.println(tSet);

	}

}
