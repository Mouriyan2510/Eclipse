package com.one.compositionOops;

public class UseLibrary {
	public static void main(String [] args)
	{
		Books b1=new Books();
		b1.author="Shakespeare";
		b1.title="Romeo Juliet";
		b1.price=1000;
		b1.pubish=1873;
	Library l1=new Library();
	l1.location="Chennai";
	l1.rack=12;
	l1.address="Omr";
	l1.isNewspaper=true;
	l1.books=b1;
	System.out.println(l1.location+" "+l1.rack+" "+l1.address+" "+l1.isNewspaper);
	System.out.println(l1.books.author+" "+l1.books.title+" "+l1.books.title+" "+l1.books.price+" "+l1.books.pubish);
	}

}
