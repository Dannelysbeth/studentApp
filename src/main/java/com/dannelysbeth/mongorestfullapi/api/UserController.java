package com.dannelysbeth.mongorestfullapi.api;

import com.dannelysbeth.mongorestfullapi.model.User;
import com.dannelysbeth.mongorestfullapi.service.definition.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/all")
    List<User> getAllStudents(@RequestParam Map<String, String> filters) {
        return userService.getAll();
    }

    @GetMapping("/{username}")
    Optional<User> getStudentByUsername(@PathVariable String username) {
        return userService.getByUsername(username);
    }

}
