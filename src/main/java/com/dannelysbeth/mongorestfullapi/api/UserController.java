package com.dannelysbeth.mongorestfullapi.api;

import com.dannelysbeth.mongorestfullapi.model.User;
import com.dannelysbeth.mongorestfullapi.service.definition.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/user")
public class UserController {

    private final UserService userService;

//    @Secured("ROLE_USER")
    @GetMapping("/all")
    List<User> getAllStudents(@RequestParam Map<String, String> filters) {
        return userService.getAll();
    }

    @Secured("ROLE_ADMIN")
    @GetMapping("/{username}")
    Optional<User> getStudentByUsername(@PathVariable String username) {
        return userService.getByUsername(username);
    }

}
