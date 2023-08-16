package practicing;

public class DuplicateString {
	public static void main(String[] args) {
		String[]word= {"mouri","raju","raju","mouri","ravi","ravi","kannan"};
		for(int i=0;i<word.length;i++) {
			for(int j=i+1;j<word.length;j++) {
				if(word[i].equals(word[j])) {
					System.out.println(word[i]);
				}
			}
		}
	}

}
