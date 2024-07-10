package com.tnsif.finallyblocks;

public class Testone {
	public static void main(String[] args) {
		try {
			System.out.println("welcome");
			
		}
		catch(Exception e) {
			System.out.println("exception");
		}
		finally {
			System.out.println("hello");
		}
	}

}
