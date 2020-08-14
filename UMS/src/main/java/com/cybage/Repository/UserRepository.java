package com.cybage.Repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cybage.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public User findByUsername(String username);
	
	public User findByUsernameAndRoles(String username,  String roles);

    public List<User> findUserByRoles(String roles);
    
   
	
/*	@Query(value="select * from User where username like:username and roles like:roles",nativeQuery=true )
	public Optional<User> findByUsernameAndRoles(@Param("username")String username, @Param("roles") String roles);*/


	/*  @Query(
		        value = "SELECT * FROM user t where t.username = :username AND t.roles = :roles", 
		        nativeQuery=true
		    )
		    public Optional<User> findByUsernameAndRoles(@Param("username") String username, 
		                                                    @Param("roles") String roles);
		*/
    /*@Query(value="select * from User where username like:username and roles like:roles",nativeQuery=true )
      public Optional<User> findByUsernameAndRoles(String username,  String roles);*/
	  
	 
	  
	  //public Optional<User> findByUsernameAndRoles(String username,  String roles);
	  
	 
}


