package org.test;

public class HelloWorldProgram {

	public void methodOne() {
		System.out.println("Method One");
	}

	public void methodTwo() {
		System.out.println("Method Two");
	}

	public void methodThree() {
		System.out.println("Method Three");
	}

	public static void main(String[] args) {
		HelloWorldProgram hello = new HelloWorldProgram();
		
		hello.methodOne();

		hello.methodTwo();

		hello.methodThree();
	}

}
