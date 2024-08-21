package org.test;

public class ShopNameA {

	private void biscuits() {

		System.out.println("100 RS");
	}

	private void juices() {
		System.out.println("150 RS");
	}

	private void berrys() {
		System.out.println("500 RS");
	}

	public static void main(String[] args) {
		ShopNameA aObj = new ShopNameA();

		aObj.berrys();

		aObj.biscuits();

		aObj.juices();
	}

}
