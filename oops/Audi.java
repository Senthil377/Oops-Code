package com.oops;

public class Audi extends Sports_Car{
	public void audi() {
		System.out.println("Audi is our first sports car");
	}
	public static void main(String[] args) {
		Audi audi=new Audi();
		audi.getCar();audi.getSports();audi.audi();
	}

}
