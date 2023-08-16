package exper;

public class Palindrome {
	
	public static void main(String[] args) {
		String a="MAdam";
		char ch[]=a.toCharArray();
		String c="";
		for(int i=ch.length-1;i>=0;i--) {
			c=c+ch[i];
		}
		if(a.equalsIgnoreCase(c)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
