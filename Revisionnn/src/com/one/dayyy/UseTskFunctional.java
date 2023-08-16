package com.one.dayyy;

import java.util.Arrays;
import java.util.List;

public class UseTskFunctional {
	public static void main(String [] args) {
//		TaskFunctionalInter ti=(a)->{
//			for(int i=1;i<a.length;i++) {
//				if(a[i]%3==0 && a[i]%2!=0) {
//					System.out.println(a[i]);
//				}
//			}
//		};
//		int[]a= {1,3,5,6,8,9,6,89,9,15,21,18};
//		ti.get(a);//int [] array
		
		TaskFunctionalInter ti=(a)->{
			for(int i=0;i<a.size();i++) {
				if(a.get(i).contains("a")||a.get(i).contains("e")||a.get(i).contains("i")||a.get(i).contains("o")||a.get(i).contains("u")) {
					continue;
				}
				else {
					System.out.println(a.get(i));
				}
			}
			
		};
		
		List<String>a=Arrays.asList("bt","ct","naveen","varun","kathir","hy");
		
		ti.get(a);
	}

}
