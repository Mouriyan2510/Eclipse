package MultiThread;

public class UseEthread {
	public static void main(String[] args) {
		Ethread e=new Ethread();
		Ethread1 e1=new Ethread1();
//		e.run();
//		e.start();
		e1.start();
		e1.run();
	}
}
