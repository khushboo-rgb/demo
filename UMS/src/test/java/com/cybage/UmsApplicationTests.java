package com.cybage;



import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cybage.Repository.UserRepository;
import com.cybage.model.User;
import com.cybage.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UmsApplicationTests {
   
	@Autowired
	private UserService userService;
	@MockBean
	private UserRepository userRepository;
	
	@Test
	public void getUsers()
	{
		when(userRepository.findAll())
		.thenReturn(Stream.
				of(new User((long) 101,"pass","khus","user",""),new User((long) 102,"","khusi","admin",""))
				.collect(Collectors.toList()));
		assertEquals(2, userService.getAllUser().size());
	}
	
	@Test
	public void getUserByRolesTest()
	{
		String roles ="user";
		when(userRepository.findUserByRoles(roles))
		.thenReturn(Stream
				.of(new User((long) 101,"pass","khus","user",""))
				.collect(Collectors.toList()));
		assertEquals(1, userService.getUserByRole(roles).size());
	}

	
	
	@Test
	public void saveUserTest()
	{
		User user = new User((long) 103,"aksh","akshay","akshita","");
		when(userRepository.save(user)).thenReturn(user);
		assertEquals(user, userService.addUsers(user) ,"user Saved");
	}
	
	
	@Test
	public void deleteUserTest()
	{
		Long id= (long) 103;
		userService.deleteUserById((long) 103);
		verify(userRepository,times(1)).deleteById(id);
		
            
	}
	
	

	
}
