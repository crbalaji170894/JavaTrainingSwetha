package org.test;

public class FullyAbstractionClassB implements FullyAbstractionClassA ,FullyAbstarctClassC {

	@Override
	public void methodA() {
		System.out.println("test one");

	}

	@Override
	public void methodB() {
		System.out.println("test one");

	}

	@Override
	public void methodC() {
		System.out.println("test one");

	}

	@Override
	public void methodD() {
		System.out.println("test one");

	}
	
	@Override
	public void one() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void two() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		FullyAbstractionClassB obj = new FullyAbstractionClassB();

		obj.methodA();

	}

	

}
