package org.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsTest {

	public void testOne() {

		Pattern ptrn = Pattern.compile(".s");

		Matcher matcher = ptrn.matcher("as");

		boolean matches = matcher.matches();

		System.out.println(matches);
		
		boolean matches2 = Pattern.compile(".s").matcher("as").matches();
		
		System.out.println(matches2);
		
		boolean matches3 = Pattern.matches(".as", "as");
		
		System.out.println(matches3);

	}
	
	public void exampleTwoCharSequence() {
		System.out.println(Pattern.matches("[amn]", "abcd"));// false
		System.out.println(Pattern.matches("[amn]", "amn"));// false

		System.out.println(Pattern.matches("[amn]", "a"));
		System.out.println(Pattern.matches("[amn]", "m"));
		System.out.println(Pattern.matches("[amn]", "n"));// true

		System.out.println(Pattern.matches("[^amn]", "a"));
		System.out.println(Pattern.matches("[^amn]", "t"));
	}
	public void exampleThree() {

		System.out.println(Pattern.matches(".", "three"));
		System.out.println(Pattern.matches(".", "o"));

		// d represent any digit[0-9]
		System.out.println(Pattern.matches("\\d", "three"));
		System.out.println(Pattern.matches("\\D", "o"));
		System.out.println(Pattern.matches("\\D", "1"));
		System.out.println(Pattern.matches("\\d", "11"));// false Character match

	}
	
	public void exampleFour1() {
		System.out.println(Pattern.matches("[a-zA-Z0-9]{0,6}", "run32"));// true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));// false (more than 6 char)
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));// true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));// false ($ is not matched)
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6,}", "testttpkdfnsnbfqfehf"));// more than six
	}
	
	public void passwordMatch() {
		String pasword="test@123456R";
		String pasword2="test^123456R";
		boolean b = Pattern.matches("[a-zA-Z0-9@!@#$]{6,}", pasword);
		System.out.println(b);
		boolean b1 = Pattern.matches("[a-zA-Z0-9@!@#$]{6,}", pasword2);
		System.out.println(b1);
	}
	public static void main(String[] args) {

		RegularExpressionsTest obj = new RegularExpressionsTest();

		//obj.testOne();

		//obj.exampleTwoCharSequence();
		
		//obj.exampleThree();
		
		//obj.exampleFour1();
		
		
		obj.passwordMatch();
	}

}
