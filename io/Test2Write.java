package com.mercury.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Test2Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileOutputStream fos = new FileOutputStream("resources/test2.dat");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
						DataOutputStream dos = new DataOutputStream(bos)){
			
			
			int i=-4;
			double d = 3.141592654;
			boolean b = true;
			
			
			
			System.out.println("Test2 write complete");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
