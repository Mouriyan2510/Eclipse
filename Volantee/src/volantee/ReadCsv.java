package volantee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ReadCsv {
	public static void main(String[] args) {
		String csvFilePath = "C:\\Users\\HP\\Desktop\\Book1.csv"; 
		Set<String>uni=new HashSet<>();
		Set<String>dupli=new HashSet<>();
		try(BufferedReader br=new BufferedReader(new FileReader(csvFilePath))) {
		String line;
		while((line=br.readLine())!=null) {
			String[]tran= line.split(",");
			if(tran.length>0) {
				String one=tran[1];
				if(!uni.add(one)) {
					dupli.add(one);
				}
			}
		}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		if(dupli.isEmpty()) {
			System.out.println("There is no duplicates in this file");
		}
		else {
			System.out.println("Duplicates found:-->");
			for(String h:dupli) {
				System.out.println(h);
			}
		}
//		List<String>li= dupli.stream().collect(Collectors.toList());
////		System.out.println(li);
//		li.forEach(t->System.out.println(t));
	}

}
