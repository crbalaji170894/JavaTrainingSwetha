package org.test;

public class StringClassTwoTest {

	public static void main(String[] args) {
		
		String s = "Hai welcome to the JAVA Training";
		
		int firstIndex = s.indexOf('o');
		
		System.out.println(firstIndex);
		
		int lastIndex = s.lastIndexOf('o');
		
		System.out.println(lastIndex);
		
		String s2 = "welcome";
		
		String s3 = "welCome";
		
		boolean value = s2.equals(s3);
		
		System.out.println(value);
		
		boolean value2 = s2.equalsIgnoreCase(s3);
		
		System.out.println(value2);
		
		String url = "https://www.google.com/";
		
		boolean value3 = url.contains("www.");
		
		System.out.println(value3);
		
		
		
		

	}

}
