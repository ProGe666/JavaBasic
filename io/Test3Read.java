package com.mercury.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.mercury.beans.Watch;

public class Test3Read {
	public static void main(String[] args){
		try(FileInputStream fis= new FileInputStream("resources/test3.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){

			Watch w = (Watch)ois.readObject();
			System.out.println("Done Test3 file");
	}catch(Exception e){
		e.printStackTrace();
	}
		
	}

}
