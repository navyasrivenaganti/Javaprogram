package com.tnsif.lambdaexpression;

import java.util.ArrayList;

public class Lambdaexpression {
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<>();
		li.add(3);
		li.add(6);
		li.add(7);
		li.add(9);
		li.forEach(ele->System.out.println(ele));
	}

}
