package com.tnsif.StreamApi;

import java.util.Arrays;
import java.util.List;
public class StreamAPI {

	public static void main(String[] args) {
		
		List<String> names =Arrays.asList("keerthana","nikki","naveen","laxmi");
		
		names.stream().forEach(name-> System.out.println(" heyy "+name));
		
		List<Integer> numbers =Arrays.asList(2,1,35,4,50,60);
		
		System.out.println("Even Numbers...");
		numbers.stream().filter(number->number%2==0).forEach(System.out::println);
	}

}



