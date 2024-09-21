package org.test;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetTest {

	public static void main(String[] args) {

		LinkedHashMap lMap = new LinkedHashMap();
		
		
		lMap.put("StudentName", "Vasan");

		lMap.put("studentId", 101);

		lMap.put("address", "chennai");

		lMap.put("mobileNumber", 9095702844l);

		lMap.put("TotalMarks", 465.5f);
		
		System.out.println(lMap);
		
		Set<Entry<Object,Object>> entrySet = lMap.entrySet();
		
		for(Entry<Object,Object> eachEntry:entrySet) {
//			System.out.println(eachEntry.getKey());
			
			System.out.println(eachEntry.getValue());
		}
		

	}

}
