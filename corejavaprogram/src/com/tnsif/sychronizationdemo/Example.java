package com.tnsif.sychronizationdemo;

public class Example {
      void display() {
     Thread g=Thread.currentThread();
		for(int i=0;i<=3;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(g.getName()+" "+i);
			}
			catch(Exception e) {
		}
	}
	}
}
