package Incedo;

public class Fibo {
	public static void main(String[] args) {
//		int a=10;
//		int b=0;
//		int c=1;
//		int d=1;
//		for(int i=0;i<=a;i++) {
//			System.out.println(b);
//			b=c;
//			c=d;
//			d=b+c;
//		}
		for(int i=0;i<=9;i++) {
		System.out.println(fibo(i));
		}
	}
	private static int fibo(int a) {
		if(a==0||a==1) {
			return a;
		}
		else {
			return fibo(a-1) + fibo(a-2);
		}
	}

}
