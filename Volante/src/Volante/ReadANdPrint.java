package Volante;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadANdPrint {
	public static void main(String[] args) {
		String url="C:\\Users\\HP\\Desktop\\reference.txt";
		try(BufferedReader br=new BufferedReader(new FileReader(url))){
			String line;
			int i=1;
			while((line=br.readLine())!=null){
				int length=line.length();
				System.out.println(i+"---"+line+"---"+length);
				i++;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
