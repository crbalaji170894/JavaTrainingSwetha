package org.test;

public class NestedForLoopTest {

	public static void main(String[] args) {

		for (int i = 0; i <= 3; i++) {

			System.out.println("The i value is" + i);

			for (int j = 0; j <= 2; j++) {
				System.out.println("The j value is" + j);
			}

		}

	}

}

//Step 1: i =0; 0<=3> (true) print i= 0
// j =0 0<=2> (true) print->0 j->0->1
// j=1 1<=2> (true) print->1 j->1->2
// j=2 2<=2> (true) print->2 j->2->3
// j=3 3<=2> (false)
// i->0->1
//Step 2: i=1 1<=3> (true) print i =->1
// j =0 0<=2> (true) print->0 j->0->1
// j=1  1<=2> (true) print->1 j->1->2
//j=2   2<=2> (true) print->2 j->2->3
//j=3   3<=2> (false)
//i->0->2
//Step 23
