package com.survey.reposotory;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.survey.model.survey;
@Repository
public interface surveyrepository extends MongoRepository<survey,Integer>{
   @Query("{$and :[{'minage':{$lte:?0}},{'maxage':{$gte:?0}},{'gendercriteria':?1}]}")
	List<survey> findByCriteria(int age, String gender);

}
