package practicing;

public class ReverseNum {
	public static void main(String[] args) {
		int a=98763000;
		int b=0;
		int c;
//		while(a!=0) {
//			c=a%10;
//			if(c==0) {
//				System.out.print(c);
//			}
//			b=(b*10)+c;
//			a=a/10;
//			}
//		System.out.println(b);
		int d=986003000;
		StringBuffer z=new StringBuffer(String.valueOf(d));
		z.reverse();
		System.out.println(z);
	}

}
