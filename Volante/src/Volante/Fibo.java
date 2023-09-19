package Volante;

import com.itextpdf.text.log.SysoCounter;

public class Fibo {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c=1;
		int d=1;
		for(int i=0;i<=a;i++) {
			System.out.println(b);
			b=c;
			c=d;
			d=b+c;
			if(b>=10) {
				break;
			}
		}
	}

}
