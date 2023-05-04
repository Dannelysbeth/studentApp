package com.dannelysbeth.mongorestfullapi.repository;

import com.dannelysbeth.mongorestfullapi.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    Optional<Student> getStudentByIdentificationNumber(String identificationNumber);


}
