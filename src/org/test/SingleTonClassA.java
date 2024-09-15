package org.test;

public class SingleTonClassA {

	public void lauchChromeBrowser() {
		System.out.println("lauchChromeBrowser");

	}

	// Step 1: create a variable or object or instacne

	private static SingleTonClassA singleTon_Variable = null;

	// Step: create a method static synchronized

	public static synchronized SingleTonClassA singleTonMethod() {
		
		if(singleTon_Variable== null)
		{
			singleTon_Variable = new SingleTonClassA();
		}
		
		return singleTon_Variable ;

	}

}
