package com.one.Exception;
import java.io.*;
public class Read {
	public static void main(String [] args)throws Exception {
		File f=new File("C:\\Users\\HP\\Desktop\\Test.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		String st;
		while((st=br.readLine())!=null) {
			System.out.println(st);
		}
	}

}
