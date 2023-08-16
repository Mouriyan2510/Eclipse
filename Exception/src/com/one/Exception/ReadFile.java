package com.one.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String [] args) throws IOException{
		File f=new File("C:\\Users\\HP\\Desktop\\Test.txt");
		FileReader fr=new FileReader(f);
		int temp=0;
		while((temp=fr.read()) != -1) {
			System.out.print((char)(temp));
		}
//		BufferedReader br= new BufferedReader(new FileReader(f));
//		String st;
//		while ((st = br.readLine()) != null)	
//			System.out.println(st);
	}
}
