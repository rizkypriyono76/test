package com.fr.go.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fr.go.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>{

}
