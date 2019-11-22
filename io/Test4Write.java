package com.mercury.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.mercury.beans.Member;

public class Test4Write {
	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("resources/test4.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			Member m = new Member("Greg", "123", 10);
			
			oos.writeObject(m);
			
			System.out.println("Done test4 write");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
