package com.mercury.beans;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

//1. private all fields
//2. immutable class no setters,only getters.
//3. set values through constructor
//4. customized field type, should be immutable as well
//5.List /Set/Map
/*Collections(This is class, collection is not)
 * Collectionos.unmodifiableList(l)
 * Collectionos.unmodifiableSet(s)
 * Collectionos.unmodifiableMap(m)
 * 6.final the class , so no extends allowed
*/
public final class Customer {
	private int age;
	private String name;
	private List<String> info;
	//private User U;
	
	//super and new : only two ways to call constructor
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int age, String name, List<String> info) {
		super();
		this.age = age;
		this.name = name;
		this.info = info;
	}


	public int getAge() {
		return age;
	}

	public String getName() {
		//string is immutable,Can not be change
		return name;
	}
	public List<String> getInfo(){
		//return info;
		return Collections.unmodifiableList(info);
		
	}
	public static void main(String[] args){
		Customer c = new Customer(1,"G",new ArrayList());
		
		c.getInfo().add("A");
		System.out.println(c.getInfo());
	}

	
}
