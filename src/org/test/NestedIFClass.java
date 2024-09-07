package org.test;

import java.util.Scanner;

public class NestedIFClass {

	public void findTheStundentGrade(int totalMarks) {

		if (totalMarks <= 100 && totalMarks > 89) {
			System.out.println("The Grade is A and total MArks is" + totalMarks);
		} else if (totalMarks <= 89 && totalMarks > 79) {
			System.out.println("The Grade is B and total MArks is" + totalMarks);
		} else if (totalMarks <= 78 && totalMarks > 61) {
			System.out.println("The Grade is C and total MArks is" + totalMarks);
		} else {
			System.out.println("Fail Mark and total MArks is"+ totalMarks);
		}

	}

	public static void main(String[] args) {

		NestedIFClass obj = new NestedIFClass();

		Scanner scan = new Scanner(System.in);

		System.out.println("Get the Mark  form JAVA user");

		int totalMarks = scan.nextInt();

		obj.findTheStundentGrade(totalMarks);

	}

}
