package com.one.task;

public class FactorialWithoutLoop {
		  public static void main(String[] args) {
		    int result = mou(1, 7);
		    System.out.println(result);
		  }
		  public static int mou(int start, int end) {
		    if (end > start) {
		      return end * mou(start, end - 1);
		    } else {
		      return end;
		    }
		  }
		

}

