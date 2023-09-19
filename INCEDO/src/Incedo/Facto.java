package Incedo;

public class Facto {
	
	
	public static void main(String[] args) {
//		int a=5;
//		int b=1;
//		for(int i=1;i<=a;i++) {
//			b=b*i;
//		}
//		System.out.println(b);
		
		System.out.println(factorial(5));
		
	}
	private static int factorial(int a) {
		if(a==0||a==1) {
			return a;
		}
		else {
			return a * factorial(a-1);
		}
	}
}
