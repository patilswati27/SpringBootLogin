package com.bridgelabz.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bridgelabz.entity.User;

public interface UserDao extends MongoRepository<User, String> {

    Optional<User> findOneByUsername(String username);
}
