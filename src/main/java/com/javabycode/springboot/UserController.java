package com.javabycode.springboot;

import com.javabycode.springboot.model.User;
import org.springframework.web.bind.annotation.RestController;


@RestController
class UserController {

    public User getUser() {
        // Creating a User object directly, which can lead to issues if many parameters are added
        return new User("John Doe", 30, "john.doe@example.com");
    }
}




