package org.test;

public class SuperKeywordClassTwo  extends SuperKeywordClassA{
	
	
	public void testOne() {
		int a =200;
		System.out.println(super.a);
		super.testOne();
		//System.out.println("hello world2");
	}

	public void testTwo() {
		
		super.testTwo();
		//System.out.println("welocme2");

	}
	public static void main(String[] args) {
		
		SuperKeywordClassTwo obj = new SuperKeywordClassTwo();
		
		obj.testOne();
		
		obj.testTwo();
	}

}
