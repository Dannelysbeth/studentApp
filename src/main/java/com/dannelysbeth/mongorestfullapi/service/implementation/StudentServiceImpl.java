package com.dannelysbeth.mongorestfullapi.service.implementation;

import com.dannelysbeth.mongorestfullapi.exception.StudentIdentificationNumberNotFoundException;
import com.dannelysbeth.mongorestfullapi.exception.UsernameNotFoundException;
import com.dannelysbeth.mongorestfullapi.model.Student;
import com.dannelysbeth.mongorestfullapi.repository.StudentRepository;
import com.dannelysbeth.mongorestfullapi.service.definition.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public Optional<Student> getById(String id) {
        return Optional.ofNullable(
                studentRepository
                        .findById(id)
                        .orElseThrow(UsernameNotFoundException::new)
        );
    }

    @Override
    public Student getByIdentificationNumber(String identificationNumber) {

        return studentRepository.getStudentByIdentificationNumber(identificationNumber)
                .orElseThrow(StudentIdentificationNumberNotFoundException::new);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void delete(String id) {
        studentRepository.deleteById(id);
    }

    @Override
    public boolean existsByIdentificationNumber(String identificationNumber) {
        return studentRepository.existsById(identificationNumber);
    }
}
