package org.test;

public class IFExample {

	public void toCheckAge(int age) {

		System.out.println("The age is" + age);
		
		int votersEligibleAge = 18;

		if (age >= votersEligibleAge &&  age<=100) {
			System.out.println("The age is eligible to poll the votes");
		}
		else
		{
			System.out.println("The age is not  eligible to poll the votes");
		}

	}

	public static void main(String[] args) {
		IFExample obj = new IFExample();

		obj.toCheckAge(101);
	}

}
