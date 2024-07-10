package com.tnsif.finallyblocks;
//exception with matching catch block
public class Testtwo {
	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}
		catch(ArithmeticException e) {
			System.out.println("excetion caught"+e.getMessage());
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("end");
	}

}

