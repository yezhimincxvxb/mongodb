package com.yzm.mongodb01.controller;

import com.yzm.mongodb01.entity.User;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final MongoTemplate mongoTemplate;

    public UserController(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @PostMapping("/find")
    public void find() {
        List<User> users = mongoTemplate.findAll(User.class);
        users.forEach(System.out::println);
    }
}
