package practicing;

public class StringManipulation {
	public static void main(String[] args) {
		String a="Nani";
		String b="Pallavi";
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
	}

}
