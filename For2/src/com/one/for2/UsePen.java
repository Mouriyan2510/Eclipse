package com.one.for2;

public class UsePen {
	public static void main(String[] args) {

		Pen pen1 = new Pen();
		pen1.brand = "Flair";
		pen1.price = 10;
		pen1.color = "Black";
		Pen pen2 = new Pen();
		pen2.brand = "Renolyds";
		pen2.price = 5;
		pen2.color = "BLue";
		Pen pen3 = new Pen();
		pen3.brand = "Cello";
		pen3.price = 7;
		pen3.color = "Black";
		Pen pen4 = new Pen();
		pen4.brand = "Camlin";
		pen4.price = 9;
		pen4.color = "Red";
		Pen pen5 = new Pen();
		pen5.brand = "Apsara";
		pen5.price = 6;
		pen5.color = "Yellow";
		Pen[] Pens = { pen1, pen2, pen3, pen4, pen5 };
		int c = 0;
		for (int i = 0; i <= Pens.length - 1; i++) {
			 if (Pens[i].price >= 8)
			c = c + Pens[i].price;
			// {
			// System.out.println(Pens[i].brand + "\n" + Pens[i].price + "\n" +
			// Pens[i].color);
		}
		System.out.println(c);
	}

}
