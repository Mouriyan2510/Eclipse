package Gavs;

public class Fifth4 {
	public static void main(String[] args) {
		String input = "This is a test charater with dynamic indexing";
		String s[]=input.split(" ");
		System.out.print("4=> ");
		for(int i=0;i<s.length;i++) {
			if(s[i].length()==4) {
				System.out.print(s[i]+" ");
			}
		}
	}

}
