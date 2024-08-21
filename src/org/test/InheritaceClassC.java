package org.test;

public class InheritaceClassC extends SingleInheritanceClassB {

	public void methodG() {

		System.out.println("MethodG");

	}

	public void methodH() {
		System.out.println("MethodH");

	}

	public void methodI() {
		System.out.println("MethodI");
	}

	public static void main(String[] args) {
		InheritaceClassC classCObj = new InheritaceClassC();

		classCObj.methodG();

		classCObj.methodH();

		classCObj.methodI();

		classCObj.methodA();

		classCObj.methodB();

		classCObj.methodC();

	}

}
