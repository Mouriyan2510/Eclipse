package com.one.day4;

public class UseStudent {
	public static void main(String[]args) {
		Student stu1=new Student();
		String[] a=args[0].split("[,-]");
		stu1.name=a[0];
		stu1.marks=Integer.parseInt(a[1]);
		stu1.isPass=Boolean.parseBoolean(a[2]);
		System.out.println("Student name is:"+stu1.name+"\nStudent mark is:"+stu1.marks+" "+stu1.isPass);
		Student stu2=new Student();
		String[] b=args[1].split("[/;]");
		stu2.name=b[0];
		stu2.marks=Integer.parseInt(b[1]);
		stu2.isPass=Boolean.parseBoolean(b[2]);
		System.out.println("Student name is:"+stu2.name+"\nStudent mark is:"+stu2.marks+" "+stu2.isPass);
	}

}
