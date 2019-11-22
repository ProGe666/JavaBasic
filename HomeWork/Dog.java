package com.mercury.HomeWork;

public class Dog {

	String name;
	Dog(String name){
		this.name = name;
	}
	String getName(){
		return this.name;

	}
	void setName(String name){
		this.name = name;
	}
	String getObjectAddress(){
		return super.toString();
	}
 public static void main(String[] args){
	 Dog dog = new Dog ("A");
	 System.out.println(dog.getObjectAddress());
	 func(dog);
	 System.out.println(dog.getObjectAddress());
	 System.out.println(dog.getName());
 }

 public static void func(Dog dog){
	 System.out.println(dog.getObjectAddress());
	 
	 dog = new Dog("B");
	 System.out.println(dog.getObjectAddress());
	 System.out.println(dog.getName());
 }
}
