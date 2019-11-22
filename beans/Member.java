package com.mercury.beans;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Member implements Externalizable {

	private String username;
	transient private String password;
	private int age;
	
	public Member() {
	}
	public Member(String username, String password, int age) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Member [username=" + username + ", password=" + password + ", age=" + age + "]";
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(username);
		out.writeObject(password);
		out.writeInt(age);
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		this.password = (String)in.readObject();
		this.username = (String)in.readObject();
		this.age = in.readInt();
	}
}
