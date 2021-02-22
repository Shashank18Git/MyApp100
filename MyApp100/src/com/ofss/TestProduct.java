package com.ofss;

public class TestProduct {

	public static void main(String[] args) {
		Stock [] stockArray = new Stock[3];
		stockArray[0] = new Stock(100, "Oracle", 123.45);
		stockArray[1] = new Stock(200, "IBM", 122.45);
		stockArray[2] = new Stock(300, "Accenture", 121.45);
		
		Customer customer = new Customer("Oracle", stockArray);
		
		System.out.println(customer);
		System.out.println("----------------");

	}

}
