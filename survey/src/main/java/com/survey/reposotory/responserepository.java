package com.survey.reposotory;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.survey.model.response;

@Repository
public interface responserepository extends MongoRepository<response,Integer>{
    @Query("{$and :[{'uid':?0},{'rid':?1}]}")
	List<response> findresponseByUIDandRid(int i, int j);
	
	 @Query("{'uid':?0}")
	List<response> findUid(int uid);

}
