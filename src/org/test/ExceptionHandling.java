package org.test;

public class ExceptionHandling {

	public void testOne() {

		try {
			int a = 10;

			int b = 0;

			int c = a / b;

		} catch (Exception e) {

			throw new ArithmeticException("Any number will not be divided by zero");
		}
		int d = 30;

		System.out.println(d);

	}

	public void mtehodTwo() {

		try {
			int a = 10;

			int b = 0;

			int c = a / b;
		} 

		finally {
			System.out.println("Close the System");
		}

	}

	public static void main(String[] args) {

		ExceptionHandling obj = new ExceptionHandling();

		// obj.testOne();

		 obj.mtehodTwo();

	}

}
