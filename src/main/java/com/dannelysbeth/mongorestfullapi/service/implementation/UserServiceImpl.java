package com.dannelysbeth.mongorestfullapi.service.implementation;

import com.dannelysbeth.mongorestfullapi.model.User;
import com.dannelysbeth.mongorestfullapi.repository.UserRepository;
import com.dannelysbeth.mongorestfullapi.service.definition.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Transactional
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public Optional<User> getById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<User> getByUsername(String username) {
        return userRepository.getUserByUsername(username);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
