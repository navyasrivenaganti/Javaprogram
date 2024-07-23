package com.tnsif.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Javastreamdemo {
	public static void main(String[] args) {
		List<Product> pl=new ArrayList<Product>();

		pl.add(new Product(1,"hp",400000));
		pl.add(new Product(2,"dell",500000));
		pl.add(new Product(3,"apple",800000));
//		List<Float> pl2=pl.stream().filter(p->p.price>30000)//filtering the data
//				.map(p->p.price)//fetching price
	//			.collect(Collectors.toList());//collecting as a list
		//System.out.println(pl2);
//		double totalprice=pl.stream().collect(Collectors.summingDouble(Product->Product.price));
//System.out.println(totalprice);
		//find max and min
		Product p=pl.stream().max((Product1,Product2)->Product1.price>Product2.price?1:-1).get();
		System.out.println(p.price);
		}

}
