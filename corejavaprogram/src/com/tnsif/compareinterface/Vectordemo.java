package com.tnsif.compareinterface;

import java.util.Vector;

public class Vectordemo {
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		System.out.println("size of the vector"+v.size());
		v.add("red");
		v.add("blue");
		v.add("red");
		v.add("orange");
		v.add("black");
		int capacity=v.capacity();
		System.out.println(capacity);
		v.add(5,"pink");
		System.out.println(v);
		v.add("red");
		v.add("red");
		v.add("red");
		v.add("red");
		v.add("red");
		v.add("red");
		int capacity1=v.capacity();
		System.out.println(capacity1);
	}

}
