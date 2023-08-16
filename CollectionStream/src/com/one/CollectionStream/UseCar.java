package com.one.CollectionStream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseCar {
	public static void main(String [] args) {
		Car c1=new Car("Maruti",500000,"white",3.5f,"swift","TN21BP9908","Diesel");
		Car c2=new Car("Datsun",400000,"blue",4.5f,"redigo","TN11BP0008","Petrol");
		Car c3=new Car("Audi",900000,"white",4.0f,"a6","Nl90BP9908","Petrol");
		Car c4=new Car("Ferrai",800000,"black",5.0f,"f1","GJ21BP9908","Ev");
		Car c5=new Car("Jaguar",990000,"white",2.5f,"SPACE","TN21BP9908","Diesel");
		Car c6=new Car("TATA",300000,"yellow",1.5f,"NANO","TN90HP9908","Petrol");
		
		HashMap <String,Car> cars=new HashMap <> ();
		cars.put(c1.getPlate(), c1);
		cars.put(c2.getPlate(), c2);
		cars.put(c3.getPlate(), c3);
		cars.put(c4.getPlate(), c4);
		cars.put(c5.getPlate(), c5);
		cars.put(c6.getPlate(), c6);
		Map<String,Car>n=cars.values().stream().filter(x-> x.getPrice()>500000 && x.getPrice()<1000000).collect(Collectors.toMap(o-> o.getPlate(), y-> y));	    	
//		n.values().forEach(r-> System.out.println(r));
		List<Car>nn=cars.values().stream().filter(x-> x.getPrice()>=500000 && x.getColor().equalsIgnoreCase("white")).collect(Collectors.toList());	    	
		nn.forEach(r-> System.out.println(r));
	}

}


