package com.pac;

public class UseStudent {
	public static void main(String[] args) {
		Address a=new Address();
		a.doorNo=91;
		a.streetName="Villa Nagar";
		a.district="Vellore";
		a.pincode=635107;
		Student s=new Student();
		s.name="Senthil";
		s.id=1234;
		s.age=15;
		s.isPresent=true;
		s.address=a;
	 System.out.println(s.address.doorNo);
	}

}
