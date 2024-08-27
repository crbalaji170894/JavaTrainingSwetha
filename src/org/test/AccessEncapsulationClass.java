package org.test;

public class AccessEncapsulationClass {

	public static void main(String[] args) {
		EncapusulationClass obj = new EncapusulationClass();

		obj.setRollNo(101);

		int rollNo = obj.getRollNo();

		System.out.println(" The rollnumber is " + rollNo);

	}

}
