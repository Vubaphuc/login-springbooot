package com.example.login.reponsitory;


import com.example.login.database.UserDB;
import com.example.login.model.User;
import com.example.login.request.LoginRequest;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserReponsitory {
    public Optional<User> getUserByRequest(LoginRequest request) {
        return UserDB.users.stream()
                .filter(user -> user.getUserName().equals(request.getUserName())
                        && user.getPassword().equals(request.getPassword()))
                .findFirst();
    }
}
