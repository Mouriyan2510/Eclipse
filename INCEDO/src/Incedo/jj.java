package Incedo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class jj {
	public static void main(String[] args) {
		
//		String a="09/09/1997";
//		DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		LocalDate l=LocalDate.parse(a,dt);
//		DayOfWeek d=l.getDayOfWeek();
//		System.out.println(d);
		String a="India";
		StringBuilder ff=new StringBuilder(a);
		System.out.println(ff.reverse());
		char ch[]=a.toCharArray();
		
		
		List<Character>li=new ArrayList<>();
		String c="";
		for(Character h:ch) {
			li.add(h);
		}
		
		Collections.reverse(li);
		System.out.println(li);
		//		String dateInput = "2023-09-15"; // Format: yyyy-MM-dd
//
//        // Parse the date string to a LocalDate
//        LocalDate date = LocalDate.parse(dateInput);
//
//        // Get the day of the week
//        String dayOfWeek = date.getDayOfWeek()
//            .getDisplayName(TextStyle.FULL, Locale.getDefault());
//
//        System.out.println("Day of the Week: " + dayOfWeek);
		
//		String inputDate = "25/10/1997";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate date = LocalDate.parse(inputDate, formatter);
//        DayOfWeek dayOfWeek = date.getDayOfWeek();
//        System.out.println("Day of the week: " + dayOfWeek);
        
//    	String inputDate="02/09/1997";
//    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate date = LocalDate.parse(inputDate, formatter);
//        DayOfWeek dayOfWeek = date.getDayOfWeek();
//        System.out.println("Day of the week: " + dayOfWeek);
	}

}
