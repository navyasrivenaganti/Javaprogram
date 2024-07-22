package com.tnsif.arraylistdemo;

import java.util.LinkedList;

public class Linkedlistdemo {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("ra");
		l.add(2);
		l.add("abcd");
		l.add(8.9);
		System.out.println("After invoking add() "+l);
		l.add(1, "apple");
		System.out.println(l);
		LinkedList l1=new LinkedList();
		l1.add(11);
		l1.add("ds");
		l1.add(l);
		l1.addFirst("d");
		l1.addLast("rashmi");
		System.out.println(l1);
	}

}
