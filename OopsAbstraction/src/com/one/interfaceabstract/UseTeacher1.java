package com.one.interfaceabstract;

public class UseTeacher1 {
	public static void main(String [] args) {
		Teacher1 t=new Teacher1();
		System.out.println(t.name("Pugazh"));
		t.gender("MALE");
		System.out.println(t.age(27));
		System.out.println(t.salary(70000));
		System.out.println(t.designation("JAVA"));
	}

}
