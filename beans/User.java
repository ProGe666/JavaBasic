package com.mercury.beans;
/*
 * 	Java bean:(POJO,POJO bean - Plain Old Java Object
 * 1.only fields
 * 2.constructors,getters/setters,functions from Object
 * 3.No LOGIC   ****important
 * */

public class User {
	//most basic
	private String name;
	private int age;
	//getter start with getXyz()
	//must have no parameter
	//accessibility can be controlled--can change public(private)
	
	
	public String getName(){
		return name;
	}
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
