package org.test;

public class SingleInheritanceClassA {

	public void methodA() {

		System.out.println("MethodA");

	}

	public void methodB() {
		System.out.println("MethodB");

	}

	public void methodC() {
		System.out.println("MethodC");
	}

	public static void main(String[] args) {
		SingleInheritanceClassA classAObj = new SingleInheritanceClassA();
		
		classAObj.methodA();
		
		classAObj.methodB();
		
	    classAObj.methodC();
	}

}
