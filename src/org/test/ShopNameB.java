package org.test;

public class ShopNameB extends ShopNameA {

	public void biscuits() {

		System.out.println("120 RS");
	}

	public void juices() {
		System.out.println("170 RS");
	}

	public void berrys() {
		System.out.println("510 RS");
	}

	public static void main(String[] args) {
		ShopNameB bObj = new ShopNameB();

		bObj.berrys();

		bObj.biscuits();

		bObj.juices();

	}

}
