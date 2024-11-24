package com.personal.todoapp.authentication;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor @Getter @Setter
public class LoginUserDTO {
    private String email;
    private String password;
}
