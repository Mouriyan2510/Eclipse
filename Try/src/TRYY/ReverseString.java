package TRYY;

public class ReverseString {
	public static void main(String[] args) {
		String a="Automation";
//		String b="";
//		char ch[]=a.toCharArray();
//		for(int i=ch.length-1;i>=0;i--) {
//			b=b+ch[i];
//		}
//		System.out.println(b);
		
		StringBuilder b=new StringBuilder();
		b.append(a);
		b.reverse();
		System.out.println(b);
	}

}
