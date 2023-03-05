package com.example.login.database;

import com.example.login.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDB {

    public static List<User> users = new ArrayList<>(List.of(
            new User(1,"a","a@gmail.com","111","avatar1"),
            new User(2,"b","b@gmail.com","111","avatar2"),
            new User(3,"c","c@gmail.com","111","avatar3")
    ));
}
