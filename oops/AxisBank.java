package com.oops;

public class AxisBank {
	public int getLoan() {
		return 30000;
	}
	public int getLoan(int salary) {
		return 30000+(salary*10);
	}
	public int getLoan(int salary,int propertyValue) {
		return 30000+(salary*10)+(propertyValue*25)/100;
	}

}
