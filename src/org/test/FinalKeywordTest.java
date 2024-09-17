package org.test;

import java.lang.reflect.Method;

public  class FinalKeywordTest {

	//final int a = 100;

	public final void testOne() {

//		this.a = 200;

	}

	public void testTwo() {
//		System.out.println(a);

	}

	public static void main(String[] args) {
		FinalKeywordTest obj = new FinalKeywordTest();
		obj.testOne();
		obj.testTwo();
	}

}
