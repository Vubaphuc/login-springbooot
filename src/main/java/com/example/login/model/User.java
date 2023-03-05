package com.example.login.model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class User {
    private int id;
    private String userName;
    private String email;
    private String password;
    private String avatar;
}
