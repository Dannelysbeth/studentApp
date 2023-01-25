package com.dannelysbeth.mongorestfullapi.service.definition;

import com.dannelysbeth.mongorestfullapi.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface StudentService {

    Optional<Student> getStudentById(String id);

    Optional<Student> getStudentByEmail(String email);
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    void deleteStudent(String id);
}
