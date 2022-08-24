package com.rakovets.course.java.core.practice.class_work;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private List<User> usersList = new ArrayList<>();

    public List<User> getUsersList() {
        return usersList;
    }

    public void addUser(User user) {
        usersList.add(user);
    }
}
