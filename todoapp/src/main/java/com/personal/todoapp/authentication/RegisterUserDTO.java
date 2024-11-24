package com.personal.todoapp.authentication;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class RegisterUserDTO {
    private String email;
    private String username;
    private String password;
}
