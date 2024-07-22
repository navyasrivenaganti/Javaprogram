package com.tnsif.compareinterface;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		Student s=new Student(100,"navya","ece");
		al.add(s);
	    Student s2=new Student(101,"sahithi","ece");
	     al.add(s2);
		Student s3=new Student(102,"ramya","ece");
		al.add(s3);
		System.out.println("before sorting"+al);
		System.out.println("after sprting");
		Collections.sort(al);
		System.out.println(al);
		
	}

}
