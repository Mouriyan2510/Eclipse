package com.one.task;

public class OneDuplicates {
	public static void main(String [] args) {
	String word="onesofttechnologies";
	char[]ch=word.toCharArray();
	
//	int i,j,l;
//	
//	for(i=0;i<word.length();i++) {
//		l=0;
//		for(j=i+1;j<word.length();j++) {
//			if(ch[i]==ch[j]) {
//				l=l+1;
//			}
//			else {
//				break;
//			}
//		}
//		i=j-1;
//		if(l>0) {
//			System.out.println(ch[i]+"----"+l);
//		}
//	}
	
	int g=0;
	for(int i=0;i<word.length();i++) {
		for(int j=i+1;j<word.length();j++) {
			if(ch[i]==ch[j]) {
				System.out.println(ch[j]+"---->");
				break;//onesofttechnologies
			}
		}
	}
	
//	String chara="";
//	String dupli="";
//	for(int i=0;i<word.length();i++) {
//		String curr=Character.toString(word.charAt(i));
//		if(chara.contains(curr)) {
//			if(!dupli.contains(chara)) {
//			dupli=dupli+curr+" ";
//		}
//		}
//		chara=chara+curr;
//	}
//	System.out.println(dupli);
}
}
