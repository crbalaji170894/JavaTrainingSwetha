package org.test;

public class SingleTonClassAccess {

	public static void main(String[] args) {
		SingleTonClassA singleTonMethod_obj = SingleTonClassA.singleTonMethod();
		
		singleTonMethod_obj.lauchChromeBrowser();
		
		SingleTonClassA singleTonMethod_obj2 = SingleTonClassA.singleTonMethod();
		
		
		SingleTonClassA singleTonMethod_obj3 = SingleTonClassA.singleTonMethod();
		
		System.out.println(singleTonMethod_obj.hashCode());
		
		System.out.println(singleTonMethod_obj2.hashCode());
		
		System.out.println(singleTonMethod_obj3.hashCode());

	}

}
