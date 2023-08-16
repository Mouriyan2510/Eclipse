package exper;

public class Random {
	public static void main(String[] args) {
		java.util.Random random=new java.util.Random();
		random.ints().limit(5).forEach(System.out::println);
	}

}
