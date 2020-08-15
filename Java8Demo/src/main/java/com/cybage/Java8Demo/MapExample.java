package com.cybage.Java8Demo;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class MapExample extends User{

private static boolean isNotSame(String name) {
		
		return !name.equals("Radha");
	}
	public static void main(String[] args) {
		System.out.println("mapping usernsme with their age");
		
		List<String> names = Arrays.asList("khushboo","Deepak","Radha","Shubhi","Neha");
	
		System.out.println("3........More radabel format....Functional way...........using method reference syntax classname::method name");
	names.stream()
	.filter(MapExample::isNotSame)
	.map(User::new)
	.forEach(System.out::println);
	
	System.out.println("1 Less readable using lambda expression");
	
	names.stream()
	.filter(MapExample::isNotSame)
	.map(name->{
		User user =new User(name);
		return user;
	}).forEach(System.out::println);
	
System.out.println("2 Less readable using lambda expression");
	
	names.stream()
	.filter(MapExample::isNotSame)
	.map(name->{
	return 	new User(name);
	})
	.forEach(System.out::println);
		
	
	System.out.println(".............Traditional way........of doing mapping username with their age............. .");
	
	for(String name:names)
	{
		if(!name.equals("Radha"))
		{
			User user = new User(name); 
			System.out.println("names"+user);
		}
		
	}
	
	System.out.println(".............If we dont want to print.... if we want to accumulate");
	System.out.println("We should store it into a list because it is returning a list of mapped exisiting username with their age ");
	
	List<User> userList=names.stream()
	.filter(MapExample::isNotSame)
	.map(User::new)
	.collect(Collectors.toList());
	
	System.out.println(""+userList);
	}
	
	
}
