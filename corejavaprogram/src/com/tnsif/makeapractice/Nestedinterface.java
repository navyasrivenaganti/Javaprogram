package com.tnsif.makeapractice;

public class Nestedinterface implements Myinterface.Myinnerinterface {

	@Override
	public void print() {
		System.out.println("interface");
		
	}
	public static void main(String[] args) {
		Nestedinterface n=new Nestedinterface();
		n.print();
		System.out.println(Nestedinterface.n);
	}
	

}
