package com.mypkg;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		
		List<String> li=Arrays.asList("Karur","Chennai","Coimbatore","Erode","Chennai");
//		for(String s: li) {
//			System.out.println(s);
//		}
//		//new way 1
//		li.forEach(s -> System.out.println(s));
//		
		
//		//new way 2
//		li.forEach(System.out::println);
//		
//		//new way 3
//		li.stream().filter(s -> s.startsWith("C") ).forEach(System.out::println) ;
//		
//		
		//new way 4
		System.out.println("************");
		li.stream().filter(s -> s.startsWith("C") ).map(s -> s.toUpperCase()).forEach(System.out::println) ;
		
		
		
	}
      
	
	
}
