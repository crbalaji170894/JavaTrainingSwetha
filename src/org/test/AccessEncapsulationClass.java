package org.test;

public class AccessEncapsulationClass extends FinalKeywordTest {

//
//	public  void testOne() {
//
////		this.a = 200;
//
//	}

	
	
	public static void main(String[] args) {
		EncapusulationClass obj = new EncapusulationClass();

		obj.setRollNo(101);

		int rollNo = obj.getRollNo();

		System.out.println(" The rollnumber is " + rollNo);
		
		AccessSpecifierClass obj2= new AccessSpecifierClass();
		
		
		
		

	}

}
