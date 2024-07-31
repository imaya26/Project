package com.mypkg;

import java.util.ArrayList;
import java.util.List;

public class StreamMain {
     static List<String> places= new ArrayList<>();
     public static List getPlace() {
    	 places.add("Nepal, Kathmandu");
    	 places.add("Nepal, Pokhara");
    	 places.add("India, Delhi");
    	 places.add("India, Tamil Nadu");
    	 places.add("India, Chennai");
    	 places.add("USA, New York");
    	 places.add("Africa, Nigeria");
    	 
    	 return places;
     }
     public static void main(String args[]) {
    	 List<String> myplaces = getPlace();
    	 System.out.println("Places from India:");
    	 
    	 myplaces.stream()
    	          .filter((p) -> p.startsWith("India")) //retrive required data
    	          .map((p) -> p.toUpperCase())  // perform manipulation
    	          .sorted()          //apply ordering
    	          .forEach((p) -> System.out.println(p)); //traversing/printing
     }
}
