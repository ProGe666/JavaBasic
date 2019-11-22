package com.mercury.basic;

import java.util.ArrayList;
import java.util.List;
import com.mercury.beans.SuperMarket;

public class CloneTest {
	public static void main(String[] args){
		List<String> products = new ArrayList();
		products.add("veg");
		products.add("meet");
		products.add("bread");
		
		SuperMarket sm1 = new SuperMarket("AFM", "600 Plainsboro RD", products);
		SuperMarket sm2 = sm1.clone();
		
		System.out.println(sm1 == sm2);
		System.out.println(sm1);
		System.out.println(sm2);
		
		
		System.out.println(sm1.getName() == sm2.getName());
		System.out.println(sm1.getAddress() == sm2.getAddress());
		System.out.println(sm1.getProduct() == sm2.getProduct());
	}
}
