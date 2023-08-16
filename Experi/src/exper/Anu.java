package exper;

public class Anu {
	public static void main(String[] args) {
		 String[] strs = {"anu", "aupriya", "anuprabha"};
		 boolean b=true;
		 for(int i=0;i<strs.length;i++) {
			 if(strs[0].contains(strs[i])) {
				 b=true;
			 }
			 else {
				 b=false;
			 }
		 }
		 if(b=true) {
			 System.out.println("True");
		 }
		 else {
			 System.out.println("False");
		 }
	}
	

}
