package exper;

import java.util.Scanner;


public class Prime {
	public static void main(String[] args) {
		int[] a = { 9, 5, 8, 65, 1, 45, 78, 2 ,71,7};
		int flag=0;
		int i,j=0;
		
		for (i = 0; i < a.length; i++) {
            if(a[i]>1) {
            flag=0;
            for ( j = 2; j < a[i]; j++) {
                if (a[i] % j == 0) {
                    flag = 1;
                    break;
                }
            }
            }
            if(flag==0) {
            	System.out.println("Prime:" + a[i]);
            }
            else {
            	System.out.println("NotPrime:"+a[i]);
            }
//            System.out.println(a[i] + " - " + (flag == 0 ? "Prime" : "Not Prime"));
		}
		}
	}

