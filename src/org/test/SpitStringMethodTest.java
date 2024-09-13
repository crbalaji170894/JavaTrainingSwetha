package org.test;

public class SpitStringMethodTest {

	public static void main(String[] args) {
		String s = "Hai Welcome To Java Class Hai Welcome To Java Class";

		System.out.println(s);

		// hai
		// welcome
		// to
		// java
		// class

		// int a[]= {10,20,30};

		//String split[] = s.split(" ");\
	String split[]= s.split("Class");

//		for (int i = 0; i < split.length; i++) {
//			System.out.println(split[i]);
//		}
		
		for(String eachValue:split) {
			
			System.out.println(eachValue);
			
		}
		
		

	}

}
