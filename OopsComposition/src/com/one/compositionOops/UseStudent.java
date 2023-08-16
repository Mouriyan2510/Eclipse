package com.one.compositionOops;

public class UseStudent {
	public static void main(String [] args) {
		Student stu=new Student();
		stu.setName("Mouri");
		stu.setId(1191);
		stu.setMobileNo(8110814620l);
		stu.setMarks(100);
		System.out.println(stu.getName()+"  "+	stu.getId()+"  "+stu.getMobileNo()+"  "+stu.getMarks());
	}

}
