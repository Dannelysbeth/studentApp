package com.dannelysbeth.mongorestfullapi.service.definition;

import com.dannelysbeth.mongorestfullapi.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Optional<Student> getById(String id);

    Student getByIdentificationNumber(String identificationNumber);

    List<Student> getAll();

    Student save(Student student);

    void delete(String id);

    boolean existsByIdentificationNumber(String identificationNumber);
}
