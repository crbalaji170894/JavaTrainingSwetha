package org.test;

public class StringTest {

	public static void main(String[] args) {

		String test = "Welcome to My home Today";

//		int len = test.length(); //Done
//		
//		System.out.println(len);

		// W E L C O M E
		// 0 1 2 3 4 5 6

		// char ch = test.charAt(4);

		// System.out.println(ch);

//		for (int i = 0; i < test.length(); i++) {
//
//			char ch = test.charAt(i);
//
//			if (ch == 'o') {
//				System.out.println(i);
//			}
//
//			//System.out.println(ch);
//		}
//		
//		String s2 = "google";
//		
//		String upperCase = s2.toUpperCase();
//		
//		System.out.println(upperCase);

		String url = "https://www.google.com/";

		if (url.startsWith("https://")) {
			System.out.println("The url is secured URL");
		}

		else {
			System.out.println("The url is not secured");
		}

		String url1 = "https://www.google.com/";

		if (url.endsWith(".com/")) {
			System.out.println("The url is valid URL");
		}

		else {
			System.out.println("The url is not valid");
		}
	}
}
