package com.example.login.request;


import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class LoginRequest {
    @NotNull(message = "UserName không được để trống")
    private String userName;
    @NotNull(message = "Passwork không được để trống")
    private String password;
}
