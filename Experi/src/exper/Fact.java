package exper;

public class Fact {
//	public static void main(String[] args) {
//		int a=6;
//		int b=1;
//		for(int i=a;i>=1;i--) {
//			b=b*i;
//		}
//		System.out.println(b);
//	}
	
	public static int factorial(int a) {
		if(a==0||a==1) {
			return 1;
		}
		else {
			return a* factorial(a-1);
		}
	}
	
	public static void main(String[] args) {
		int r=5;
		int a=factorial(r);
		System.out.println(a);
	}

}
