package org.test;

public class MethodOverLoadingTest {

	public void vechile(int n) {
		System.out.println(n);
	}

	public void vechile(int b, String name) {
		System.out.println("The integer is" + b + " And name is  " + name);
	}

	public void vechile(boolean bool) {
		System.out.println(bool);
	}

	public void vechile() {
		System.out.println("No argument present");
	}

	public void vechile(char c, int n, float value) {
		System.out.println("Th char is " + c + "and the int is " + n + "And th float value is " + value);
	}

	public static void main(String[] args) {
		MethodOverLoadingTest obj = new MethodOverLoadingTest();

		obj.vechile();

		obj.vechile(65, "test");

		obj.vechile(false);

		obj.vechile('c', 120, 12.5f);

		obj.vechile(13);
	}

}
