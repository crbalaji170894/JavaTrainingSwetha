package org.test;

public class NestedForLoopWithStarPattern {

	public static void main(String[] args) {

//		for (int i = 1; i <= 4; i++) {
//
//			for (int j = 1; j <= i; j++) {
//				
//				System.out.print("*");
//
//			}
//			System.out.println();
//		}

		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
// Step 1-> i =4 4>=1 True-> j=1 , 1<=4 True , j->2 2<=4 True, j->3 True j->4 True j->5 ,i->3
//Step 2-> i=3 3>=1 True j->1  1<=4 True , j->2 2<=4 True, j->3 True i->2
//Step 3-> i=2 2>1 True j->1  1<=4 True , j->2 2<=4 True
//Step 4->i-1
//****
//***
//**
//*
//

//---------------------------
//Step 1-> i =1 1<=4> True j=1 1<=1> True (j=2<=i(1)->false) i->1->2
//Step2 i=2 2<=4 True j=1  1<=2 True, 2<=2 True, 3 False
//Step 3: i=3 3<=3 True j=1 1<=3 True 2 True 3 True
//Step4 : i=4 4<-4

//*
//**
//***
//****
