package Volante;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Strin {
	public static void main(String[] args) {
		String a="we love you you love me";
		String[]b=a.split(" ");
		Map<String,Long>map=Arrays.stream(b).collect(Collectors.groupingBy(f->f,Collectors.counting()));
		map.forEach((t,y)->{
			if(y>1) {
				System.out.println(t);
			}
		});
		
	}

}
