package com.mercury.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.mercury.beans.Watch;

public class Test3Write {
	public static void main(String[] args){
		try(FileOutputStream fos = new FileOutputStream("resources/test3.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			Watch w = new Watch("Casio",1000,"Glod");
			oos.writeObject(w);
			
			System.out.println("Done test 3 write");
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
