package com.cybage.Java8Demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapToIntExample extends User  {
	
	
private static boolean isNotSame(String name) {
		
		return !name.equals("Radha");
	}
	public static void main(String[] args) {
	
		List<String> names = Arrays.asList("khushboo","Deepak","Radha","Shubhi","Neha");
		
		List<User> userList= names.stream()
				.filter(MapToIntExample::isNotSame)
				.map(User::new)
				.collect(Collectors.toList());
		
		System.out.println("Users list with their name and age"+userList);
		
		System.out.println(".............................................");
		
		//using lambda expression
		System.out.println("We are maping and accumulatinmg  by adding users age ...for that we are iterating thriugh thus existing user list");
	int sum =userList.stream()
			         .mapToInt(user->{
		                              return user.getAge();
	                                 })
	                 .sum();
	System.out.println("Sum of users age is"+sum);
	//using method reference
	int sums =userList.stream()
			           .mapToInt(User::getAge)
                       .sum();
System.out.println("Sum of users age is"+sums);
	

}
}