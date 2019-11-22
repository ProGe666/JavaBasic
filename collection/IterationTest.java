package com.mercury.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class IterationTest {

	public static int[] a = {1,2,3,4,};
	public static List<Integer> l = new ArrayList();
	public static Set<Integer> s=new HashSet();
	public static Map<Integer,String> m = new HashMap();
	
	
	static{
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		
		m.put(1,"A");
		m.put(2,"A");
		m.put(3,"A");
		m.put(4,"A");
	}
	public static void iterateArray(){
		//1.traditional for loop
//		for(int i=0; i<a.length;i++){
//			System.out.println(a[i]);
//		}
		//2.enhanced for loop(for each loop)
//		for(int x :a){
//			System.out.println(x);
//		}
	}
	public static void iterateList(){
		//1.
//		for(int i=0;i<l.size();i++){
//			System.out.println(l.get(i));
//		}
		//2.
		//l.remove(2);//this will work, 
		//fail-fast and fail-safe
//		fail: while using iterator to iterate , if the iterable has structure change, fail
		
		
//		for(int x:l){
//			l.set(3, 10);
//			//l.remove(3); this won't work because the function is using the index;
//			//   ||
//			//concurrentModificationException
//			System.out.println(x);
//		}
		//3 iterator : (Interface) 
		//map不是 iterable，set是iterable
//		Iterator<Integer> i =l.iterator();
//		//hasNext() is not move
//		while(i.hasNext()){
//			Integer e= i.next();
//		System.out.print(e);
//		
//		}
		//4.for each
		//Consumer<Integer> c = e -> System.out.println(e);
		l.forEach( e -> System.out.println(e));
		
		
	}
	
	public static void iteratorSet(){
		//1. must have index(order number) in set their is no index, so can not use traditonal index
		//2 enhanced for loop
//		for(int x:s){
//			System.out.println(x);
//		}
		//3.iterator______fail fast
//		Iterator<Integer> i = s.iterator();
//		while(i.hasNext()){
//			System.out.println(i.next());
//		}
		//4 for each
		s.forEach(e -> System.out.println(e));
		
	}
	
	public static void iterateMap(){
		//1.using the keySet()
//		Set<Integer> ks = m.keySet();
//		for(int k:ks){
//			System.out.println(k + "->" + m.get(k));
//			}
		//2. Using entrySet()
		//inner interface ==>> public
//		Set<Map.Entry<Integer, String >> es = m.entrySet();
//		Iterator<Map.Entry<Integer, String>> i = es.iterator();
//		while(i.hasNext()){
//			Map.Entry<Integer, String> me  = i.next();
//			System.out.println(me.getKey() + "----->" +me. getValue());
//		}
		
		//4.for each(map 不是 Iterable）
		
		m.forEach((k,v) ->System.out.println(k +"****" +v));
		
	}
		
	public static void streamAPI(){
//		List<Integer> l =new ArrayList();
//		 for(int x :l){
//			 if(x>2){
//				 l.add(x*10);
//			 }
//		 }
		//filter 
//		l.parallelStream()
//		.filter(e->e>2);
//		
//		
//	}
		List<Integer> res =l.parallelStream()//Builder Pattern(Design Pattern)
				.filter(e->e>2)
				.map(e->e*10)
				.collect(Collectors.toList());
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//iterateArray();
//		iterateList();
//		iterateSet();
//		iterateMap();
		streamAPI();

	}

}
