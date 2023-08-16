package com.one.task;

public class Second {
	public static void main(String [] args) {
		String z="abbccc";
		char[] ar=z.toCharArray();
		int count=0;
		int i,j;
		for( i=0;i<ar.length;i++) 
		{	
			count = 0;
			for( j=i+1;j<ar.length;j++) 
			{
				if(ar[i]==ar[j]) 
				{
					count=count+1;
				}
				else {
					break;
				}
			}
//			System.out.println(ar[i] + " - " + (count >= 1 ? "Duplicate" : "Not Duplicate"));
			i=j-1;
			if(count>0)
			{
				System.out.println(ar[i]);
			}
		}
		
//		for (int k=0; k<ar.length; k++)
//	    {
//	        int l;
//	        for (l=0; l<k; l++)
//	           if (ar[k] == ar[l])
//	               break;
//	 
//	        if (k == l)
//	        	System.out.println(ar[k]);   //print unique 
//	        }
		
		
	
	}
}
