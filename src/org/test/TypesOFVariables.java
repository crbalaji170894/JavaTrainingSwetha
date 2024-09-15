package org.test;

public class TypesOFVariables {

	int a = 100;

	public void methodOne() {

		int a = 10;

		System.out.println(a);

	}

	public void methodTwo() {

		
		int a =20;
		a=30;
		System.out.println(a);
		
		this.a= 200;
	}

	public void methodThree() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		TypesOFVariables obj = new TypesOFVariables();
		
		obj.methodOne();
		
		obj.methodTwo();
		
		obj.methodThree();
		
		
	}

}
