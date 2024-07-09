package com.tnsif.staticexample;

public class Demo1 {
	public static void main(String[]args) {
		Student.change();
		
		Student s1=new Student(1,"navya");
		Student s2=new Student(2,"navya");
		Student s3=new Student(3,"navya");
		s1.display();
		s2.display();
		s3.display();
		
	}

}
