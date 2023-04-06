package com.oops;

public class UseAxis {
	public static void main(String[] args) {
		AxisBank axis=new AxisBank();
		System.out.println("Without Salary: "+axis.getLoan());
		System.out.println("With Salary: "+axis.getLoan(40000));
		System.out.println("Salary & Property: "+axis.getLoan(25000,400000));
	}

}
