package org.test;

import java.util.ArrayList;

public class ListInterface {

	public static void main(String[] args) {

		ArrayList arrayLi = new ArrayList();
		
	
		arrayLi.add(true);

		arrayLi.add(10);

		arrayLi.add("test");

		arrayLi.add(10.5f);

		arrayLi.add(9095702844l);

		arrayLi.add(true);

		arrayLi.add(10);

		arrayLi.add("test");

		arrayLi.add(10.5f);

		arrayLi.add(9095702844l);
		
		System.out.println(arrayLi);
		
		System.out.println(arrayLi.get(1));
		
		for( Object each:arrayLi)
		{
			System.out.println(each);
		}

		int size = arrayLi.size();
		
		System.out.println(size);
		
		 arrayLi.remove(5);
		 
		 System.out.println(arrayLi);
		 
		 
		 boolean contains = arrayLi.contains("test1");
		 
		 System.out.println(contains);
		 
		 System.out.println(arrayLi.indexOf(10));
		 
		 System.out.println(arrayLi.lastIndexOf(10));
		 
		 boolean empty = arrayLi.isEmpty();
		 
		 System.out.println(empty);
	
		 ArrayList arrayLi2 = new ArrayList();
		 

		 arrayLi2.add("test");

		 arrayLi2.add(10.5f);
		 
		 arrayLi.removeAll(arrayLi2);
		 
		 System.out.println(arrayLi);
		 
		 arrayLi.clear();
		 
		 System.out.println(arrayLi);
		 
 boolean emptyq= arrayLi.isEmpty();
		 
		 System.out.println(emptyq);
	
	
	}
	
	
	


}
