package org.test;

public class ForLoopTest {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
			
		}

	}

}

//Step 1; i = 0, 0<=5 (true) print->0 0->1
//Step 2; i=1    1<=5 (true) print->1 1->2
//Step 3; i=2    2<=5 (true) prints->2 2->3
//Step 4; i=3    3<=5> (true) print->3 3->4
//Step 5; i=4    4<=5> (true) print->4 4->5
//Step 6  i=5    5<=5> (true) print->5 5->6
//Step 7  i=6    6<=5> (false) come out of the for loop