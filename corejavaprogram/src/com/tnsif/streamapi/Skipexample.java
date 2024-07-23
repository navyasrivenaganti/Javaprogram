package com.tnsif.streamapi;

import java.util.stream.Stream;

public class Skipexample {
	public static void main(String[] args) {
		Stream.of(1,2,3,4,5,6,7,8,9,10)
		.filter(num->num%2==0)//filtering even num
		//.skip(2)//skip first 2 even elements
		.limit(2)
		.forEach(num->System.out.println(num+" "));
		}

}
