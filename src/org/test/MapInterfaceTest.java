package org.test;

import java.util.Hashtable;
import java.util.LinkedHashMap;

public class MapInterfaceTest {

	public static void main(String[] args) {

		// HashMap hmap = new HashMap();
		LinkedHashMap hmap = new LinkedHashMap();

		// Hashtable hmap = new Hashtable();

		hmap.put("StudentName", "Vasan");

		hmap.put("StudentName1", "Vasan");
		
		
		hmap.put("StudentName2", "Vasan");
		
		
		hmap.put("studentId", 101);

		hmap.put("address", "chennai");

		hmap.put("mobileNumber", 9095702844l);

		hmap.put("TotalMarks", 465.5f);

		System.out.println(hmap);

		System.out.println(hmap.get("studentId"));

		boolean containsKey = hmap.containsKey("StudentName");

		boolean containsValue = hmap.containsValue(102);

		System.out.println(containsKey);

		System.out.println(containsValue);
		
		
		

	}

}
