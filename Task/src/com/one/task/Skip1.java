package com.one.task;

public class Skip1 {
	public static void main(String[] args) {
		String a="abc123def";
		StringBuilder s=new StringBuilder();
		s.append(a);
		s.reverse();
//		System.out.println(s);
		
		String b="";
		String d="";
		char[] ch=a.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			if(ch[i]!='1') {	
			b=b+ch[i];
			}
		}
		System.out.println(b);
	}

}
