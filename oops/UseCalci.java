package com.oops;

public class UseCalci {
	public static void main(String[] args) {
		Calculator calci=new Calculator();
		System.out.println("Sum1 "+calci.sum(10.4f, 13.45f));
		System.out.println("Sum2 "+calci.sum(23,667));
		System.out.println("Sum3 "+calci.sum(45,567,678));
	}

}
