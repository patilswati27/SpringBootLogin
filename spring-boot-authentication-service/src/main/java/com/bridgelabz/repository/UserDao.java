package com.bridgelabz.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bridgelabz.model.User;

public interface UserDao extends MongoRepository<User, String> {

    Optional<User> findOneByUsername(String username);
}
