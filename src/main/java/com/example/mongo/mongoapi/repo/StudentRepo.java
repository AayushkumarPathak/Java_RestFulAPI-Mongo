package com.example.mongo.mongoapi.repo;

import com.example.mongo.mongoapi.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student,Integer> {

}
