package com.dannelysbeth.mongorestfullapi.api;

import com.dannelysbeth.mongorestfullapi.exception.UsernameNotFoundException;
import com.dannelysbeth.mongorestfullapi.model.Student;
import com.dannelysbeth.mongorestfullapi.service.definition.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/student")
public class StudentController {
    private final StudentService studentService;

    @Secured("ROLE_USER")
    @GetMapping("/all")
    List<Student> getAllStudents() {
        return studentService.getAll();
    }

    @Secured("ROLE_ADMIN")
    @GetMapping("/{identificationNumber}")
    Optional<Student> getStudentByIdentificationNumber(@PathVariable String identificationNumber) {
        return Optional.ofNullable(
                studentService
                        .getByIdentificationNumber(identificationNumber)
                        );
    }
}
