package com.camargo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.camargo.domaim.User;

@Repository
public interface userRepository extends MongoRepository <User, String> {

}
