package com.tnsif.finallyblocks;
//exception with no matching catch block
public class Testthree {
	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}
		catch(ArithmeticException e) {
		System.out.println("welcome");
	}
		finally {
			System.out.println("java");
		}
	}
}

