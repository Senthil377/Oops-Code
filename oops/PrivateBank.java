package com.oops;

public class PrivateBank extends Bank{
	public int getInterest(int principleAmount) {
				return (principleAmount*7)/100;
	}
	public void getmethodC() {
		System.out.println("Method C");
	}
	public void getmethodD() {
		System.out.println("Method D");
	}

}
