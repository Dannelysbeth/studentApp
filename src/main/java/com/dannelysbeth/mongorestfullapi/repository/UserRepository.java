package com.dannelysbeth.mongorestfullapi.repository;

import com.dannelysbeth.mongorestfullapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository
        extends MongoRepository<User, String> {


}
