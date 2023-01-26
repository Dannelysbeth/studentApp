package com.dannelysbeth.mongorestfullapi.api;

import com.dannelysbeth.mongorestfullapi.model.Student;
import com.dannelysbeth.mongorestfullapi.service.definition.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/student")
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/all")
    List<Student> getAllStudents(@RequestParam Map<String, String> filters) {
        return studentService.getAllStudents();
    }

    @GetMapping("/{username}")
    Optional<Student> getStudentByUsername(@PathVariable String username) {
        return studentService.getStudentByUsername(username);
    }

}
