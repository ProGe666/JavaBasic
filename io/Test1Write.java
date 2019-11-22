package com.mercury.io;

import java.io.FileOutputStream;

public class Test1Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileOutputStream fos = new FileOutputStream("resources/test1.dat");){
			
			System.out.println("Start test1 write");
			int[] nums = {-1,2,3,4,879592385};
			for(int num: nums){
				fos.write(num);
			}
			System.out.println("test1 write done");
	}catch(Exception e){
		e.printStackTrace();
	}
	}

}
