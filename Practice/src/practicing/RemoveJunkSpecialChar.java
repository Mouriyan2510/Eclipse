package practicing;

public class RemoveJunkSpecialChar {
	public static void main(String[] args) {
		String a="Mou ri  ya  !@#$%^&*(){}||||~!@#$%^&*() n  A n na!@#$ d u r a i ";
		String b=a.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(b);
	}
}
