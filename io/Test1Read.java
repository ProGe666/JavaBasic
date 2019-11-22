package com.mercury.io;

import java.io.FileInputStream;

public class Test1Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis = new FileInputStream("resources/test1.dat")){
			
			int x = fis.read();
			while (x!=-1){// return -1 only when EOF(End of file)
				System.out.println(x);
				x= fis.read();
			}
			
			System.out.println("*********");
			System.out.println(879592385 - (879592385 >>8<<8));
			System.out.println(879592385 %(1<<8)); //取余后8位
			
			String s = Integer.toString(879592385, 2);
			String lastbyte = s.substring(s.length()  -8);
			int res = Integer.parseInt(lastbyte, 2);
			System.out.println(s);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
