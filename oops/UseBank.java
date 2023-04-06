package com.oops;

public class UseBank {
	public static void main(String[] args) {
		PrivateBank pb=new PrivateBank();
		System.out.println(pb.getInterest(250000));
		Bank bank=new Bank();
		Bank b1=new PrivateBank();
		System.out.println(b1.getInterest(250000));
	}

}
