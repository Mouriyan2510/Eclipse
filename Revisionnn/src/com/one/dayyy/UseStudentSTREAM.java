package com.one.dayyy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseStudentSTREAM {
	public static void main(String [] args) {
		StudentStream s1=new StudentStream("Mouri",'A',900,28);
		StudentStream s2=new StudentStream("Varun",'S',5000,26);
		StudentStream s3=new StudentStream("Naveen",'U',7000,28);
		StudentStream s4=new StudentStream("MuthuRaman",'K',9000,24);
		
		List<StudentStream> studs=Arrays.asList(s1,s2,s3,s4);
		
		StudentStream th= studs.stream().filter(t-> t.getAge()>24).sorted(Comparator.comparing(StudentStream::getAge).reversed()).sorted(Comparator.comparing(StudentStream::getSalary).reversed()).limit(1).findFirst().get();
		System.out.println(th);
		studs.stream().sorted(Comparator.comparing(StudentStream::getAge).reversed()).skip(1).findFirst().get();
		List<StudentStream>e= studs.stream().filter(y-> y.getInitial()=='A').collect(Collectors.toList());
//		System.out.println(e);
		StudentStream ss= studs.stream().sorted(Comparator.comparing(StudentStream::getAge).reversed()).skip(1).findFirst().get();
//		System.out.println(ss);
		String ddd= studs.stream().map(y-> y.getName()).skip(2).findFirst().get();
//		System.out.println(ddd);
//		System.out.println(studs);
		List<StudentStream>varun=studs.stream().filter(t-> t.getSalary()>6000).sorted(Comparator.comparing(StudentStream::getAge).reversed()).sorted(Comparator.comparing(StudentStream::getInitial)).collect(Collectors.toList());
//		varun.forEach(t-> System.out.println(t));
		List<Integer>sal=studs.stream().map(y-> y.getSalary()).sorted().collect(Collectors.toList());//sorted
		List<StudentStream>so=studs.stream().sorted(Comparator.comparing(StudentStream::getName)).collect(Collectors.toList());
		List<StudentStream>ee=studs.stream().sorted(Comparator.comparing(StudentStream::getSalary)).collect(Collectors.toList());
		List<Integer>sal1=studs.stream().map(y-> y.getSalary()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());//sortedDesc
		List<StudentStream>eg=studs.stream().sorted(Comparator.comparing(StudentStream::getSalary).reversed()).limit(2).collect(Collectors.toList());	
		List<String>nam=studs.stream().map(y-> y.getName()).sorted().collect(Collectors.toList());//sortedbyname
		List<String>nam1=studs.stream().map(y-> y.getName()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());//sortedreversedByname
		List<Integer>limit=studs.stream().map(y-> y.getSalary()).sorted().limit(2).collect(Collectors.toList());//limit
		List<Character>charDistinct=studs.stream().map(y-> y.getInitial()).sorted().distinct().collect(Collectors.toList());//distinctChar
		List<Integer>distinct=studs.stream().map(y-> y.getSalary()).sorted().distinct().collect(Collectors.toList());//distinct
		StudentStream qwe=studs.stream().max(Comparator.comparing(StudentStream::getSalary)).get();
		Map<String,StudentStream>yui=studs.stream().collect(Collectors.toMap(r->r.getName(), u->u));
		System.out.println(yui);
		long count=studs.stream().map(y-> y.getSalary()).count();//count
		int fgf=studs.stream().map(y-> y.getSalary()).min(Integer::compareTo).orElse(null);
		int minsal=studs.stream().min(Comparator.comparing(StudentStream::getSalary)).map(t-> t.getSalary()).get();
		int fgfgh=studs.stream().map(y-> y.getSalary()).sorted(Comparator.reverseOrder()).skip(0).findFirst().get();
		StudentStream s=studs.stream().max(Comparator.comparing(StudentStream::getSalary)).get();//max return object
		StudentStream min=studs.stream().min(Comparator.comparing(StudentStream::getSalary)).get();//min return object
		int tir=studs.stream().max(Comparator.comparing(StudentStream::getSalary)).map(t->t.getSalary()).get();
		int ki=studs.stream().distinct().map(y-> y.getSalary()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();//secondhigh
		List<StudentStream> kii=studs.stream().distinct().sorted(Comparator.comparing(StudentStream::getSalary).reversed()).limit(2).toList();//secondhigh
		int summing=studs.stream().map(y-> y.getSalary()).collect(Collectors.summingInt(Integer::intValue));//summingint
		boolean boo=studs.stream().anyMatch(x-> x.getSalary()>6000);//anymatch
		Map<Integer,List<StudentStream>> d=studs.stream().collect(Collectors.groupingBy(StudentStream::getSalary));//groupby
		List<Integer> salary=studs.stream().map(u-> u.getSalary()).collect(Collectors.toList());
		List<Integer> age=studs.stream().map(u-> u.getAge()).collect(Collectors.toList());
		List<List<Integer>> salage=Arrays.asList(salary,age);//flatmap
		List<Integer> salag=salage.stream().flatMap(y-> y.stream()).collect(Collectors.toList());
		List<String> name=studs.stream().map(y-> y.getName()).collect(Collectors.toList());
		List<List<? extends Object>> obj=Arrays.asList(salary,name);//flatmap using object
		obj.forEach(y-> System.out.println(y));
		Map<String, StudentStream>fg=studs.stream().collect(Collectors.toMap(y->y.getName(), a->a));//collect by map
		Set<StudentStream> ut = studs.stream().collect(Collectors.toSet());//collect by set
		List<StudentStream> kgf= studs.stream().filter(t-> t.getSalary()>5000).sorted(Comparator.comparing(StudentStream::getAge).reversed()).sorted(Comparator.comparing(StudentStream::getInitial)).collect(Collectors.toList());
//		kgf.forEach(y->System.out.println(y));
//		sal.forEach(y-> System.out.println(y));
//		System.out.println(kii);
//		kii.forEach(i-> System.out.println(i));
//		sal1.forEach(y-> System.out.println(y));
//		nam.forEach(y-> System.out.println(y));
//		nam1.forEach(y-> System.out.println(y));
//		distinct.forEach(y-> System.out.println(y));
//		charDistinct.forEach(y-> System.out.println(y));
//		System.out.println(count);
//		System.out.println(s);
//		System.out.println(ki);
//		System.out.println(summing);
//		System.out.println(boo);
//		System.out.println(d);
//		System.out.println(fgfgh);
//		d.forEach((x,y)-> System.out.println(x+"---"+y));
//		salag.forEach(y-> System.out.println(y));
//		obj.forEach(u-> System.out.println(u));
//		fg.forEach((x,y)-> System.out.println(x+"----"+y));
//		ut.forEach(t-> System.out.println(t));
//		ee.forEach(y-> System.out.println(y));
//		eg.forEach(y-> System.out.println(y));
//		salage.forEach(y->System.out.println(y));
//		System.out.println(qwe);
//		System.out.println(tir);
//		System.out.println(minsal);
//		so.forEach(t-> System.out.println(t));
//		yui.forEach((y,z)-> System.out.println(y+"___"+z));
	}

}
