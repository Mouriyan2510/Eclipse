package MultiThread;

class TestCallRun2 extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++){  
	    System.out.println(i);  
	  }  
	  
	 
	 }  
	 public void get() {
		  System.out.println("Mouri");
	  }
	 public static void main(String args[]){  
	  TestCallRun2 t1=new TestCallRun2();  
	  t1.get(); 
	  t1.run();  
	  
	 }  
	}  