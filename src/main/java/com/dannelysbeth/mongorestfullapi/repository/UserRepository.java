package com.dannelysbeth.mongorestfullapi.repository;

import com.dannelysbeth.mongorestfullapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository
        extends MongoRepository<User, String> {

    boolean existsByEmail(String email);

    Optional<User> getUserByEmail(String email);

    Optional<User> getUserByUsername(String username);
}
