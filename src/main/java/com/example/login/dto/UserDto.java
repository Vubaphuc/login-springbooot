package com.example.login.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class UserDto {
    private String userName;
    private String email;
    private String avatar;
}
