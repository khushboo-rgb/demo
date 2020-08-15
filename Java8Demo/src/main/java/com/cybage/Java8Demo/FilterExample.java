package com.cybage.Java8Demo;

import java.util.Arrays;
import java.util.List;


public class FilterExample {
	

	private static boolean isNotSame(String name) {
		
		return !name.equals("Radha");
	}

	public static void main(String[] args) {
		List<String> names = Arrays.asList("khushboo","Deepak","Radha","Shubhi","Neha");
		
		System.out.println("....................Traditional way.................");
		//traditional way to iterate through list and do filtering by print the names except radha 
     System.out.println("traditional way to iterate through list and do filtering by print the names except radha");
		for(String name:names)
		{
			if(!name.equals("Radha"))
			{
				System.out.println("Name"+"  "+name);
			}
			
		}
		
		System.out.println("if you want to print the whole list");
		for(String name:names)
		{
			
			//if you want to print the whole list
			System.out.println("Name"+"  "+name);
		}
		
		System.out.println("..................Functional Programming.............");
		
		System.out.println("function way  to do that using lambda expression\r\n" + 
				"		this predicate is a functional interface");
		//function way  to do that using lambda expression
		//this predicate is a functional interface
		names.stream()
		.filter(name ->!name.equals("Radha"))
		.forEach(System.out::println);
		
		//Simply print the streams or array data without doing any filtering
		System.out.println("Simply print the streams or array data without doing any filtering");
		names.stream().forEachOrdered(System.out::println);
		
		
		//more readable way to do that using method reference
		System.out.println("more readable way to do that using method reference");
		names.stream()
		.filter(FilterExample::isNotSame)
		.forEach(System.out::println);
		
		
		
	}

	
	

}
