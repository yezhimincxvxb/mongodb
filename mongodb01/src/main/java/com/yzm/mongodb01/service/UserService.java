package com.yzm.mongodb01.service;

import com.yzm.mongodb01.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserService extends MongoRepository<User, String> {
}
