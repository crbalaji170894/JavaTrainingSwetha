package org.test;

public class SwitchCaseTest {

	public void findTheGrade(int cgpa) {

		switch (cgpa) {

		case 10:
			System.out.println("The Grad is Exceptional");
			break;

		case 9:
			System.out.println("The Grad is Distinguish Performance");
			break;

		case 8:
			System.out.println("The Grad is Distinguish FirstClass");
			break;

		case 7:
			System.out.println("The Grad is Distinguish Avereage");
			break;
		case 6:
			System.out.println("The Grad is Distinguish Second Class");
			break;
		default:
			System.out.println("Please do Reattempt");
			break;

		}
	}

	public static void main(String[] args) {

		SwitchCaseTest obj = new SwitchCaseTest();
		obj.findTheGrade(10);

	}

}
