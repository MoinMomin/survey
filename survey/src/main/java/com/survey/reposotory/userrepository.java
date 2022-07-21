package com.survey.reposotory;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.survey.model.users;
@Repository
public interface userrepository extends MongoRepository<users,Integer>{
    @Query("{'name':?0}")
	users getUserByUsername(String username);
	

}
