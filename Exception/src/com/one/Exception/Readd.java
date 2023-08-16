package com.one.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Readd {
	public static void main(String [] args) throws FileNotFoundException {
		File f=new File("C:\\Users\\HP\\Desktop\\Test.txt");
		FileReader fr=new FileReader(f);
}
}