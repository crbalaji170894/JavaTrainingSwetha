package org.test;

public class SingleInheritanceClassB extends SingleInheritanceClassA {

	public void methodD() {

		System.out.println("MethodD");

	}

	public void methodE() {
		System.out.println("MethodE");

	}

	public void methodF() {
		System.out.println("MethodF");
	}

	public static void main(String[] args) {
		SingleInheritanceClassB classBObj = new SingleInheritanceClassB();

		classBObj.methodD();

		classBObj.methodE();

		classBObj.methodF();

		classBObj.methodA();

		classBObj.methodB();

		classBObj.methodC();

	}

}
