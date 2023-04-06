package com.oops;

public class Action extends Movie{
	public String getFightScene(int noOfFights) {
		if (noOfFights>=2&&noOfFights<=5) {
			return "Medium";
		}
		else if (noOfFights>=5&&noOfFights<=10) {
			return "Hard level";
		}
		else {
			return "No Action";
		}
	}
	}
	
	


