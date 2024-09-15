package org.test;

public class LiteralNonLiteralString {

	public static void main(String[] args) {

		String s1 = "comcast";

		String s2 = "amzon";

		String s3 = "comcast";

		// Literal String

		// stores inside heap memory

		// incase of duplicates values it allocates the same memory location

		System.out.println(System.identityHashCode(s1));

		System.out.println(System.identityHashCode(s2));

		System.out.println(System.identityHashCode(s3));

		String s4 = new String("HiWelcome");

		String s5 = new String("HiWelcome");

		System.out.println(System.identityHashCode(s4));

		System.out.println(System.identityHashCode(s5));
		
		StringBuffer s6 =new StringBuffer("HAI Welcome");
		
		StringBuffer s7 =new StringBuffer("JAVA Class");
				
		System.out.println(System.identityHashCode(s6));

		System.out.println(System.identityHashCode(s7));
		
		StringBuffer s8= s6.append(s7);
		
		System.out.println(System.identityHashCode(s8));
	}

}
