package com.mercury.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.Vector;

import com.mercury.beans.Book;
import com.mercury.beans.Luggage;
import com.mercury.beans.User;

public class ColletcionBasic {

	public static void main(String[] args) {
		//Array is a class, fixed type and size after creation
		
		
		int[] i = {1,2}; // class
		
		String[] s = {"a","b"};
		
		System.out.println(i.getClass().getName());
		System.out.println(s.getClass().getName());

	
	
	//generic :restrict the type of the element which can be put inside\
	//Java 1.5
	List<Integer> p = new ArrayList();
	p.add(6);
	
	//auto-boxing: convert a primitive type into its wrapper class type
	
	Integer x=1;
	
	//auto-unboxing
	int y = new Integer(2);
	
	
	
	ArrayList al;
	Vector v;
	LinkedList ll;
	HashMap hm = new HashMap();
	//synchronized
	Hashtable ht = new Hashtable();
	
	hm.put(1,null);
	hm.put(null, 1);
	System.out.println(hm);
	
	//map do not have dulpliate keys
	
	//ordered : Insertion order ;sorted:small to big or big to small,sorted is ascending order, decscending order.
	LinkedHashMap lhm = new LinkedHashMap();
	//this is heap insertion order  ; O(1) access for get
	lhm.put(1,null);
	lhm.put(null, 1);
	lhm.put(new Luggage(), 2);
	//System.out.println(lnm);
	
	TreeMap<Integer, String > tm = new TreeMap(); //sorted by the key
	
	tm.put(3,"A");
	tm.put(1,"C");
	tm.put(2,"B");
	System.out.print(lhm);
	System.out.print("**************");
	
TreeMap<Book, String > tmBook = new TreeMap(); //sorted by the key
	
	tmBook.put(new Book("2-2-2-2", 200),"B");
	tmBook.put(new Book("3-3-3-3", 300),"C");
	tmBook.put(new Book("1-1-1-1", 100),"A");
	System.out.print(tmBook);
	
	System.out.print("**************");
	
	
	//anonymous class/implementation
//	One time use only
	//add generic to compare book, if not,this will compare object
	Comparator<User> c = new Comparator<User>() {
		@Override
		public int compare(User u1,User u2){
			return u1.getAge() - u2.getAge();
		}
	};
	
	TreeMap<User, Integer> tmUser = new TreeMap(c);
	tmUser.put(new User("A",10), 1);
	tmUser.put(new User("B",20), 2);
	
	System.out.println(tmUser);
	
	
	//HashSet,LinkedHashSet, TreeSet
	
	
	HashSet hs;
	
	//In add function for HashMap e is object ;for HashSet is a value
	//no duplicate value in HashSet
	
			}			
}
