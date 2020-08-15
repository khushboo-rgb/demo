package com.cybage.Java8Demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class FlatMapExample extends UserData {

	public static void main(String[] args) {
		
		//internally this list works as a pojo having a list of phone numbers
		
        List<UserData> users = Arrays.asList(
        		new UserData(30,"Deepak",Arrays.asList("1","2","3")),
        		new UserData(20,"khushboo",Arrays.asList("6","7","8")),
        		new UserData(10,"santa",Arrays.asList("9","21","73")),
        		new UserData(60,"radha",Arrays.asList("11","23","37")),
        		new UserData(90,"neha",Arrays.asList("11","12","13"))
        				);
        System.out.println("users"+users);
        
        //if we want to identify a phone number matching with a particular user lets say number 6
        	
	 System.out.println("if we want to identify a phone number matching with a particular user lets say number 6 ............");
	
	Optional<String> stringOptional= users.stream()
	 .map(user -> user.getPhoneNumbers().stream())//by this we are getting stream is array list of phone numbers from user stream
	 .flatMap(stringStream->stringStream.filter(phoneNo->phoneNo.equals("6")))
     .findAny();
	 
	//this stringOptional is also an stream so we can perform any operation over this like we perform over other streams
	stringOptional.ifPresent(System.out::println);

	}
	
}
