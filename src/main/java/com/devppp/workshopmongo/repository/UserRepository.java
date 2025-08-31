package com.devppp.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.devppp.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
