package com.tnsif.lambdaexpression;

public class Parameterdemo {
	public static void main(String[] args) {
		Cube c=(a)->{return (a*a*a);};
		System.out.println("cube of a number"+c.calcualte(4));
	}

}
