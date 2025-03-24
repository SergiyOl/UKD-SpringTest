package com.testspring.ukd.testspr.service;

import java.util.ArrayList;
import java.util.List;
import com.testspring.ukd.testspr.model.*;;

public class UserService {
    private final List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new User(0, "Serhii", "myemail@gmail.com"));
        users.add(new User(1, "John", "hisemail@gmail.com"));
        users.add(new User(2, "Kate", "heremail@gmail.com"));
    }

    public List<User> getAllUsers() {
        return users;
    }
}