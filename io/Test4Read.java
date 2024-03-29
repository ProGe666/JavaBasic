package com.mercury.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.mercury.beans.Member;

public class Test4Read {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("resources/test4.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Member m = (Member)ois.readObject();
			
			System.out.println(m);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
