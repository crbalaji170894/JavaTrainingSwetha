package org.test;

public class PartialAbstarctionClassB extends PartialAbstratctionClassA{
	
	
	public void methodOne() {
		System.out.println("MethodOne");

	}
	
	public void methodTwo() {
		System.out.println("MethodTwo");

	}

	@Override
	public void methodA() {
		System.out.println("MethodA");
		
	}

	@Override
	public void methodB() {
		System.out.println("MethodB");
		
	}

	@Override
	public void methodC() {
		System.out.println("MethodC");
		
	}

	public static void main(String[] args) {
		PartialAbstarctionClassB obj = new PartialAbstarctionClassB();
		
		obj.methodOne();
		
		obj.methodTwo();
		
//		obj.m
		
		

	}


}
