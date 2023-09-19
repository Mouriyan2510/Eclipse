package Volante;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadTxtSelf {
	public static void main(String[] args) {
		String a="C:\\Users\\HP\\Desktop\\GAAVS IQ.txt";
		try (BufferedReader br=new BufferedReader(new FileReader(a))){
		String line;
		int i=1;
		while((line=br.readLine())!=null) {
			System.out.println(line+"Line Num--"+i++);
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
