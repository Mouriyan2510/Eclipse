package MultiThread;

public class SampleMultiThread {
	public static void main(String[] args) {
		Thread run = new Thread(() -> {
			for (int i = 0; i <= 9; i++) {
				System.out.print(i);
			}
		});
		run.start();

		Thread run2 = new Thread(() -> {
			for (char i = 'a'; i <= 'g'; i++) {
				System.out.print(i);
			}
		});
		run2.start();
	}

}
//run.getState();
//long s=run.getId();
//System.out.println(s);
//System.out.println(run.currentThread());
//run.setPriority(Thread.MAX_PRIORITY);
//System.out.println(run2.getPriority());
//run.setName("Mouriyan");
//System.out.println(run2.getName());