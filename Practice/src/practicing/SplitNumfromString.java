package practicing;

public class SplitNumfromString {
	public static void main(String[] args) {
		String a="12jk666sky387";
		char[]ch=a.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]<96) {
				if(ch[i]%2==0) {
				System.out.println(ch[i]+" divisible by 2");
				}
			}
			else {
//				System.out.println(ch[i]);
			}
		}
	}

}
