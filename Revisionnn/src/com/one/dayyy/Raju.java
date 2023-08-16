package com.one.dayyy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Raju {
public static void main(String[] args) {
	StudentStream s1=new StudentStream("",'A',900,0);
	StudentStream s2=new StudentStream("Kathir",'S',5000,26);
	StudentStream s3=new StudentStream("Naveen",'U',7000,29);
	StudentStream s4=new StudentStream("MuthuRaman",'U',9000,27);
	
	
	List<StudentStream>stu=Arrays.asList(s1,s2,s3,s4);
	List<StudentStream> sta = stu.stream().filter(x->x.getSalary()>5000).collect(Collectors.toList());
	StudentStream yu=stu.stream().sorted(Comparator.comparing(StudentStream::getSalary).reversed()).skip(1).findFirst().get();
	System.out.println(yu);
	//System.out.println(sta);
//	sta.forEach(o->System.out.println(o));
}
	
}
