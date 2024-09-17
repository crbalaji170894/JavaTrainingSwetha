package org.test;

public class TestConstructor {

	TestConstructor() { // constructor
		System.out.println("Default Constructor");
	}
	
	TestConstructor(int a, String b, boolean y)
	{
		System.out.println("Parameterize construtor");
	}
	

	public static void main(String[] args) {
		TestConstructor obj = new TestConstructor();
		
		TestConstructor obj1 = new TestConstructor(10, "test", true);

	}

}
